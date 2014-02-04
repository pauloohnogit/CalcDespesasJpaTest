package net.studyprojects.calcdespesas.jpa.test;

import javax.persistence.EntityManager;

import net.studyprojects.calcdespesas.model.CartaoDeCredito;
import net.studyprojects.calcdespesas.model.Fatura;

public class FaturaTest {

	public static void main(String[] args) {

		// Dado um cartao de credito, podemos gerar as faturas deste cartao.

		// Persistence

		EntityManager em = JPAUtil.getEntityManager();

		CartaoDeCredito cc = (CartaoDeCredito) em.find(CartaoDeCredito.class,
				1L);

		System.out.println("Data de Expiracao: "
				+ cc.getDataDeExpiracao().getTime());

		Fatura fatura = new Fatura();

		// fatura.set

	}

}
