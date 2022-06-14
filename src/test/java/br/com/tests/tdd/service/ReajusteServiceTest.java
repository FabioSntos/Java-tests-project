package br.com.tests.tdd.service;

import br.com.tests.tdd.model.Desempenho;
import br.com.tests.tdd.model.Employee;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReajusteServiceTest {

    @Test
    public void readjustmentShouldBe3percentWhenPerformanceIsNotGood() {
        ReajusteService service = new ReajusteService();
        Employee employee = new Employee("Fabio", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(employee, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), employee.getSalario());
    }

    @Test
    public void readjustmentShouldBe15percentWhenPerformanceIsGood() {
        ReajusteService service = new ReajusteService();
        Employee employee = new Employee("Fabio", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(employee, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), employee.getSalario());
    }

    @Test
    public void readjustmentShouldBe20percentWhenPerformanceIsGreat() {
        ReajusteService service = new ReajusteService();
        Employee employee = new Employee("Fabio", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(employee, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), employee.getSalario());
    }
}
