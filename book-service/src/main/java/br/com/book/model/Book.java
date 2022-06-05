package br.com.book.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "book")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 180)
	private String autor;
	
	@Column(name = "data_lancamento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataLancamento;
	
	@Column(nullable = false)
	private BigDecimal preco;
	
	private String titulo;
	
	@Transient
	private String moeda;
	
	@Transient
	private String porta;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Long id, String autor, Date dataLancamento, BigDecimal preco, String titulo, String moeda,
			String porta) {
		super();
		this.id = id;
		this.autor = autor;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
		this.titulo = titulo;
		this.moeda = moeda;
		this.porta = porta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

}
