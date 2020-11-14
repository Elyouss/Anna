package org.sid.dao;

import org.sid.entities.Commande;
import org.sid.entities.CommandePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, CommandePK>{

}
