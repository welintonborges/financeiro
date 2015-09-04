package com.financeiro.teste;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.financeiro.model.Pessoa;




import junit.framework.TestCase;


public class AppPessoaTeste extends TestCase {

	@Test
	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Pessoa pessoa = new Pessoa("Welinton");
		session.save(pessoa);
		
		Pessoa pessoa1 = new Pessoa("Rayane");
		session.save(pessoa1);

		session.getTransaction().commit();
		session.close();
	}
}
