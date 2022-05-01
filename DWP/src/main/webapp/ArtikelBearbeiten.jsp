<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Artikel bearbeiten</title>
</head>
<body>
<h1>Artikel bearbeiten</h1>
<%
int id = Integer.parseInt(request.getParameter("id"));
String bez = request.getParameter("bez");
String besch = request.getParameter("besch");
double vpn = Double.parseDouble(request.getParameter("vpn"));
int lid = Integer.parseInt(request.getParameter("lid"));
%>

<form method="post" action="BearbeiteArtikel">
<label for=id>Id:</label>
<input readonly name="id" value="<%=id%>"><br>

<label for=bez>Bezeichnung:</label>
<input name="bez" value="<%=bez%>"><br>

<label for=besch>Beschreibung:</label>
<input name="besch" value="<%=besch%>"><br>

<label for=vpn>Verkaufspreis Netto:</label>
<input name="vpn" value="<%=vpn%>"><br>

<label for=lid>Lieferanten Id:</label>
<input name="lid" value="<%=lid%>"><br>

<button type="submit">Absenden</button>
</form>
</body>
</html>