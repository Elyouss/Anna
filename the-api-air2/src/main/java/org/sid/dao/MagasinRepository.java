package org.sid.dao;

import org.sid.entities.Magasin;
import org.sid.entities.MagasinPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagasinRepository extends JpaRepository<Magasin, MagasinPK>{
	
}
