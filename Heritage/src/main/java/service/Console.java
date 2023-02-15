package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JOINED.JPayment;
import JOINED.JVehicule;
import SINGLE_TABLE.DVehicule;

public class Console {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
//			
			
//			System.out.println("========= SINGLE TABLE =============");
//			
//			List<DVehicule> vehicules = em.createQuery("from DVehicule", DVehicule.class).getResultList();
//			
//			for (DVehicule dVehicule : vehicules) {
//				System.out.println(dVehicule);
//			}
//			
//			System.out.println("========= JOINED =============");
//
//			List<JVehicule> jvehicules = em.createQuery("from JVehicule", JVehicule.class).getResultList();
//			
//			for (JVehicule jVehicule : jvehicules ) {
//				System.out.println(jVehicule);
//			}
//			
			
			
			
			
			List<JPayment> payment = em.createQuery("From JPayment", JPayment.class).getResultList();
			
			for (JPayment dPayment : payment) {
				System.out.println(dPayment);
			}
			
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
		
		
		
		
	}
}
