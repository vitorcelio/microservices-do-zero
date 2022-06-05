package br.com.book.response;

import java.math.BigDecimal;

public class Cambio {
	private Long id;
	private String de;
	private String para;
	private BigDecimal fatorConversao;
	private BigDecimal valorConvertido;
	private String portaExecucao;

	public Cambio() {
		// TODO Auto-generated constructor stub
	}

	public Cambio(Long id, String de, String para, BigDecimal fatorConversao, BigDecimal valorConvertido,
			String portaExecucao) {
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
