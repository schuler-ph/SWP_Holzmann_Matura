package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbManager {
	private static DbManager instance = null;
	private static String url = "jdbc:mysql://localhost:3306/swp_holzmann";
	
	private DbManager() {}
	
	public static DbManager getInstance() {
		if (instance == null) {
			instance = new DbManager();
		}
		return instance;
	}

	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException in DBManager.getConnection()");
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.getConnection()");
		}
		
		return conn;
	}
	
	public void releaseConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
			else {
				System.out.println("No connection to close");
			}
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.closeConnection()");
		}
	}
	
	public void speichereArtikel(Connection conn, Artikel art) {
		String sql = "INSERT INTO artikel VALUES (null, ?, ?, ?, ?);";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(2, art.getBezeichnung());
			ps.setString(3, art.getBeschreibung());
			ps.setDouble(4, art.getVerkaufspreisNetto());
			ps.setInt(5, art.getLieferantId());
			ps.executeUpdate();
			System.out.println("Insert Artikel success");
		}
		catch (SQLException e) {
			System.out.println("Insert Artikel failed");
		}
	}
	
	public Lieferant holeLieferantByName(Connection conn, String name) {
		Lieferant lft = new Lieferant();
		String sql = "SELECT LieferantId, Name, Email, Ort, PLZ, Strasze, Hnr, Land FROM lieferant WHERE Name='" + name + "';";
		ResultSet rs = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				lft.setLieferantId(rs.getInt(1));
				lft.setName(rs.getString(2));
				lft.setEmail(rs.getString(3));
				lft.setOrt(rs.getString(4));
				lft.setPLZ(rs.getString(5));
				lft.setStrasze(rs.getString(6));
				lft.setHnr(rs.getString(7));
				lft.setLand(rs.getString(8));
			}
			rs.close();
			rs = null;

			System.out.println("Select Lieferant by Name success");
		}
		catch (SQLException e) {
			System.out.println("Select Lieferant by Name failed");
		}
		catch (NullPointerException e){
			System.out.println("Select Lieferant by Name failed");
		}
		
		return lft;
	}
	
	public List<String> holeLieferantenNamen(Connection conn){
		List<String> namen = new ArrayList<String>();
		String sql = "SELECT Name FROM lieferanten";
		ResultSet rs = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				namen.add(rs.getString(1));
			}
			rs.close();
			rs = null;

			System.out.println("Select Lieferanten Namen success");
		}
		catch (SQLException e) {
			System.out.println("Select Lieferanten Namen failed");
		}
		catch (NullPointerException e){
			System.out.println("Select Lieferanten Namen failed");
		}
		
		return namen;
	}
	
	public List<Artikel> holeArtikelVonLieferant(Connection conn, Lieferant l){
		List<Artikel> arts = new ArrayList<Artikel>();
		Artikel art = new Artikel();
		String sql = "SELECT ArtikelId, Bezeichnung, Beschreibung, VerkaufspreisNetto FROM artikel WHERE LieferantId=" + l.getLieferantId() + ";";
		ResultSet rs = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				art.setArtikelId(rs.getInt(1));
				art.setBezeichnung(rs.getString(2));
				art.setBeschreibung(rs.getString(3));
				art.setVerkaufspreisNetto(rs.getDouble(4));
				art.setLieferantId(l.getLieferantId());
				arts.add(art);
			}
			rs.close();
			rs = null;

			System.out.println("Select Artikel by LieferantId success");
		}
		catch (SQLException e) {
			System.out.println("Select Artikel by LieferantId failed");
		}
		catch (NullPointerException e){
			System.out.println("Select Artikel by LieferantId failed");
		}
		
		return arts;
	}

}

