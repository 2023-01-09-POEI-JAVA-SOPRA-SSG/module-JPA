package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JOINED.JPayment;
import JOINED.JVehicule;
import SINGLE_TABLE.DVehicule;
import TABLE_PER_CLASS.TVehicule;

public class Console {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
//			
			
			System.out.println("========= SINGLE TABLE =============");
			
			List<DVehicule> vehicules = em.createQuery("from DVehicule", DVehicule.class).getResultList();
			
			for (DVehicule dVehicule : vehicules) {
				System.out.println(dVehicule);
			}
			
			System.out.println("========= JOINED =============");

			List<JVehicule> jvehicules = em.createQuery("from JVehicule", JVehicule.class).getResultList();
			
			for (JVehicule jVehicule : jvehicules ) {
				System.out.println(jVehicule);
			}
			
			System.out.println("========= TABLE PER CLASS =============");

			List<TVehicule> tvehicules = em.createQuery("From TVehicule", TVehicule.class).getResultList();
			
			for (TVehicule vehicule : tvehicules) {
				System.out.println(vehicule);
			}
			
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
		
		
		
		
	}
}
