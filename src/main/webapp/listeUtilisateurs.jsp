<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Utilisateurs</title>
</head>
<body>
    <h1>Liste des Utilisateurs</h1>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${utilisateurs}" var="utilisateur">
            <tr>
                <td>${utilisateur.nom}</td>
                <td>${utilisateur.prenom}</td>
                <td>${utilisateur.email}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath}/ajoutUtilisateur.jsp">Ajouter un utilisateur</a>
</body>
</html>
