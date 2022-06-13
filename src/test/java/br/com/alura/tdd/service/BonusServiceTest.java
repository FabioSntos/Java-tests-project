package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    public void bonusShouldBeZeroToGiveItToEmployee(){
        BonusService service =  new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Fabio", LocalDate.now(), new BigDecimal(13000)));

        assertEquals(new BigDecimal("00.00"), bonus);
    }
    @Test
    public void bonusShouldBeGaveToEmployees(){
        BonusService service =  new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Fabio", LocalDate.now(), new BigDecimal(2500)));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonusShouldBeGaveToEmployeesWith10kSalary(){
        BonusService service =  new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Fabio", LocalDate.now(), new BigDecimal(10000)));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}