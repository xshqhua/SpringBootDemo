package springboot.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CheckUserController {
    @RequestMapping(path = {"/checkUserName"}, method = {RequestMethod.GET})
    public ModelAndView checkUserName(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("META-INF/index.html");
        modelAndView.setStatus(HttpStatus.ACCEPTED);
        return modelAndView;
    }
}
