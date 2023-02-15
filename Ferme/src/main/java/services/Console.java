package services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Animaux;
import entity.Ferme;
import entity.Machine;

public class Console {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		
		
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			Ferme ferme1 = em.find(Ferme.class, 1);
			System.out.println(ferme1);
			
			List<Animaux> animaux = ferme1.getAnimaux();
			
			for (Animaux animaux2 : animaux) {
				System.out.println(animaux2);
			}
			
			System.out.println("======================");
			
			Ferme ferme = em.find(Ferme.class, 2);
			
			System.out.println(ferme);
			
			List<Machine> machines = ferme.getMachines();
			for (Machine machine : machines) {
				System.out.println(machine);
			}
			
			
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
		
		
	}
}
