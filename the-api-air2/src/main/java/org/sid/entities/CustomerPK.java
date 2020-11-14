package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class CustomerPK implements Serializable{
	@Column
    private String idCustomerA;
    @Column
    private Long idCustomerB;
    
    
	public CustomerPK(String idCustomerA, Long idCustomerB) {
		super();
		this.idCustomerA = idCustomerA;
		this.idCustomerB = idCustomerB;
	}
	
	
	public CustomerPK() {
		super();
	}


	public String getIdA() {
		return idCustomerA;
	}
	public void setIdA(String idCustomerA) {
		this.idCustomerA = idCustomerA;
	}
	public Long getIdB() {
		return idCustomerB;
	}
	public void setIdB(Long idCustomerB) {
		this.idCustomerB = idCustomerB;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = prime * this.idCustomerA.hashCode();
		hash = prime * this.idCustomerB.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CustomerPK)) {
			return false;
		}
		CustomerPK castOther = (CustomerPK)obj;
		return 
			this.idCustomerA.equals(castOther.idCustomerA)
			&& this.idCustomerB.equals(castOther.idCustomerB);
	}
    
    
}
