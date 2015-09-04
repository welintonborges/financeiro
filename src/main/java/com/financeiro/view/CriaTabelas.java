package com.financeiro.view;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		// Persistence.createEntityManagerFactory("financeiro");
		try {

			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("financeiro-pu");
			System.out.println("taabelar criada com sucesso !!!");

			factory.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("erro no persistence " + e);
		}

	}

}
