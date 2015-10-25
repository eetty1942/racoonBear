package com.cdg.racoonBear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author SeungMooLee
 *
 */

@Controller
public class MainController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
		
	}

}
