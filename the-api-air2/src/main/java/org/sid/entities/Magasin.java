package org.sid.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Magasin implements Serializable{
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	@Column(name="stored_id",nullable=false,unique=true)
	private MagasinPK storedId;
	private int xPosition;
	private int yPosition;
	@ManyToOne
	private Product product;
	

	public Magasin() {
		
	}

	
	public Magasin(MagasinPK storedId, int xPosition, int yPosition) {
		System.out.println("----------CONSTRUCTEUR---------------------champ storedId"+storedId);
		this.storedId = storedId;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	

	public Magasin(MagasinPK storedId) {
		this.storedId = storedId;
	}


	public Magasin(MagasinPK storedId, int xPosition, int yPosition, Product product) {
		this.storedId = storedId;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.product = product;
	}


	public Magasin(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		
		this.yPosition = yPosition;
	}


	public MagasinPK getStoredId() {
		return this.storedId;
	}

	public void setStoredId(MagasinPK storedId) {
		this.storedId = storedId;
	}

	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}




	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}


	public Product getStocks() {
		return product;
	}


	public void setStocks(Product product) {
		this.product = product;
	}


	
}
