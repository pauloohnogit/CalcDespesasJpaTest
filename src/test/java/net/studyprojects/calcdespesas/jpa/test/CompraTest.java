package net.studyprojects.calcdespesas.jpa.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import net.studyprojects.calcdespesas.model.Compra;

public class CompraTest {

	public static void main(String[] args) {

		Compra compra = new Compra();

		compra.setTitulo("Decathlon Barra");
		compra.setDescricao("Tenis Mizuno");

		Date dataDaCompra;
		try {
			dataDaCompra = new SimpleDateFormat("dd/MM/yyyy")
					.parse("03/01/2013");
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

		Calendar data = Calendar.getInstance();
		data.setTime(dataDaCompra);

		compra.setData(data);

		BigDecimal valor = new BigDecimal("427.75");

		compra.setValor(valor);

	}

}
