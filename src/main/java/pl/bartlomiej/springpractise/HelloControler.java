package pl.bartlomiej.springpractise;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {


    @RequestMapping("/hello")
    public String sayHi(){

        return "Hi";
    }

}
