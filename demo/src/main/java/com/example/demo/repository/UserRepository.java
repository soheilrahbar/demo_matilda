package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Benutzer;

@Repository
public interface UserRepository extends JpaRepository<Benutzer, Long>
{
	Benutzer findByBenutzername(String benutzername);
}
