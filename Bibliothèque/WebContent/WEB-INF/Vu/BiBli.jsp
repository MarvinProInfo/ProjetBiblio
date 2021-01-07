<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "co.simplon.model.Biblio.*, java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BIBLIOTHEQUE</title>
<link href="http://localhost:8094/Bibliothèque/commun/css/decoBibli.css" rel="stylesheet" type="text/css">
</head>
<body>

<header id="Img">
<img alt="Bblio" src="img/temoignage-bibliotheque.png">
</header>


<nav class="nav-bar">
<ul id="liste">
<li><a href="http://localhost:8094/Bibliothèque/acceuil">Acceuil</a></li>
<li><a href="http://localhost:8094/Bibliothèque/gestionbiblio">Ajout</a></li>
<li><a href="http://localhost:8094/Bibliothèque/aboliste">Liste</a></li>
</ul>


<br>
<br>
<br>
<br>
<br>
</nav>

<div id="corps">
<br>
<br>
<h1 id="titre1">
AJOUT D'ELEMENTS
</h1>
<br>
<br>
<br>
<h4 id="titreAbonnées">
Nouveaux abonnées</h4>
<br>
<br>
<br>
<form method = "post" action="gestionbiblio">

<p>
<label for = 'nom' id="labelNom">Nom : </label>
<input type = 'text' name = 'nom' id = 'nom' value="${requestScope.modifNom}"/>
<br>
<br>
<label for="prenom" id="labelPrenom">Prenom: </label>
<input type="text" name="prenom" id="prenom" value="${requestScope.modifPrenom}"/>
<br>
<br>
<label for="num_matricule" id="labelNumMat">Numéro matricule:    </label>
<input type="text" name="num_matricule" value="${requestScope.modifNum_matricule}" readonly>
<br>
<br>
</p>
<input type='submit' value="Ajouter" id="Ajouter">
</form>
<br>
<br>
<br>
<h4 id="titreLivre">Nouveaux Livres</h4>
<br>
<br>
<br>
<form method = "post" action="gestionbiblio">
<label for='titre_Livre' id="labelTitreLivre">Titre Livre:     </label>
<input type='text' name='titre_Livre'/>
<br>
<br>
<input type="submit" value="Ajouter" id="Ajouter">
</form>
<br>
<br>
<br>
</div>




<footer id="pied">
<p>Lorem;l;hlcx;l;xx;<br>vxl;lxxl;v;xxfkodklo<br>dkfokdogk<br>flgkdkofkdgok<br>dgokdogodk<br>godkgodkgok<br>godogodk</p>
</footer>


</body>
</html>