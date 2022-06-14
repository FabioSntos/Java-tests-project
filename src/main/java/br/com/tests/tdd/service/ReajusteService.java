package br.com.tests.tdd.service;

import br.com.tests.tdd.model.Desempenho;
import br.com.tests.tdd.model.Employee;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Employee employee, Desempenho desempenho) {
        if (desempenho.equals(Desempenho.A_DESEJAR)) {
            employee.setSalario(employee.getSalario().multiply(new BigDecimal("1.03")));
        }

        if (desempenho.equals(Desempenho.BOM)) {
            employee.setSalario(employee.getSalario().multiply(new BigDecimal("1.15")));
        }

        if (desempenho.equals(Desempenho.OTIMO)) {
            employee.setSalario(employee.getSalario().multiply(new BigDecimal("1.20")));
        }
    }
}