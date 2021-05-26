package com.demo.mvc.models;

public class Evento {

	private Long id;
	private String nome;
	private String local;
	private String data;
	private String horario;
	
	public Evento() {
		
	}

	public Evento(Long id, String nome, String local, String data, String horario) {
		this.id = id;
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
