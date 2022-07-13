package com.elsoprojekt.webProjekt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Ez lesz a kontroller, küldünk egy requestet, ő pedig válaszol rá.
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String homePage(){
        return"index";
    }
    @RequestMapping("/index")
    public String homePageSecond(){
        return"index";
    }
    @RequestMapping("/computers")
    public String topOffers(){
        return"computers";
    }
    @RequestMapping("/processors")
    public String processor(){
        return "processors";
    }
    @RequestMapping("/gpus")
    public String gpu(){
        return "gpus";
    }
    @RequestMapping("/login")
    public String log(){
        return "login";
    }
    @RequestMapping("/basket")
    public String basket(){
        return "basket";
    }
}
