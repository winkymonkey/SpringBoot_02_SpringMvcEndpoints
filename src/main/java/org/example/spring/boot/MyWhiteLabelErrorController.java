package org.example.spring.boot;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyWhiteLabelErrorController implements ErrorController {
	
	@GetMapping(value = "/error")
	public String error() {
		return "Sorry something went wrong";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
