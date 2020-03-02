package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class DaoProduit implements IProduit {
	
//	private SessionFactory getSessionFactory() {
//		return (SessionFactory) new Configuration().configure();
//	}

	@Override
	public void create(Produit pr) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(pr); //insert blablablabla
		session.getTransaction().commit(); //action réalisée
				
		}
	}


