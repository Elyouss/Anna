package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class DronePK implements Serializable{
	@Column
    private String idDroneA;
    @Column
    private Long idDroneB;
    
    
    
	public DronePK(String idDroneA, Long idDroneB) {
		super();
		this.idDroneA = idDroneA;
		this.idDroneB = idDroneB;
	}
	
	public DronePK() {
		super();
	}

	public String getIdA() {
		return idDroneA;
	}
	public void setIdA(String idDroneA) {
		this.idDroneA = idDroneA;
	}
	public Long getIdB() {
		return idDroneB;
	}
	public void setIdB(Long idDroneB) {
		this.idDroneB = idDroneB;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = prime * this.idDroneA.hashCode();
		hash = prime * this.idDroneB.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DronePK)) {
			return false;
		}
		DronePK castOther = (DronePK)obj;
		return 
			this.idDroneA.equals(castOther.idDroneA)
			&& this.idDroneB.equals(castOther.idDroneB);
	}
    
}
