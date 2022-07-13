package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.UserService;
import com.elsoprojekt.webProjekt.registerValid;
import com.elsoprojekt.webProjekt.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class registerController implements WebMvcConfigurer {
    private final UserService userService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/successRegister").setViewName("successRegister");
    }

    public registerController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/register")
    public ModelAndView registerGet(User user, registerValid registerValid) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/register");
        return mav;
    }
    @PostMapping("/register")
    public ModelAndView registerPost(@Valid registerValid registerValid, BindingResult bindingResult,
                                     @RequestParam("userValid") String userValid, @RequestParam("password") String password) {
        // If verifications okay, add the user to database.
        if (bindingResult.hasErrors()) {
            return new ModelAndView("register");
        } else {
            User user = userService.addUser(new User(password, userValid));
            return new ModelAndView("redirect:/successRegister");
        }
    }
}
