package com.springMVCLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class HelloWorldController {

    @RequestMapping(method= RequestMethod.GET)public String printHello(ModelMap model)
    {
        model.addAttribute("message","Please enter your Login Details");
        return "login";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean)
    {
        if(loginBean!=null && loginBean.getUserName()!=null & loginBean.getPassword()!=null)
        {
            if(loginBean.getUserName().equals("damitha") && loginBean.getPassword().equals("damitha123"))
            {
                model.addAttribute("message","Well come"+loginBean.getUserName());
                return "Home";
            }
            else
            {
                model.addAttribute("Error","Invalid Details");
                return "Error";
            }
        }
        else
        {
            model.addAttribute("Error","Please enter Details");
            return "Login";
        }

    }

}
