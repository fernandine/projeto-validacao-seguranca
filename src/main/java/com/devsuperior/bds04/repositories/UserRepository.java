package com.devsuperior.bds04.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bds04.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	//Busca no BD um usuario por email
	User findByEmail(String email);

}
