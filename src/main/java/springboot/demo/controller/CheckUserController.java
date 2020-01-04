package springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springboot.demo.bean.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller

public class CheckUserController {
    private static final Logger log = LoggerFactory.getLogger(CheckUserController.class);

    @RequestMapping("/xx")
    public void index(HttpServletRequest request, HttpServletResponse response) {
        log.info("首页");
        try {
            request.getRequestDispatcher("/WEB-INF/index.html").forward(request, response);
            return;
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/checkUserName.do")
    public String checkUserName() {
        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        model.addAttribute("msg", "xxxxxx");*/
        return "page/home.html";
    }
}
