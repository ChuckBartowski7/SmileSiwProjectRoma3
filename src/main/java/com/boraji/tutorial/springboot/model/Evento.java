package com.boraji.tutorial.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "corso")
public class Evento {

	public Evento(String nomeCorso, int durata) {

		this.nomeCorso = nomeCorso;
		this.durata = durata;
	}

	public Evento() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "evento")
	private String nomeCorso;

	@Column(name = "durata")
	private int durata;

	@ManyToMany
	private List<Utente> iscritti;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nomeCorso=" + nomeCorso + ", durata=" + durata + "]";
	}

}
