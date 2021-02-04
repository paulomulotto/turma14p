package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_MUSICA")
public class Musica {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titulo", length=40)
	private String titulo;
	
	@Column(name="lancamento", length=40)
	private String lancamento;
	
	@Column(name="cadastro", length=40)
	private String cadastro;
	
	@Column(name="id_artista")
	private int id_artista;

	public Musica() {
		super();
	}

	public Musica(int id, String titulo, String lancamento, String cadastro, int id_artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.cadastro = cadastro;
		this.id_artista = id_artista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public int getId_artista() {
		return id_artista;
	}

	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}
}
