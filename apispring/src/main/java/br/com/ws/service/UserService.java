package br.com.ws.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ws.model.Usuario;
import br.com.ws.repository.UserRepository;

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
	
	public Usuario findOne(Integer id){
		return repository.findOne(id);
	}
	
	public void delete(Integer id){
		repository.delete(id);
	}
	
	public Usuario update(Usuario usuario){
		return repository.save(usuario);
	}
}
