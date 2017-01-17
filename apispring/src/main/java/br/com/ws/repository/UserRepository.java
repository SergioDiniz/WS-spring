package br.com.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ws.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer>{

}
