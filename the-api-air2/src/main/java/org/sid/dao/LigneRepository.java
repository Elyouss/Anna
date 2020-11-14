package org.sid.dao;

import org.sid.entities.Ligne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneRepository extends JpaRepository<Ligne, Long> {

}
