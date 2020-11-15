package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class MagasinPK implements Serializable{
		private static final long serialVersionUID = 1L;
		//@Column(name="id_stored_a")
	    private String idStoredA;
	    //@Column(name="id_stored_b")
	    private String idStoredB;
	    
	    
		public MagasinPK() {
			
		}

		
		public MagasinPK(String idStoredA, String idStoredB) {
			this.idStoredA = idStoredA;
			this.idStoredB = idStoredB;
		}


		public String getIdA() {
			return this.idStoredA;
		}
		public void setIdA(String idStoredA) {
			this.idStoredA = idStoredA;
		}
		public String getIdB() {
			return this.idStoredB;
		}
		public void setIdB(String idStoredB) {
			this.idStoredB = idStoredB;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = prime * this.idStoredA.hashCode();
			hash = prime * this.idStoredB.hashCode();
			return hash;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof MagasinPK)) {
				return false;
			}
			MagasinPK castOther = (MagasinPK)obj;
			return 
				this.idStoredA.equals(castOther.idStoredA)
				&& this.idStoredB.equals(castOther.idStoredB);
		}
	    
	    

}
