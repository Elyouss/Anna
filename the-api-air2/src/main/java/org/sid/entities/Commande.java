package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Commande implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommandePK orderId;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy="commande")
	private Collection<Ligne> lignes;
	
	

	public Commande() {
		super();
	}






	public Commande(CommandePK orderId, Customer customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
	}






	public CommandePK getOrderId() {
		return orderId;
	}



	public void setCommandeId(CommandePK orderId) {
		this.orderId = orderId;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomers(Customer customer) {
		this.customer = customer;
	}



	public Collection<Ligne> getLignes() {
		return lignes;
	}



	public void setLignes(Collection<Ligne> lignes) {
		this.lignes = lignes;
	}

	
	
	
}
