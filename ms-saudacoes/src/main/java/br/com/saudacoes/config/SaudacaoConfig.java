package br.com.saudacoes.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("servico-saudacoes")
public class SaudacaoConfig {

	private String saudacao;
	private String defaultSaudacao;

	public SaudacaoConfig() {
	}

	public String getSaudacao() {
		return saudacao;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}

	public String getDefaultSaudacao() {
		return defaultSaudacao;
	}

	public void setDefaultSaudacao(String defaultSaudacao) {
		this.defaultSaudacao = defaultSaudacao;
	}

}
