package br.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Usuario;
import br.com.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void create(Usuario usuario){
		repository.save(usuario);
	}
	
	
	public Collection<Usuario> listAll(){
		return repository.findAll();
	}
	
}
