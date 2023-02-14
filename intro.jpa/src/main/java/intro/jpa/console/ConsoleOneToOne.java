package intro.jpa.console;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import intro.jpa.entity.Account;
import intro.jpa.entity.Credential;

public class ConsoleOneToOne {

	
	public static void main(String[] args) {

		//System.out.println(getAccountById(1));

		
//		for (Account a :  getAll()) {
//			System.out.println("==========");
//			System.out.println(a);
//			System.out.println(a.getCredential());
//		}
		
//		Account a = getAccountById(1);
//		a.setFirstName("LALALA");
//		update(a);
		
//		Credential c = new Credential("reza", "reza");
//		Account a = new Account("Lala", "Lolo", 0, 0, c);
//		
//		create(a);
//		
//		delete(6);
		
		
	}
	
	
	
	
	public static Account getAccountById(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			return em.find(Account.class, id);
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
	}
	
	public static List<Account> getAll(){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			return em.createQuery("From Account", Account.class).getResultList();
				
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
	}
	
	public static void update(Account a) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			Account account = em.find(Account.class, a.getId() );
			
			account.setCredential( a.getCredential() );
			account.setDateCreation( a.getDateCreation() );
			account.setFirstName( a.getFirstName() );
			account.setLastName( a.getLastName() );
			account.setNombreAmis( a.getNombreAmis() );
			account.setNombreMessages( a.getNombreMessages() );			
			
			em.persist(account);
			
			trans.commit();
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}
	
	public static void create(Account a) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			em.persist(a.getCredential());
			em.persist(a);

			trans.commit();
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}

	public static void delete(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("my-jpa-conf");
			em = emf.createEntityManager();
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			
			Account account = em.find(Account.class, id);
			
			em.remove(account);
			em.remove(account.getCredential());

			trans.commit();
			
		} finally {
			if (emf != null) emf.close();
			if (em != null) em.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
