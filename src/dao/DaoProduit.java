package dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class DaoProduit implements IProduit {
	
//	private SessionFactory getSessionFactory() {
//		return (SessionFactory) new Configuration().configure();
//	}
	
//	SessionFactory factory = new Configuration().configure().buildSessionFactory();
//	Session session = factory.openSession();
//	ON PEUT LE METTRE A L'EXTERIEUR DES METHODES
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	@Override
	public int create(Produit pr) {
		
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
		
		try {
			session.beginTransaction();
			session.save(pr); //insert blablablabla
//			s'il existe on le met à jour, sinon on le créer
			session.getTransaction().commit(); //action réalisée
			session.close();
			return 1;
//			si int 
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0; 
//			si int et pas void
		}

				
		}

	@Override
	public int supprimerProduit(int id) {
		
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
		
		Produit pr = new Produit();
		pr.setId(id);
		
		try {
			session.beginTransaction();
			session.delete(pr);
			session.getTransaction();
			return 1;
			
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
		
		
	}
	
	
	public int afficherProduits() {
		ArrayList<Produit> Liste = new ArrayList<Produit>();
		Liste.add
		
		
	}
	}


