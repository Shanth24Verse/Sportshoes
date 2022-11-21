package com.ecommerce.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.model.Admin;
import com.ecommerce.service.AdminService;

@Controller
public class AdminController {

	@Autowired
    private AdminService adminService;
 
    @GetMapping("/admin")      
    public ModelAndView adminlogin() {
     ModelAndView mav = new ModelAndView("admin");
        mav.addObject("user", new Admin());
        return mav;
    }
 
    @PostMapping("/admin")
    public String login(@ModelAttribute("user") Admin user ) {
    Admin oauthUser = adminService.admin(user.getUsername(), user.getPassword());
    System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     { 
     return "redirect:/manage";
     } 
     else {
     return "redirect:/admin";
     }
    }
    
    @RequestMapping("/manage")
    public String manage() {
    	return "manage";
    }
    
    @RequestMapping(value = {"/logout"})
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {  
        return "redirect:/admin";
    }
 
}
