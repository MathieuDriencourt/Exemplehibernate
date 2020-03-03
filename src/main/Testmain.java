package main;

import java.util.List;

import dao.DaoProduit;
import dao.IProduit;
import model.Produit;

public class Testmain {
public static void main(String[] args) {
	Produit prod = new Produit(55, "galaxy S10","génial");
	
	IProduit dao = new DaoProduit();
//	dao.create(prod);
	
	
	List<Produit> liste = dao.getProduits();
	for (Produit pro : liste) {
		System.out.println(liste.toString());
	}
	
	
}
}
