package net.studyprojects.calcdespesas.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Uma Parcela pertence a uma Compra. Navegabilidade: Compra -> Parcela
 * 
 * @author Paul
 * 
 */
@Entity
public class Parcela {

	@Id
	@GeneratedValue
	private Long id;
	@Temporal(TemporalType.DATE)
	private Calendar data;
	private BigDecimal valor;

	// Relationships

	@ManyToOne
	private Compra compra;

	public Parcela() {

	}

	public Parcela(Calendar data, BigDecimal valor, Compra compra) {
		this.data = data;
		this.valor = valor;
		this.compra = compra;
	}

	// Getters & Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	// Relationships

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

}
