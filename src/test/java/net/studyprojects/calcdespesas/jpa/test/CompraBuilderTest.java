package net.studyprojects.calcdespesas.jpa.test;

import java.math.BigDecimal;
import java.util.Calendar;

import net.studyprojects.calcdespesas.model.Compra;
import net.studyprojects.calcdespesas.model.Parcela;
import net.studyprojects.calcdespesas.model.builder.CompraBuilder;
import net.studyprojects.calcdespesas.model.builder.ParcelaBuilder;

import org.joda.time.DateTime;

public class CompraBuilderTest {

	public static void main(String[] args) {

		CompraBuilder cbuilder = new CompraBuilder();

		DateTime dataCompra = new DateTime().withDate(2013, 01, 29);
		Calendar dataDaCompra2 = dataCompra.toGregorianCalendar();

		// Calendar dataDaCompra2 = Calendar.getInstance();
		// dataDaCompra2.set(2013, 03, 30);

		Compra compra2 = cbuilder.comTitulo("FNAC Barra")
				.comDescricao("Apple wired keyboard")
				.comValor(new BigDecimal("179.90"))
				.comDataDaCompra(dataDaCompra2).comNumeroDeParcelas(3)
				.geraCompra();

		ParcelaBuilder pbuilder = new ParcelaBuilder();

		for (int i = 0; i < compra2.getNumeroDeParcelas(); i++) {
			Parcela novaParcela = pbuilder
					.comValor(getValorDeCadaParcela(compra2))
					.comData(dataCompra.plusMonths(i).toGregorianCalendar())
					.geraParcela();
			compra2.getParcelas().add(novaParcela);
		}

		// dataDaCompra2.add(Calendar.MONTH, +1)
		// Parcela p1 = pbuilder.comData().
	}

	private static BigDecimal getValorDeCadaParcela(Compra compra) {

		BigDecimal divisor = new BigDecimal(compra.getNumeroDeParcelas());

		BigDecimal valorDaParcela = compra.getValor().divide(divisor);

		return valorDaParcela;
	}
}
