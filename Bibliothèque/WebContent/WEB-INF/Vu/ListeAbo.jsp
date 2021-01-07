<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "co.simplon.model.Biblio.*, java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LISTE ABONNE</title>
<link href="http://localhost:8094/Bibliothèque/commun/css/DecoLivre.css" rel="stylesheet" type="text/css">
</head>
<body>

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

<div id="ensemble">
<h1 id="titre">LISTE</h1>
<br>
<br>
<br>
<table id="abonne">
<thead>
<tr>
<th id="listAbo">Liste Abonne</th>
</tr>

<td>ID</td>
<td>Nom</td>
<td>Prenom</td>
<td>Pays</td>
<td>Téléphone</td>
<td>Livre Recherché</td>
<td>Livre Emprunté</td>
<td>Catégorie Professionnelle</td>

</thead>
<tbody>
<c:forEach var="valeur" items="${requestScope.ListeAbonne}">
<tr> 
<td><c:out value="${valeur.num_matricule}"/></td>
<td><c:out value="${valeur.nom}"/></td>
<td><c:out value="${valeur.prenom}"/></td>
<td><c:out value="${valeur.pays}"/></td>
<td><c:out value="${valeur.téléphone}"/></td>
<td><c:out value="${valeur.livre_Recherché}"></c:out></td>
<td><c:out value="${valeur.livre_Emprunté}"></c:out></td>
<td><c:out value="${valeur.catégorie_pro}"></c:out></td>
<td><a href="<c:url value="gestionbiblio?action=update&num_matricule=${valeur.num_matricule}&nom=${valeur.nom}&prenom=${valeur.prenom}"/>"class="modifier">MODIFIER</a></td>
<td><a href="<c:url value="gestionbiblio?action=delete&num_matricule=${valeur.num_matricule}"/>"class="effacer">EFFACER</a> </td>
</tr>
</c:forEach>
</tbody>
</table>
<br>
<br>
<br>
<br>
<br>
<table id="livre">
<thead>
<tr>
<th>Liste Livre</th>
</tr>
<td>Num Livre</td>
<td>Titre</td>
<td>Disponibilité</td>
<td>Langue</td>
</thead>
<tbody>
<c:forEach var="valeur" items="${requestScope.ListeLivre}">
<tr>
<td><c:out value="${valeur.num_Livre}"/></td>
<td><c:out value="${valeur.titre_Livre}"/></td>
<td><c:out value="${valeur.dispo_emprunt}"/></td>
<td><c:out value="${valeur.langue_Livre}"/></td>

<td><a href="<c:url value="gestionbiblio?action=update&num_Livre=${valeur.num_Livre}&titre_Livre=${valeur.titre_Livre}"/>"class="modifier">MODIFIER</a></td>
<td><a href="<c:url value="gestionbiblio?action=delete&num_Livre=${valeur.num_Livre}"/>"class="effacer">EFFACER</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>

<footer id="pied">
<p>Lorem;l;hlcx;l;xx;<br>vxl;lxxl;v;xxfkodklo<br>dkfokdogk<br>flgkdkofkdgok<br>dgokdogodk<br>godkgodkgok<br>godogodk</p>
</footer>



</body>
</html>