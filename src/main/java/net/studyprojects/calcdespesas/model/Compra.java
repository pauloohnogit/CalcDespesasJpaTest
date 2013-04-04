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
public class Compra {

	// Compra: nome, descricao, data da compra, valor, no_parcelas (dado pelo
	// list.size)

	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Calendar data;
	private BigDecimal valor;

	// @OneToMany - 1 Compra : N Parcelas
	// @OneToMany(mappedBy = "compra")
	// private List<Parcela> parcelas;

	@ManyToOne
	private CartaoDeCredito cartao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	// public List<Parcela> getParcelas() {
	// return parcelas;
	// }
	//
	// public void setParcelas(List<Parcela> parcelas) {
	// this.parcelas = parcelas;
	// }

	public CartaoDeCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}

}
