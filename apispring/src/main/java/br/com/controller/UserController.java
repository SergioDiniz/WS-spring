package br.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Usuario;
import br.com.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value="/new", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Usuario usuario){
		System.out.println("usuario: " + usuario.getNome());
		userService.create(usuario);
	}
	
	@GetMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
	public Collection<Usuario> listAll(){
		return userService.listAll();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario findOne(@PathVariable Integer id){
		return userService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id){
		userService.delete(id);
	}
	
	
	@PutMapping(value="/", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario update(@RequestBody Usuario usuario){
		return userService.update(usuario);
	}
	
	
}
