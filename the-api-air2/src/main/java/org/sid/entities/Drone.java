package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Drone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId 
	private DronePK droneId;
	private Integer xPosition;
	private Integer yPosition;
	@ManyToMany
	private Collection<Customer> customers;
	@ManyToOne
	private Ligne ligne;
	@ManyToMany
	private Collection<Magasin> magasin;
	
	public static final Integer  DISTANCE_PARCOURU_MAX = 100;
	
	
	public Drone() {
	}

	
	
	public Drone(DronePK droneId, Integer xPosition, Integer yPosition) {
		this.droneId = droneId;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}



	public Drone(DronePK droneId, Integer xPosition, Integer yPosition, Collection<Customer> customers, Ligne ligne) {
		this.droneId = droneId;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.customers = customers;
		this.ligne = ligne;
	}


	public DronePK getDroneId() {
		return droneId;
	}


	public void setDroneId(DronePK droneId) {
		this.droneId = droneId;
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

	
	public Collection<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(Collection<Customer> customers) {
		this.customers = customers;
	}



	public Ligne getLigne() {
		return ligne;
	}



	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}



	public Collection<Magasin> getMagasin() {
		return magasin;
	}



	public void setMagasin(Collection<Magasin> magasin) {
		this.magasin = magasin;
	}
	

}
