package exercise.demo.controller;

import org.apache.tomcat.util.net.TLSClientHelloExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExController {

    @GetMapping("hello")    //URL주소 http://localhost:8080/hello
    public String hello(Model model) {
        model.addAttribute("data","쩌에요!!");
        return "hello";     //hello.html로 이동
    }

    @GetMapping("hello-mvc")       //URL주소 http://localhost:8080/hello-mvc?name=넣을변수
    public String helloMvc(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";       //hello-template.html로 이동
    }

    @GetMapping("hello-string")     //URL주소 http://localhost:8080/hello-string?name=넣을변수
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello "+name;
    }

    @GetMapping("hello-api")        //URL주소 http://localhost:8080/hello-api?name=넣을변수
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
