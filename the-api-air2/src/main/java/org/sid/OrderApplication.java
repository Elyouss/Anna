package org.sid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.sid.dao.CommandeRepository;
import org.sid.dao.CustomerRepository;
import org.sid.dao.DroneRepository;
import org.sid.dao.MagasinRepository;
import org.sid.dao.ProductRepository;
import org.sid.entities.Commande;
import org.sid.entities.CommandePK;
import org.sid.entities.Customer;
import org.sid.entities.CustomerPK;
import org.sid.entities.Drone;
import org.sid.entities.DronePK;
import org.sid.entities.Ligne;
import org.sid.entities.Magasin;
import org.sid.entities.MagasinPK;
import org.sid.entities.Product;
import org.sid.entities.ProductPK;
import org.sid.services.FonctionDrone;
import org.sid.dao.LigneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OrderApplication implements CommandLineRunner{
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private DroneRepository droneRepository;
	@Autowired
	private LigneRepository ligneRepository;
	@Autowired
	private CommandeRepository commandeRepository;
	@Autowired
	private MagasinRepository magasinRepository;
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
			Magasin magasin1 = new Magasin();
			magasin1.setStoredId(new MagasinPK("LMFR-", "VA"));
			magasin1.setxPosition(3);
			magasin1.setyPosition(3);
			Magasin magasin2 = new Magasin();
			magasin2.setStoredId(new MagasinPK("LMFR-", "RO"));
			magasin2.setxPosition(23);
			magasin2.setyPosition(45);
			Magasin magasin3 = new Magasin();
			magasin3.setStoredId(new MagasinPK("LMFR-", "LE"));
			magasin3.setxPosition(10);
			magasin3.setyPosition(14);
			magasinRepository.save(magasin1);
			magasinRepository.save(magasin2);
			magasinRepository.save(magasin3);
			Map <Magasin, Integer> map1 = new HashMap<Magasin, Integer>();
			map1.put(magasin1,10);
			map1.put(magasin2, 1);
			Map <Magasin, Integer> map2 = new HashMap<Magasin, Integer>();
			map2.put(magasin2, 3);
			map2.put(magasin3, 2);
			Map <Magasin, Integer> map3 = new HashMap<Magasin, Integer>();
			map3.put(magasin3, 1);
			map3.put(magasin1, 2);
			Product product1 = new Product(new ProductPK("LMFRPRD-",1L), "Shove1", map1);
			Product product2 = new Product(new ProductPK("LMFRPRD-",2L), "Pickaxe", map2);
			Product product3 = new Product(new ProductPK("LMFRPRD-",3L), "Rake",map3);
			
			productRepository.save(product1);
			productRepository.save(product2);
			productRepository.save(product3);
			
			Customer cus1 = new Customer(new CustomerPK("CUS-",1L), 5, 8);
			Customer cus2 = new Customer(new CustomerPK("CUS-",2L), 20, 20);
			Customer cus3 = new Customer(new CustomerPK("CUS-",3L), 12, 3);
			customerRepository.save(cus1);
			customerRepository.save(cus2);
			customerRepository.save(cus3);
			Commande commande1 = new Commande(new CommandePK("LMFRORDER-", 1L), cus1);
			Commande commande2 = new Commande(new CommandePK("LMFRORDER-", 2L), cus2);
			Commande commande3 = new Commande(new CommandePK("LMFRORDER-", 3L), cus3);
			Collection<Commande> commandes = new ArrayList<Commande>();
			commandes.add(commande1);
			commandes.add(commande2);
			commandes.add(commande3);
			commandeRepository.save(commande1);
			commandeRepository.save(commande2);
			commandeRepository.save(commande3);
			Drone drone1 = new Drone(new DronePK("LMDR-",1L),5, 10 );
			Drone drone2 = new Drone(new DronePK("LMDR-",2L),2, 7 );
			Drone drone3 = new Drone(new DronePK("LMDR-",3L),6, 20 );
			Drone drone4 = new Drone(new DronePK("LMDR-",4L),4, 43 );
			Drone drone5 = new Drone(new DronePK("LMDR-",5L),9, 9 );
			droneRepository.save(drone1);
			droneRepository.save(drone2);
			droneRepository.save(drone3);
			droneRepository.save(drone4);
			droneRepository.save(drone5);
			
			List<Drone> drones =  new ArrayList<Drone>();
			System.out.println("Order Application "+product1.getName());
			for( Drone drone : drones) {
				
				//chercher dans la liste des drones celui qui a à son compteur - 100 Km et 
				//qui peut faire le voyage 
				double distanceParcouru = Math.sqrt(Math.pow(2, (cus1.getxPosition() - magasin1.getxPosition())) + 
						(Math.pow(2,cus1.getyPosition()- magasin1.getyPosition())));
				if(distanceParcouru < 100) {
					FonctionDrone fonctionDrone =  (List<Commande> commandeRecup) -> {
						
						for(Commande commande : commandeRecup) {
							//TODO
				    		
						};
						return drones;
				};
				}
				}
	}

}
