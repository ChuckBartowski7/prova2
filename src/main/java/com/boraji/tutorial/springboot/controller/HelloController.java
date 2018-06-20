package com.boraji.tutorial.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

   @RequestMapping("/")
   public String index() {
      return "loading";
   }
   
   @RequestMapping("/indexx")
   public String homes() {
      return "index";
   }
   
   
   @RequestMapping("/home")
   public String home() {
      return "index";
   }
   
   
   @RequestMapping("/teams")
   public String team() {
      return "team";
   }
   @RequestMapping("/evkids")
   public String eventikids() {
      return "kids";
   }
   
   @RequestMapping("/evnature")
   public String eventinature() {
      return "nature";
   }
   
   @RequestMapping("/evanim")
   public String eventianimali() {
      return "animali";
   }
   
   @RequestMapping("/profile")
   public String profiloinformazioni() {
	   return "profiloutente";
   }
   
   
   
   

   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
   }
}
