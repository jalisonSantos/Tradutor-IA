package com.example.geminiexpander.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

 @GetMapping("/")
 public String form() {
   return "index";
 }

 @PostMapping("/expand")
 public String expand(@RequestParam String text,
                      @RequestParam int linhas,
                      Model model) {

   // Mock IA expansion
   StringBuilder sb = new StringBuilder(text);
   for(int i=0;i<linhas;i++){
     sb.append("\n").append("Linha gerada pela IA: ").append(i+1);
   }

   model.addAttribute("resultado", sb.toString());
   return "index";
 }
}