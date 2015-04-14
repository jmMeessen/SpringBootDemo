package org.devbox;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
    	String str = "<center><h1><br/>Hello MIX-IT!</h1>";
    	str = str + "<br/><h2>Happy to be in Lyon.</h2></center>";
        return str;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}

