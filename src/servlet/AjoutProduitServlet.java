package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoProduit;
import dao.IProduit;
import model.Produit;

/**
 * Servlet implementation class AjoutProduitServlet
 */
@WebServlet("/add")
public class AjoutProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Produit pr = new Produit();
		pr.setNom(request.getParameter("name"));
		pr.setDescription(request.getParameter("description"));
		IProduit dao = new DaoProduit();
		int i = dao.create(pr);
		
		List<Produit> list = dao.getProduits();
		//j'ai besoin de déclarer une liste des produits qui reçoit 
		request.setAttribute("produit", list);
		
		if (i == 1) request.setAttribute("message", "this product was created successfully");
		else if (i == 0) request.setAttribute("message", "this product hasn't been created. Mistake ");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/produit.jsp").forward(request, response);
		
		
	}

}
