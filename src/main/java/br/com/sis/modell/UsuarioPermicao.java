package com.olgaworks.osworks.modell;

public enum UsuarioPermicao {
	ADMIN("Administrador"),
	USER("Usuario");

	private final String valor;

	UsuarioPermicao(String valorOpcao) {

		valor = valorOpcao;
	}

	public String getValor() {

		return valor;
	}
}
