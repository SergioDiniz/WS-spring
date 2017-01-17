package br.com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Usuario;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@PostMapping(value="/new", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Usuario usuario){
		System.out.println("usuario: " + usuario.getNome());
	}
	
	
}
