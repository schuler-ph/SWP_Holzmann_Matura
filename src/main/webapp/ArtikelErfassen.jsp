<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Neuen Artikel erfassen</title>
</head>
<body>
<form method="post" action="SpeichereArtikel">

<label for="bez">Bezeichnung: </label>
<input id="bez" name="bez" type="text"> <br>

<label for="besch">Beschreibung: </label>
<input id="besch" name="besch" type="text"> <br>

<label for="vpn">Verkaufspreis Netto: </label>
<input id="vpn" name="vpn" type="number" step="0.01"> <br>

<label for="lid">LieferantId: </label>
<input id="lid" name="lid" type="number" step="1"> <br>

<button type="submit">Speichern</button>
</form>
</body>
</html>