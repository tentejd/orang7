package br.com.itau.datagenerator.domain.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cadativo")
public class Ativo implements Serializable {

	@Id
	@Column(name = "id_ativo")
	private int codigo;

	@Column(name = "plataforma")
	private Plataforma plataforma;

	@Column(name = "cod_ativo")
	private char codAtivo;

	@Column(name = "nom_ativo")
	private String nomeAtivo;

	@Column(name = "dt_venc_atv")
	private Date dataVencimento;
	
	@OneToMany(targetEntity= Movimento.class, fetch= FetchType.EAGER, mappedBy="idAtivo")
	private Set<Movimento> listMov;

	public Set<Movimento> getListMov() {
		return listMov;
	}

	public void setListMov(Set<Movimento> listMov) {
		this.listMov = listMov;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(int plataforma) {
		this.plataforma = plataforma;
	}

	public char getCodAtivo() {
		return codAtivo;
	}

	public void setCodAtivo(char codAtivo) {
		this.codAtivo = codAtivo;
	}

	public String getNomeAtivo() {
		return nomeAtivo;
	}

	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
