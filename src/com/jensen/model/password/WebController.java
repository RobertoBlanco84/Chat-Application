package com.jensen.model.password;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class WebController extends WebMvcConfigurerAdapter  {
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(Password password) {
        return "password";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Password password, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "index";
        }

        return "redirect:/chat_room";
    }

}
