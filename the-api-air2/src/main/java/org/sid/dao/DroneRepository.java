package org.sid.dao;

import org.sid.entities.Drone;
import org.sid.entities.DronePK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DroneRepository extends JpaRepository <Drone, DronePK>{

	
}
