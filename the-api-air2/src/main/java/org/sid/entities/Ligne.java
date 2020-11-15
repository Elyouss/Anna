package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Ligne implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;

	private HashMap<Product, Integer> ligneCommandes;
	
	@ManyToOne
	private Commande commande;
	
	@OneToMany(mappedBy="ligne")
	private Collection<Drone> drones;
	
	
	
	  public Ligne() {
	}

	
	
	public Ligne(Long id, HashMap<Product, Integer> ligneCommandes, Commande commande) {
		this.id = id;
		this.ligneCommandes = ligneCommandes;
		this.commande = commande;
	}



	public Ligne(HashMap<Product, Integer> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}



	public Ligne(Long id, HashMap<Product, Integer> ligneCommandes, Commande commande, Collection<Drone> drones) {
		super();
		this.id = id;
		this.ligneCommandes = ligneCommandes;
		this.commande = commande;
		this.drones = drones;
	}



	public HashMap<Product, Integer> getLigneCommandes() {
        return ligneCommandes;
    }




	public void setLigneCommandes(HashMap<Product, Integer> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Collection<Drone> getDrones() {
		return drones;
	}
	public void setDrones(Collection<Drone> drones) {
		this.drones = drones;
	}
	
	
}
