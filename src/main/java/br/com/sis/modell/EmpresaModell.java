package com.olgaworks.osworks.modell;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")
public class EmpresaModell implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idEmpresa;
	
	private String nomeEmpresa;
	
	private String telEmpresa1;
	
	private String telEmpresa2;
	
	private String ramoEmpresa;
	
	private String endRua;
	
	private String endNum;
	
	private String endCidade;
	
	private String endEstado;
	
	private String obsEmpresa;
	
	
	//GETERS AND SETERS
	public Long getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getTelEmpresa1() {
		return telEmpresa1;
	}
	public void setTelEmpresa1(String telEmpresa1) {
		this.telEmpresa1 = telEmpresa1;
	}
	public String getTelEmpresa2() {
		return telEmpresa2;
	}
	public void setTelEmpresa2(String telEmpresa2) {
		this.telEmpresa2 = telEmpresa2;
	}
	public String getRamoEmpresa() {
		return ramoEmpresa;
	}
	public void setRamoEmpresa(String ramoEmpresa) {
		this.ramoEmpresa = ramoEmpresa;
	}
	public String getEndRua() {
		return endRua;
	}
	public void setEndRua(String endRua) {
		this.endRua = endRua;
	}
	public String getEndNum() {
		return endNum;
	}
	public void setEndNum(String endNum) {
		this.endNum = endNum;
	}
	public String getEndCidade() {
		return endCidade;
	}
	public void setEndCidade(String endCidade) {
		this.endCidade = endCidade;
	}
	public String getEndEstado() {
		return endEstado;
	}
	public void setEndEstado(String endEstado) {
		this.endEstado = endEstado;
	}
	public String getObsEmpresa() {
		return obsEmpresa;
	}
	public void setObsEmpresa(String obsEmpresa) {
		this.obsEmpresa = obsEmpresa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
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
		EmpresaModell other = (EmpresaModell) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		return true;
	}
	
	

}
