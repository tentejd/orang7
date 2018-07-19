package br.com.itau.datagenerator.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="tb_cadcli")
public class Cliente implements Serializable {
	
	@Id
	@Column(name="id_cliente")
    private int codigo;
	
    @Column(name="nome")
    private String nome;
    
    @Column(name="no_documento")
    private String documento;

    @Column(name="segmn_cli")
    private String segmento;

    @Column(name = "plataforma")
    private String plataforma;
    
    public Cliente() {
    	
    }

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
	}