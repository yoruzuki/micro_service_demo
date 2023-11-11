package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

 @RequestMapping("/")
 public String hello(Model model) {
	 model.addAttribute("hello", "Hello,World!CI/CD パイプラインを Amazon ECS にデプロイ成功しました！");
     return "hello";
 }
}