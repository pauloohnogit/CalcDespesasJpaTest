package net.studyprojects.calcdespesas.model.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import net.studyprojects.calcdespesas.model.Compra;
import net.studyprojects.calcdespesas.model.Parcela;

public class ParcelaFactory {

	public Parcela constroiParcelaParaCompra(Compra compra) {
		// TODO: falta implementar
		return new Parcela();
	}

	public List<Parcela> constroiParcelasParaCompra(Compra compra) {
		// TODO: falta implementar

		for (int i = 0; i < compra.getNumeroDeParcelas(); i++) {
			Parcela novaParcela = pbuilder
					.comValor(getValorDeCadaParcela(compra2))
					.comData(dataCompra.plusMonths(i).toGregorianCalendar())
					.geraParcela();
			compra2.getParcelas().add(novaParcela);
		}

		return new ArrayList<Parcela>();
	}

	private BigDecimal getValorDeCadaParcela(Compra compra) {

		BigDecimal divisor = new BigDecimal(compra.getNumeroDeParcelas());

		BigDecimal valorDaParcela = compra.getValor().divide(divisor);

		return valorDaParcela;
	}

}
