package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class ProductPK implements Serializable { 
	private static final long serialVersionUID = 1L;
    @Column(name="id_product_a", nullable=false,unique=true)
    private String idProductA;
    
    @Column(name="id_product_b", nullable=false,unique=true)
    private Long idProductB;
    
    
	public ProductPK(String idProductA, Long idProductB) {
		this.idProductA = idProductA;
		this.idProductB = idProductB;
	}
	

	public ProductPK() {
		super();
	}
	public String getIdA() {
		return this.idProductA;
	}
	public void setIdA(String idProductA) {
		this.idProductA = idProductA;
	}
	public Long getIdB() {
		return this.idProductB;
	}
	public void setIdB(Long idProductB) {
		this.idProductB = idProductB;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = prime * this.idProductA.hashCode();
		hash = prime * this.idProductB.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ProductPK)) {
			return false;
		}
		ProductPK castOther = (ProductPK)obj;
		return 
			this.idProductA.equals(castOther.idProductA)
			&& this.idProductB.equals(castOther.idProductB);
	}
    
}
