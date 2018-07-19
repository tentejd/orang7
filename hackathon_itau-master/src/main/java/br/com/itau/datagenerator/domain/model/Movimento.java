package br.com.itau.datagenerator.domain.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name ="tb_regmov")
public class Movimento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_mov")
	private int id;
	
	@Column(name = "data")
	@CreationTimestamp
	private LocalDateTime data;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente idCliente;

	@Column(name = "tipo_c_v")
	private char tipo;

	@ManyToOne
	@JoinColumn(name = "id_ativo")
	private Ativo idAtivo;

	@Column(name = "qtde")
	private int quantidade;

	@Column(name = "valoroper")
	private double valor;
	
	public Movimento() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Ativo getIdAtivo() {
		return idAtivo;
	}

	public void setIdAtivo(Ativo idAtivo) {
		this.idAtivo = idAtivo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
