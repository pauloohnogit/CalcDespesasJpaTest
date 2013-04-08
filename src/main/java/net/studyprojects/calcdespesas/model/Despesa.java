package net.studyprojects.calcdespesas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Despesa {

	@Id
	@GeneratedValue
	private Long id;

	private double fracao;

	private BigDecimal valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getFracao() {
		return fracao;
	}

	public void setFracao(double fracao) {
		this.fracao = fracao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
