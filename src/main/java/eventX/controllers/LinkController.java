package eventX.controllers;

import eventX.domain.Activity;
import eventX.domain.DateUtil;
import eventX.service.ActivityService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("activity")
public class LinkController {
    private static final Logger log = Logger.getLogger(LinkController.class);

    @Autowired
    private ActivityService activityService;

    @ModelAttribute ("activity")
    public Activity addActivity() {
        return new Activity();
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView mainPage() {
        Activity activity= new Activity();
        return new ModelAndView("index").addObject("activity", activity)
                .addObject("calendar", DateUtil.getCalendar());
    }

    @RequestMapping(value="/index" , method = RequestMethod.GET)
    public ModelAndView indexPage() {
        Activity activity= new Activity();;
        return new ModelAndView("index").addObject("activity", activity)
                .addObject("calendar", DateUtil.getCalendar());
    }

    @RequestMapping(value = "/index/{name}", method = RequestMethod.POST)
    public ModelAndView indexForm(@PathVariable String name,
                                  @ModelAttribute("order") Activity activity) {
        return new ModelAndView("redirect:/activity/" + name).addObject("activity",activity);
    }
}
