package br.com.tests.tdd.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String nome;
	private LocalDate dataAdmissao;

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	private BigDecimal salario;

	public Employee(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

}
