package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Artikel;
import models.DbManager;
import models.Lieferant;

/**
 * Servlet implementation class HoleArtikelVonLieferant
 */
@WebServlet("/HoleArtikelVonLieferant")
public class HoleArtikelVonLieferant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HoleArtikelVonLieferant() {
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
		String name = request.getParameter("name");
		
		DbManager db = DbManager.getInstance();
		Connection conn = db.getConnection();
		
		Lieferant l = db.holeLieferantByName(conn, name);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("LiefId", l.getLieferantId());
		session.setAttribute("LiefName", l.getName());
		session.setAttribute("LiefEmail", l.getEmail());
		
		List<Artikel> arts = db.holeArtikelVonLieferant(conn, l);

		Gson g = new GsonBuilder().create();
		String json = g.toJson(arts);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.append(json);
		out.flush();
		
		db.releaseConnection(conn);
	}
}
