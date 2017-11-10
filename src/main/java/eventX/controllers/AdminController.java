package eventX.controllers;


import eventX.domain.DateUtil;
import eventX.domain.StatisticsVO;
import eventX.repository.LoginRepository;
import eventX.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @Autowired
    private LoginService service;

    @RequestMapping(value="/admin0564044", method = RequestMethod.GET)
    public ModelAndView adminPanel() {
        return new ModelAndView("adminPage")
                .addObject("statistics", new StatisticsVO())
                .addObject("calendar", DateUtil.getCalendar());
    }
}
