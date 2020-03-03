package dao;



import java.util.List;

import model.Produit;

public interface IProduit {
	
	public int create(Produit pr);
	public int supprimerProduit(int id);
	public List<Produit> getProduits();

}
