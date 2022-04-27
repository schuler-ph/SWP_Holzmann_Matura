package servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Artikel;
import models.DbManager;

/**
 * Servlet implementation class SpeichereArtikel
 */
@WebServlet("/SpeichereArtikel")
public class SpeichereArtikel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpeichereArtikel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bez = request.getParameter("bez");
		String besch = request.getParameter("besch");
		double vpn = Double.parseDouble(request.getParameter("vpn"));
		int lid = Integer.parseInt(request.getParameter("lid"));
		
		Artikel a = new Artikel(0, bez, besch, vpn, lid);
		
		DbManager db = DbManager.getInstance();
		Connection conn = db.getConnection();
		
		db.speichereArtikel(conn, a);
		db.releaseConnection(conn);
		
		RequestDispatcher rd = request.getRequestDispatcher("Artikeluebersicht.jsp");
		rd.forward(request, response);
	}

}
