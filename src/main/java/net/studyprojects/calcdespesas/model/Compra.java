package net.studyprojects.calcdespesas.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class Compra {

	// Compra: nome, descricao, data da compra, valor, no_parcelas (dado pelo
	// list.size)

	private Long id;
	private String titulo;
	private String descricao;
	private Calendar data;
	private BigDecimal valor;
	// @OneToMany - 1 Compra : N Parcelas
	private List<Parcela> parcelas;

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

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

}
