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
    @RequestMapping("/topOffers")
    public String topOffers(){
        return"topOffers";
    }
    @RequestMapping("/processors")
    public String processor(){
        return "processors";
    }
    @RequestMapping("/gpus")
    public String gpu(){
        return "gpus";
    }
    @RequestMapping("/register")
    public String reg(){
        return "register";
    }
}
