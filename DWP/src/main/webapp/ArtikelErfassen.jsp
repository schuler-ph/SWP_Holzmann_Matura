<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Neuen Artikel erfassen</title>
</head>
<body>
<!--  <form method="post" action="SpeichereArtikel">-->

<label for="bez">Bezeichnung: </label>
<input id="bez" name="bez" type="text"> <br>

<label for="besch">Beschreibung: </label>
<input id="besch" name="besch" type="text"> <br>

<label for="vpn">Verkaufspreis Netto: </label>
<input id="vpn" name="vpn" type="number" step="0.01"> <br>

<label for="lid">LieferantId: </label>
<input id="lid" name="lid" type="number" step="1"> <br>

<button type="submit" onclick="SpeichereArtike()">Speichern</button>
<!--  </form>-->

<script>
function SpeichereArtikel(){
	const xhttp = new XMLHttpRequest();

	xhttp.open("Post", "SpeichereArtikel", true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	
	var bez = document.getElementById("bez").value;
	var besch = document.getElementById("bez").value;
	var vpn = document.getElementById("bez").value;
	var lid = document.getElementById("bez").value;
	
	xhttp.send("bez="+bez+"&besch="+besch+"&vpn="+vpn+"&lid"+lid);
}

</script>
</body>
</html>