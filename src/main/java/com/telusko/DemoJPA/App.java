package com.telusko.DemoJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
    	
    	Alien a=em.find(Alien.class, 1);
    	System.out.println(a);
    	
    	Alien a1 = new Alien();
    	a1.setAid(20);
    	a1.setAname("joe");
    	a1.setTech("Hardware");
    	
    	em.getTransaction().begin();
    	
    	em.persist(a1);//to save in db, before saving we have to start transaction
    	
    	em.getTransaction().commit();
//    	
    	
    	
    	
    	
    	
    
    }
}
