package caoyh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWord {

    @RequestMapping("/spring.do")
    public ModelAndView hello() {
        System.out.println("【Hello Spring!】");
        return new ModelAndView("hellospring");
    }
}
