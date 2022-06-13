package br.com.alura.tdd.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String nome;
	private LocalDate dataAdmissao;
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
