package ajouter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web.Utilisateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class AjoutUtilisateurServlet
 */
@WebServlet("/AjoutUtilisateurServlet")
public class AjoutUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("ajoutUtilisateur.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        
        Utilisateur nouvelUtilisateur = new Utilisateur(nom, prenom, email);
        
        List<Utilisateur> utilisateurs = (List<Utilisateur>) getServletContext().getAttribute("utilisateurs");
        if (utilisateurs == null) {
            utilisateurs = new ArrayList<>();
        }
        
        utilisateurs.add(nouvelUtilisateur);
        
        getServletContext().setAttribute("utilisateurs", utilisateurs);
        
        response.sendRedirect(request.getContextPath() + "/ListeUtilisateursServlet");
    }
}
