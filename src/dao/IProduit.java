package dao;

import model.Produit;

public interface IProduit {
	
	public int create(Produit pr);
	public int supprimerProduit(int id);
	public int afficherProduits();

}
