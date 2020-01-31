<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="models.Book" import="models.Shelf"
	import="models.Author"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil library</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="css/all.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">


</head>

<body class="bg-dark">

	<header class="navbar navbar-dark bg-success rounded">
		<a class="navbar-brand" href="<%=request.getContextPath()%>"><h1
				class="application-name display-3">Library</h1></a> <span> <a
			class="btn btn-dark btn-lg m-1" href="Acceuil.html"><i
				class="fas fa-sign-out-alt mr-1"></i>Logout</a> <a
			class="btn btn-dark btn-lg m-1" href="<%=request.getContextPath()%>"><i
				class="fas fa-user mr-1"></i>Accueil</a> <a
			class="btn btn-dark btn-lg m-1" href="signature.html"><i
				class="fas fa-user mr-1"></i>User</a>
		</span>
	</header>

	<h2 class="text-center display-3 mt-5 mb-5">Add book</h2>

	<form action="bookAdd" method="post">

		<div class="row col-12 mb-5">

			<section class="col-4 offset-1">

				<p class="form-group">
					<label for="title">book title</label> <input type="text"
						class="form-control" name="title" id="title" value="" requiered>
				</p>

				<p class="form-group">
					<label for="subtitle">book subtitle</label> <input type="text"
						class="form-control" name="subtitle" id="subtitle" value=""
						requiered>
				</p>

				<p class="form-group">
					<label for="publicationDate">Publication date</label> <input
						type="date" class="form-control" name="publicationDate"
						id="publicationDate" value="" requiered>
				</p>

				<p class="form-group">
					<label for="edition">Edition</label> <input type="text"
						class="form-control" name="edition" id="edition" value=""
						requiered>
				</p>

				<p class="form-group">
					<label for="editionDate">Edition date</label> <input type="date"
						class="form-control" name="editionDate" id="editionDate" value=""
						requiered>
				</p>

			</section>
			<section class="col-4 offset-2">

				<p class="form-group">
					<label for="authorLastName">Author last name</label> <input
						type="text" class="form-control" name="authorLastName"
						id="authorLastName" value="" requiered>
				</p>

				<p class="form-group">
					<label for="authorFirstName">Author first name</label> <input
						type="text" class="form-control" name="authorFirstName"
						id="authorFirstName" value="" requiered>
				</p>

				<p class="form-group">
					<label for="shelfRef">Shelf reference</label> <input type="text"
						class="form-control" name="shelfRef" id="shelfRef" value=""
						requiered>
				</p>

				<p class="form-group">
					<label for="shelfSection">Section</label> <input type="text"
						class="form-control" name="shelfSection" id="shelfSection"
						value="" requiered>
				</p>

				<p class="form-group">
					<label for="isbn">ISBN</label> <input type="text"
						class="form-control" name="isbn" id="isbn" value="" requiered>
				</p>

			</section>

		</div>
		<p class="form-group text-center mt-5">
			<input type="submit" id=""
				class="btn btn-lg btn-success align-item-center m-2 btn-valid-book"
				value="Valider"> <input type="reset"
				class="btn btn-lg btn-secondary m-2" name="reset" value="Reset">
		</p>

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
	<script src="js/main.js"></script>

</body>
</html>
