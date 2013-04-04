package net.studyprojects.calcdespesas.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	// ManyToOne
	// private Compra compra;

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

}
