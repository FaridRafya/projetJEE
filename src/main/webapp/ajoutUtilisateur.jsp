<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter un Utilisateur</title>
</head>
<body>
    <h1>Ajouter un Utilisateur</h1>
    <form action="${pageContext.request.contextPath}/AjoutUtilisateurServlet" method="post">
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom"><br>
        
        <label for="prenom">Prénom:</label>
        <input type="text" id="prenom" name="prenom"><br>
        
        <label for="email">Email:</label>
        <input type="text" id="email" name="email"><br>
        
        <input type="submit" value="Ajouter">
    </form>
    <a href="${pageContext.request.contextPath}/ListeUtilisateursServlet">Retour à la liste des utilisateurs</a>
</body>
</html>
