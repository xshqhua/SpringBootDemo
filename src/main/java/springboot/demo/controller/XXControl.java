package springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class XXControl {
    @RequestMapping("/xx")
    public ModelAndView xx() {
        System.out.println("xxxxxxxxxxxxxxxxx");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index22.html");
        return modelAndView;
    }
}
