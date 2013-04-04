package net.studyprojects.calcdespesas.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Fatura {

	@Id
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.DATE)
	private Calendar dataDeVencimento;
	@Temporal(TemporalType.DATE)
	private Calendar dataDePagamento;
	private BigDecimal valor; // Nao seria a soma das despesas?
	private BigDecimal valorPago;

	// @ManyToOne - N faturas : 1 cartao
	@ManyToOne
	private CartaoDeCredito cartaoDeCredito;

	// @OneToMany - 1 fatura : N Despesas
	// @OneToMany(mappedBy = "fatura")
	// private List<Despesa> despesas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Calendar dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Calendar getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Calendar dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public CartaoDeCredito getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	// public List<Despesa> getDespesas() {
	// return despesas;
	// }
	//
	// public void setDespesas(List<Despesa> despesas) {
	// this.despesas = despesas;
	// }

}
