package br.com.itau.datagenerator.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="tab_platcli")
@AttributeOverride(name="id", column = @Column(name = "id_plataforma"))
public class Plataforma extends BaseModel<Integer> implements Serializable{

	 @Column(name="plataforma")
	private String Plataforma;
	 
	  public Plataforma() {
	    }

	    public Plataforma(int id) {
	        this.setId(id);
	    }

}
