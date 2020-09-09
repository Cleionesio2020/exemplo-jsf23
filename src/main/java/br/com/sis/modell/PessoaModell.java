package com.olgaworks.osworks.modell;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Enumerated;


@Entity
@Table(name="pessoas")
public class PessoaModell implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPessoa;

	private String nome;

	private String telefone;

	private String idade;

	private String tipoDocumento;

	private String numdocumento;

	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
	
	@OneToOne
	private EmpresaModell empresa;

	@OneToMany
	private List<VeiculoModell> veiculos;
	
	@ManyToMany(mappedBy = "pessoas")
	private List<RegistroModell>registros;

	public enum TipoPessoa {
		DIRETORIA, FUNCIONARIO, VISITANTE, PRESTADOR
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
	}

	

	public Enum<TipoPessoa> getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public EmpresaModell getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaModell empresa) {
		this.empresa = empresa;
	}

	public List<VeiculoModell> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<VeiculoModell> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	

	public List<RegistroModell> getRegistros() {
		return registros;
	}

	public void setRegistros(List<RegistroModell> registros) {
		this.registros = registros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPessoa == null) ? 0 : idPessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaModell other = (PessoaModell) obj;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		return true;
	}

}
