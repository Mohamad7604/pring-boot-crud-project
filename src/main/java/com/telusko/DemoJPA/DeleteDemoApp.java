package com.telusko.DemoJPA;

import jakarta.persistence.*;

public class DeleteDemoApp  { // deleting entity occurence with id 9

	
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	
	em.getTransaction().begin();
	
	Alien a1ToDelete=em.find(Alien.class, 9);

	if(a1ToDelete!=null) {
		em.remove(a1ToDelete);
	}
	
	em.getTransaction().commit();
	
	//update
	em.getTransaction().begin();
	
	
	
	}
}
