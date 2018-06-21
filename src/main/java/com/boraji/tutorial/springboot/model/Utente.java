package com.boraji.tutorial.springboot.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "enabled")
	private Boolean enabled;

	@OneToMany
	@JoinColumn(name = "username")
	private Set<Ruolo> ruoli;

	@ManyToMany(mappedBy = "utenti")
	private List<Donazione> donazioni;

	@ManyToMany(mappedBy = "iscritti")
	private List<Evento> eventi;

	protected Utente() {
	}

	public Utente(String username, String password, Boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Utente [username=" + username + ", password=" + password + ", enabled=" + enabled + ", ruoli=" + ruoli
				+ "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Ruolo> getRuoli() {
		return ruoli;
	}

	public void setRuoli(Set<Ruolo> ruoli) {
		this.ruoli = ruoli;
	}

	public List<Evento> getCorsi() {
		// TODO Auto-generated method stub
		return this.eventi;
	}

	public int dim() {
		int dim = 0;
		for (int i = 0; i < eventi.size(); i++)
			dim++;
		return dim;
	}

}
