<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
        <a class="navbar-brand" href="theme3.html"><h1 class="application-name display-3">Library</h1></a>
        <span>
            <a class="btn btn-dark btn-lg m-1" href="Acceuil.html"><i class="fas fa-sign-out-alt mr-1"></i>Logout</a>
			<a class="btn btn-dark btn-lg m-1" href="user.html"><i class="fas fa-user mr-1"></i>User</a>
			<a class="btn btn-dark btn-lg m-1" href="signature.html"><i class="fas fa-user mr-1"></i>User</a>
        </span>
    </header>
    
     <c:if test="${not empty error }">
     <p class="alert alert-danger text-center"><strong>${error}</strong></p>
     </c:if>

	<h2 class="text-center display-3">Welcome !</h2>

    <div class="rox col-12 container-fluid">

        <div class="col-6">
            <a class="btn btn-success btn-lg m-1" href="bookAdd">Add Book</a>
			<a class="btn btn-success btn-lg m-1" href="bookSearch">Search a book</a>
			<a class="btn btn-success btn-lg m-1" href=""></a>
        </div>

    </div>

    <footer class="navbar navbar-dark bg-success mt-auto mb-0 rounded">
        <ul class="navbar-nav navbar-expand-sm">
            <li>
                <a class="navbar-text text-dark ml-2 mr-2" href="https://www.linkedin.com/in/olivier-guiot-48586a156">
                    <i class="fab fa-linkedin"></i>
                </a>
            </li>
            <li>
                <a class="navbar-text text-dark ml-2 mr-2" href="https://www.linkedin.com/in/olivier-guiot-48586a156">
                    <i class="fab fa-facebook-square"></i>
                </a>
            </li>
        </ul>
        <p><a class="navbar-text" href="https://www.w3schools.com/default.asp">Formation developpeur JAVA</a></p>
        <p class="navbar-text">Exemple d'interface administration propulsé avec BOOTSTRAP 4.4</p>
    </footer>

	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>
