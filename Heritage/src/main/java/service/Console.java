package service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import JOINED.JPayment;
import JOINED.JVehicule;
import SINGLE_TABLE.DVehicule;
import TABLE_PER_CLASS.TCredit;
import TABLE_PER_CLASS.TPayment;
import TABLE_PER_CLASS.TVehicule;
import entity.User;

public class Console {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
//			
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
//			System.out.println("========= TABLE PER CLASS =============");
//
//			List<TVehicule> tvehicules = em.createQuery("From TVehicule", TVehicule.class).getResultList();
//			
//			for (TVehicule vehicule : tvehicules) {
//				System.out.println(vehicule);
//			}
//			
						
			
			
//			List<TPayment> tpayments = em.createQuery("From TPayment", TPayment.class).getResultList();
//			
//			for (TPayment tPayment : tpayments) {
//				System.out.println(tpayments);
//			}
			
//			
//			EntityTransaction trans =  em.getTransaction();
//			
//			trans.begin();
//			
//			//TCredit credit = new TCredit( 180, "12/10/2023", "12345678", "05/25");
//			//System.out.println("Objet saved !");
//			
//			//em.persist(credit);
//			
//			trans.commit();
//			
			
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
		
		
		
		
		
		for (int i = 0; i < 10; i ++) {
			System.out.println( new User() );
		}
		
		
		
		
	}
}
