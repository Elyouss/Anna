package org.sid.services;

import java.util.List;

import org.sid.entities.Commande;
import org.sid.entities.Drone;

public interface FonctionDrone {
	
	 List<Drone> listeDrone(List<Commande> commande);
}
