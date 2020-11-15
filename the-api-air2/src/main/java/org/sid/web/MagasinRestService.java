package org.sid.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sid.dao.MagasinRepository;
import org.sid.entities.Magasin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/magasin")
public class MagasinRestService {

	@Autowired
	private MagasinRepository magasinRepository;
	
	@GET
	@Path("/magasins")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Magasin> list(){
		return magasinRepository.findAll();
	}
}
