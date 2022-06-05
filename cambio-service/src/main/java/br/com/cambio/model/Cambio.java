package br.com.cambio.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cambio")
public class Cambio {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 3)
	private String de;
	
	@Column(nullable = false, length = 3)
	private String para;
	
	@Column(name = "fator_conversao")
	private BigDecimal fatorConversao;
	
	@Transient
	private BigDecimal valorConvertido;
	
	@Transient
	private String portaExecucao;

	public Cambio() {
		// TODO Auto-generated constructor stub
	}

	public Cambio(Long id, String de, String para, BigDecimal fatorConversao, BigDecimal valorConvertido, String portaExecucao) {
		super();
		this.id = id;
		this.de = de;
		this.para = para;
		this.fatorConversao = fatorConversao;
		this.valorConvertido = valorConvertido;
		this.portaExecucao = portaExecucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public BigDecimal getFatorConversao() {
		return fatorConversao;
	}

	public void setFatorConversao(BigDecimal fatorConversao) {
		this.fatorConversao = fatorConversao;
	}

	public BigDecimal getValorConvertido() {
		return valorConvertido;
	}

	public void setValorConvertido(BigDecimal valorConvertido) {
		this.valorConvertido = valorConvertido;
	}

	public String getPortaExecucao() {
		return portaExecucao;
	}

	public void setPortaExecucao(String portaExecucao) {
		this.portaExecucao = portaExecucao;
	}

}
