/**
 * 
 */

function HoleLieferanten() {
	const xhttp = new XMLHttpRequest();
	  xhttp.onload = function() 
	  {
		  var arr = JSON.parse(this.responseText);
		  console.log(arr);
		  outputNamen(arr);
	  }
	  xhttp.open("Post", "HoleLieferantenNamen", true);
	  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	  xhttp.send();
}

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