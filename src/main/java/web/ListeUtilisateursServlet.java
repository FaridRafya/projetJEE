package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ListeUtilisateursServlet
 */
@WebServlet("/ListeUtilisateursServlet")
public class ListeUtilisateursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeUtilisateursServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  List<Utilisateur> utilisateurs = new ArrayList<>();
	        utilisateurs.add(new Utilisateur("Doe", "John", "john.doe@example.com"));
	        utilisateurs.add(new Utilisateur("Smith", "Jane", "jane.smith@example.com"));
	        utilisateurs.add(new Utilisateur("Johnson", "Bob", "bob.johnson@example.com"));
	        
	        request.setAttribute("utilisateurs", utilisateurs);
	        request.getRequestDispatcher("listeUtilisateurs.jsp").forward(request, response);
	    }	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
