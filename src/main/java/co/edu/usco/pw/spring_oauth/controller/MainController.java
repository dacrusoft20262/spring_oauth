package co.edu.usco.pw.spring_oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String helloWorld() {
		return "INICIO";
	}

	@GetMapping("/free")
	public String free() {
		return "PAGINA LIBRE";
	}

	@GetMapping("/restricted")
	public String restricted() {
		return "LOGUEADO!!";
	}

}
