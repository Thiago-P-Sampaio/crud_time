package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import entity.Entity;
import repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repository    repository;
	


}
