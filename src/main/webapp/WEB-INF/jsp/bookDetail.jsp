<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Detail</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/all.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-select.min.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>

<body class="bg-dark">

	<header class="navbar navbar-dark bg-success rounded">
		<a class="navbar-brand" href="<%=request.getContextPath()%>">
			<h1 class="application-name display-3">Library</h1>
		</a> <span> <a class="btn btn-dark btn-lg m-1" href="Acceuil.html"><i
				class="fas fa-sign-out-alt mr-1"></i>Logout</a> <a
			class="btn btn-dark btn-lg m-1" href="<%=request.getContextPath()%>"><i
				class="fas fa-user mr-1"></i>Accueil</a> <a
			class="btn btn-dark btn-lg m-1" href="signature.html"><i
				class="fas fa-user mr-1"></i>User</a>
		</span>
	</header>

	<h2 class="text-center display-3 mt-5 mb-5">Book details</h2>

	<div class="col-12 row">

		<form class="col-6 offset-1 text-center" action="bookDetail"
			method="GET">
			<h3>
				" <span class="bold">${book.title}</span> <span class="italic">${book.subtitle}</span>"
			</h3>
			<p>Writed by ${book.author.lastName} ${book.author.firstName}</p>
			<p>Publication date: ${book.publicationDate}</p>
			<p>Editor: ${book.edition}</p>
			<p>Reference: ${book.reference}</p>
			<p>Section: ${book.shelf.section}</p>
			<p>Shelf: ${book.shelf.name}</p>
			<p>ISBN: ${book.isbn}</p>
		</form>

		<section class="col-3 offset-1">
		<c:if test="${book.returned == true}"><p>This book is returned</c:if>
		<c:if test="${book.stocked == true}">and is stocked</p></c:if>
		<c:if test="${book.returned == false}"><p>This book is borrowed</c:if>
		<c:if test="${book.stocked == false}">and is not stocked</p></c:if>
		
		</section>

	</div>

	<form class="col-6 offset-1 text-center mt-5" action="bookDetail"
		method="post">
		<input type="text" class="btn btn-lg btn-success m-4 d-none"
			name="idHide" id="idHide" value="${book.id}"></input> <input
			type="submit" class="btn btn-lg btn-success m-4" name="borrowing"
			id="borrowing" value="Borrowing"></input> <input type="submit"
			class="btn btn-lg btn-success m-4" name="returned" id="returned"
			value="Returned"></input> <input type="submit"
			class="btn btn-lg btn-success m-4" name="stocked" id="stocked"
			value="Stocked"></input>
	</form>

	<footer class="navbar navbar-dark bg-success mt-auto mb-0 rounded">
		<ul class="navbar-nav navbar-expand-sm">
			<li><a class="navbar-text text-dark ml-2 mr-2"
				href="https://www.linkedin.com/in/olivier-guiot-48586a156"> <i
					class="fab fa-linkedin"></i>
			</a></li>
			<li><a class="navbar-text text-dark ml-2 mr-2"
				href="https://www.linkedin.com/in/olivier-guiot-48586a156"> <i
					class="fab fa-facebook-square"></i>
			</a></li>
		</ul>
		<p>
			<a class="navbar-text" href="https://www.w3schools.com/default.asp">Formation
				developpeur JAVA</a>
		</p>
		<p class="navbar-text">Exemple d'interface administration propulsé
			avec BOOTSTRAP 4.4</p>
	</footer>

	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/bootstrap-select.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>
