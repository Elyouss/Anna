package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class CommandePK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
    private String idOrderA;
    @Column
    private Long idOrderB;
    
    
    
	public CommandePK(String idOrderA, Long idOrderB) {
		super();
		this.idOrderA = idOrderA;
		this.idOrderB = idOrderB;
	}
	
	
	public CommandePK() {
		super();
	}


	public String getIdA() {
		return idOrderA;
	}
	public void setIdA(String idOrderA) {
		this.idOrderA = idOrderA;
	}
	public Long getIdB() {
		return idOrderB;
	}
	public void setIdB(Long idOrderB) {
		this.idOrderB = idOrderB;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = prime * this.idOrderA.hashCode();
		hash = prime * this.idOrderB.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CommandePK)) {
			return false;
		}
		CommandePK castOther = (CommandePK)obj;
		return 
			this.idOrderA.equals(castOther.idOrderA)
			&& this.idOrderB.equals(castOther.idOrderB);
	}
    
}
