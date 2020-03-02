package dao;

import model.Produit;

public interface IProduit {
	
	public void create(Produit pr);
	public int supprimerProduit(int id);

}
