package net.studyprojects.calcdespesas.model.factory;

import java.util.Calendar;

import net.studyprojects.calcdespesas.model.CartaoDeCredito;
import net.studyprojects.calcdespesas.model.Fatura;
import net.studyprojects.calcdespesas.model.builder.FaturaBuilder;

public class FaturaFactory {

	public void constroiFaturaParaCartaoNaData(Calendar data,
			CartaoDeCredito cartao) {

		Calendar dataDeVencimento = cartao.getDataDeExpiracao();

		dataDeVencimento.set(Calendar.YEAR, data.get(Calendar.YEAR));

		FaturaBuilder fbuilder = new FaturaBuilder();

		Fatura fatura = fbuilder.comDataDeVencimento(dataDeVencimento)
				.comCartaoDeCredito(cartao).geraFatura();

		// Parcela parcela = pbuilder
		// .comValor(getValorDeCadaParcela(compra))
		// .comData(dataDaCompra.plusMonths(i).toGregorianCalendar())
		// .comDataDeLancamento(
		// dataDaCompra.plusMonths(i).toGregorianCalendar())
		// .geraParcela();

		// compra.addParcela(parcela);
		//
		// parcelas.add(parcela);

	}
}
