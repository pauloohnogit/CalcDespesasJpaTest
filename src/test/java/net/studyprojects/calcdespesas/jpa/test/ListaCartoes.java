package net.studyprojects.calcdespesas.jpa.test;

import javax.persistence.EntityManager;

import net.studyprojects.calcdespesas.infra.JPAUtil;

public class ListaCartoes {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

	}

}
