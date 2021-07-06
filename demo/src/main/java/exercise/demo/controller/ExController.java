package exercise.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExController {

    @GetMapping("hello")    //http://localhost:8080/hello와 연동
    public String hello(Model model) {
        model.addAttribute("data","쩌에요!!");
        return "hello";     //hello.html로 이동

    }
}
