package org.sid.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Magasin implements Serializable{
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private MagasinPK storedId;
	private int xPosition;
	private int yPosition;
	@ManyToOne
	private Product product;
	

	public Magasin() {
		
	}

	

	

	public Magasin(MagasinPK storedId) {
		this.storedId = storedId;
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
