package com.example.passweb.contoller.pass;

import com.example.passweb.service.pass.Pass;
import com.example.passweb.service.pass.PassService;
import com.example.passweb.service.user.User;
import com.example.passweb.service.user.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/passes")
@Log4j2
public class PassViewController {
    private final UserService userService;
    private final PassService passService;

    public PassViewController(UserService userService, PassService passService) {
        this.userService = userService;
        this.passService = passService;
    }

    @GetMapping
    public ModelAndView getPasses(@RequestParam("userId") String userId) {
        ModelAndView modelAndView = new ModelAndView();

        final List<Pass> passes = passService.getPasses(userId);
        final User user = userService.getUser(userId);
        log.info(user);
        log.info(passes);
        modelAndView.addObject("passes", passes);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("pass/index");

        return modelAndView;
    }

}
