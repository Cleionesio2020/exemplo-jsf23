package br.com.sis.modell;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="cliente")//caso o nome da tabela seja diferente informe aqui
public class ClienteModell {
	@Column(name="nome")
	private String nome;
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//anotação acima indica que o campo será gerado automaticamente pelo BD
	@Column(name="id")
	private int id;
	@Column(name="sobrenome")
	private String sobrenome;
	@Column(name="cidade")
	private String cidade; 
 
	public ClienteModell() {
		// TODO Auto-generated constructor stub
	}
 
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getSobrenome() {
		return sobrenome;
	}
 
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
 
	public String getCidade() {
		return cidade;
	}
 
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
 
}