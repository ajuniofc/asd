package br.com.ajunio.casadocodigo.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String descricao;
	private int paginas;
	
	@ElementCollection
	private List<Preco> precos;
	
	public Produto() {
	}

	public Produto(String titulo, String descricao, int paginas) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.paginas = paginas;
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
	public void setTitulo(String titurlo) {
		this.titulo = titurlo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public List<Preco> getPrecos() {
		return precos;
	}

	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}

	@Override
	public String toString() {
		return "Produto [titurlo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}
	
}
