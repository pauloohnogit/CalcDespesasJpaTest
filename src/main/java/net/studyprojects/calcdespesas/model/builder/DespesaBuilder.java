package net.studyprojects.calcdespesas.model.builder;

import java.math.BigDecimal;
import java.util.Calendar;

import net.studyprojects.calcdespesas.model.Parcela;

public class DespesaBuilder {

	private double fracao;
	private BigDecimal valor;
	private Calendar data;
	private Parcela parcela;

	public DespesaBuilder comData(Calendar data) {
		this.data = data;
		return this;
	}

	public DespesaBuilder comValor(BigDecimal valor) {
		this.valor = valor;
		return this;
	}

	public DespesaBuilder referenteAParcela(Parcela parcela) {
		this.parcela = parcela;
		return this;
	}

}
