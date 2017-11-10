package eventX.controllers;

import eventX.domain.Role;
import eventX.domain.User;
import eventX.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.social.FacebookAutoConfiguration;
import org.springframework.boot.autoconfigure.social.TwitterAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private TwitterAutoConfiguration twitter;

    @Autowired
    private FacebookAutoConfiguration facebook;

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User populateUser() {
        return new User();
    }

    @RequestMapping(value="/auth",method = RequestMethod.GET)
    public ModelAndView loginPage(HttpSession session){
        ModelAndView mav = new ModelAndView("login");
        String sID = session.getId();
        mav.addObject("sId",sID);
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value="/auth", method= RequestMethod.POST)
    public String userAuth(@Valid @ModelAttribute("user") User user, BindingResult result, Model model){
        if(result.hasErrors()){
            logger.info("Unsuccessful login attemmpt");
            return "login";
        }
        if(userService.checkUser(user.getEmail(), user.getPassword())){
            logger.info("user is logged: " + user.getEmail());
            user.setIsAuthenticated(true);
            user.setRole(Role.valueOf(userService.getRole(user.getEmail())));
            return "redirect:/index.html";
        }else{
            model.addAttribute("message", "invalid email");
            return "login";
        }
    }

    //toDo Twitter and Facebook login


    @RequestMapping(value="logout", method= RequestMethod.GET)
    public ModelAndView logout(@ModelAttribute("user") User user){
        user.setIsAuthenticated(false);
        logger.info("user is logout: " + user.getEmail());
        return new ModelAndView("redirect:/index");
    }

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public ModelAndView createNewUser(@Valid @ModelAttribute("user") User user, BindingResult result, final RedirectAttributes attributes){
        if(result.hasErrors()) return new ModelAndView("register-form");

        user.setRole(Role.ROLE_USER);
        logger.info("New user" + user.getEmail());
        userService.addUser(user);

        ModelAndView mav = new ModelAndView();
        String msg = "Welcome, Account was successful created!";
        mav.setViewName("redirect:/user/auth.html");
        attributes.addFlashAttribute("Mesage", msg);
        return mav;
    }
}