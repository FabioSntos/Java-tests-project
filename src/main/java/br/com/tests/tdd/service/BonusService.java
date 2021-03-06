package br.com.tests.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.tests.tdd.model.Employee;

public class BonusService {

	public BigDecimal calcularBonus(Employee employee) {
		BigDecimal valor = employee.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			valor = BigDecimal.ZERO;
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
