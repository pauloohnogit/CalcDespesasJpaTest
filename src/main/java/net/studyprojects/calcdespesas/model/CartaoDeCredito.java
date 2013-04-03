package net.studyprojects.calcdespesas.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartaoDeCredito {

	 @Id
	 @GeneratedValue
	private Long id;
	private String titulo; // Ex.: Diners Club International Micha
	private String descricao;
	private Calendar dataDeExpiracao;
	@Enumerated(EnumType.STRING)
	private Bandeira bandeira; // Ex.: DINNERS

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

	public Calendar getDataDeExpiracao() {
		return dataDeExpiracao;
	}

	public void setDataDeExpiracao(Calendar dataDeExpiracao) {
		this.dataDeExpiracao = dataDeExpiracao;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

}
