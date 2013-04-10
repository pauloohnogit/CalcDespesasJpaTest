package net.studyprojects.calcdespesas.jpa.test;

import java.math.BigDecimal;
import java.util.Calendar;

import net.studyprojects.calcdespesas.model.Compra;
import net.studyprojects.calcdespesas.model.builder.CompraBuilder;
import net.studyprojects.calcdespesas.model.builder.ParcelaBuilder;

public class CompraBuilderTest {

	public static void main(String[] args) {

		CompraBuilder cbuilder = new CompraBuilder();

		Calendar dataDaCompra2 = Calendar.getInstance();
		dataDaCompra2.set(2013, 03, 30);

		Compra compra2 = cbuilder.comTitulo("FNAC Barra")
				.comDescricao("Apple wired keyboard")
				.comValor(new BigDecimal("179.90"))
				.comDataDaCompra(dataDaCompra2).geraCompra();

		ParcelaBuilder pbuilder = new ParcelaBuilder();

		// dataDaCompra2.add(Calendar.MONTH, +1)
		// Parcela p1 = pbuilder.comData().

	}

}
