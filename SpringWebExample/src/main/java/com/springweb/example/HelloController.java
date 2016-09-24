package com.springweb.example;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	


	/**
	 * default constructor
	 */
	public HelloController() {
		System.out.println("BEAN instanciado");
	}

	/**
	 * handles default / or /hello request
	 * 
	 * @param model
	 * @return the name of the view to show RequestMapping({"/hello"})
	 */

	
	@RequestMapping(value = "/hello")
	public String sayHelloPage(Map<String, Object> model) {		
		
		model.put("model", "Hello World, First Spring MVC");
		
		//Se devuelve la vista
		return "hello";
	}
}