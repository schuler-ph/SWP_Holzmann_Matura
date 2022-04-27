<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Artikelübersicht</title>
</head>
<body>

<h1>Artikelübersicht</h1>


<label>Lieferant auswählen:</label>


<select name="lieferantenSelect" id="lieferantenSelect">
</select>

<button onclick="HoleArtikelVonLieferant()">Artikel anzeigen</button>
<br>

<table id="artikelTable">
</table>

<a href="ArtikelErfassen.jsp?name=Hans"><Button type="button">Neuen Artikel erfassen</Button></a>

<script src="Artikeluebersicht.js"></script>
</body>
</html>