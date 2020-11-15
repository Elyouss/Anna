package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CustomerPK customerId;
	
	private Integer xPosition;
	
	private Integer yPosition;
	
	@OneToMany
	private Collection<Commande> commandes;
	

	public Customer() {
		super();
	}
	
	

	public Customer(CustomerPK customerId, Integer xPosition, Integer yPosition) {
		super();
		this.customerId = customerId;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}



	public Customer(CustomerPK customerId, Integer xPosition, Integer yPosition, Collection<Commande> commandes) {
		super();
		this.customerId = customerId;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.commandes = commandes;
	}

	public CustomerPK getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerPK customerId) {
		this.customerId = customerId;
	}

	public Integer getxPosition() {
		return xPosition;
	}

	public void setxPosition(Integer xPosition) {
		this.xPosition = xPosition;
	}

	public Integer getyPosition() {
		return yPosition;
	}

	public void setyPosition(Integer yPosition) {
		this.yPosition = yPosition;
	}

	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}


	

	
	
}
