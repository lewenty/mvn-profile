package com.company.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @Value("${db.url}")
    public String dbUrl;


    @Value("${db.user}")
    public String dbUser;


    @Value("${db.pass}")
    public String dbPass;



	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Okunan Degerler!");
        model.addAttribute("url",this.dbUrl);
        model.addAttribute("pass",this.dbPass);
        model.addAttribute("user",this.dbUser);

		return "index";
	}
}