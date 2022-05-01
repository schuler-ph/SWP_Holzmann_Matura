<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="models.*"
	import="java.sql.Connection"
	import="java.util.List"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Artikel�bersicht</title>
</head>
<body>

<h1>Artikel�bersicht</h1>

<label>Lieferant ausw�hlen:</label>
<select name="lieferantenSelect" id="lieferantenSelect">
<%
DbManager db = DbManager.getInstance();
Connection conn = db.getConnection();
List<String> l = db.holeLieferantenNamen(conn);

for(String s : l){
	out.append("<option value='" + s + "'>" + s + "</option>");
}
%>
</select>

<button onclick="HoleArtikelVonLieferant()">Artikel anzeigen</button>
<br>

<table id="artikelTable">
</table>

<a href="ArtikelErfassen.jsp?name=Hans"><Button type="button">Neuen Artikel erfassen</Button></a>

<script src="Artikeluebersicht.js"></script>
</body>
</html>