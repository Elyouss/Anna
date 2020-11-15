package org.sid.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;




@Data
@Entity
@Table(name="product")
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private  ProductPK productId;
	
	private String name;
	
	@OneToMany( mappedBy = "product", targetEntity = Magasin.class ) 
	@MapKey ( name = "storedId")
	private Map<Magasin, Integer> stock  = new HashMap<Magasin, Integer>();

	private int quantite;
	@OneToOne
	private Ligne ligne;
	
	
	public Product() {
	}
	

	public Product(ProductPK productId, String name,  Map<Magasin, Integer> stock, Ligne ligne) {
		this.productId = productId;
		this.name = name;
		this.stock = stock;
		this.ligne = ligne;
	}



	public Product(ProductPK productId, String name) {
		this.productId = productId;
		this.name = name;
	}


	public Product(ProductPK productId, String name,Map<Magasin, Integer> stock) {
		super();
		this.productId = productId;
		this.name = name;
		this.stock = stock;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ligne getLigne() {
		return ligne;
	}
	public void setLigne(Ligne ligne) {
		this.ligne = ligne;
	}







	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", stock=" + stock + "]";
	}


	public ProductPK getId() {
		return productId;
	}






	public void setId(ProductPK productId) {
		this.productId = productId;
	}







	public ProductPK getProductId() {
		return productId;
	}







	public void setProductId(ProductPK productId) {
		this.productId = productId;
	}







	public Map<Magasin, Integer> getStock() {
		return stock;
	}







	public void setStock(Map<Magasin, Integer> stock) {
		this.stock = stock;
	}















	
	

}
