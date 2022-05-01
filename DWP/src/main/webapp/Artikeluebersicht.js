function outputNamen(arr) {	
	var str = "";
	for(var i = 0; i<arr.length;i++)
	{
		name = arr[i]
		str += '<option value="'+name+'">'+name+'</option>';
	}
	var element = document.getElementById("lieferantenSelect");
	element.innerHTML = str;
}

function outputArtikel(arr){
	var str = "<thead> <th>ArtikelId</th> <th>Bezeichnung</th> <th>Beschreibung</th> <th>VerkaufspreisNetto</th> <th>LieferantId</th> <th>Bearbeiten</th> </thead>";
	
	for(var i = 0; i<arr.length;i++)
	{
		e = arr[i]
		str += "<tr>"
		str += "<td>"+ e.ArtikelId +"</td>"
		str += "<td>"+ e.Bezeichnung +"</td>"
		str += "<td>"+ e.Beschreibung +"</td>"
		str += "<td>"+ e.VerkaufspreisNetto +"</td>"
		str += "<td>"+ e.LieferantId +"</td>"
		str += "<td><a href='ArtikelBearbeiten.jsp"
		str += "?id=" + e.ArtikelId
		str += "&bez=" + e.Bezeichnung
		str += "&besch=" + e.Beschreibung
		str += "&vpn=" + e.VerkaufspreisNetto
		str += "&lid=" + e.LieferantId
		str += "'><button>Bearbeiten</button></a></td>"
		str += "</tr>"
	}
	var element = document.getElementById("artikelTable");
	element.innerHTML = str;
}

/*
const xhttp = new XMLHttpRequest();

xhttp.onload = function() {
	var arr = JSON.parse(this.responseText);
	console.log(arr);
	outputNamen(arr);
}

xhttp.open("Post", "HoleLieferantenNamen", true);
xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xhttp.send();*/

function HoleArtikelVonLieferant(){
	const xhttp = new XMLHttpRequest();

	xhttp.onload = function() {
		var arr = JSON.parse(this.responseText);
		console.log(arr);
		outputArtikel(arr);
	}
	
	xhttp.open("Post", "HoleArtikelVonLieferant", true);
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	
	var name = document.getElementById("lieferantenSelect").value;
	
	xhttp.send("name="+name);
}