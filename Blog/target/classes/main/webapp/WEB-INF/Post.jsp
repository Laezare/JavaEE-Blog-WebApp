<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Poste - Blog</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="form.css" />
</head>

<body>


	<div class="masthead"
		style="background-image: url('assets/blog-cia-france-home.jpg'); background-repeat: no-repeat; background-size: cover">
		<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-primary"
			id="mainNav">
			<div class="container">
				<a class="navbar-brand" href="servlet">Accueil</a>

				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="PostsList">Liste
							des postes</a></li>
					<li class="nav-item"><a class="nav-link" href="CreatePost">Créer
							un poste</a></li>
					<li class="nav-item"><a class="nav-link" href="Auteur">Auteur</a>
					</li>
				</ul>
			</div>
		</nav>

		<div class="overlay"></div>
		<div class="container" style="width: 100%; height: 450px;">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="post-heading">
						<h1
							style="color: white; font-size: 60px; text-align: center; font-weight: bold; padding-top: 2em">
							${article.titre}</h1>
						<span class="meta"
							style="color: white; font-size: 20px; text-align: left; margin-top: 2em; display: block">Posted
							by ${article.auteur} on ${article.date}</span>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- Bootstrap card for each article -->

	<div class="container" style="width: 100%; height: auto;">
		<div class="row">
			<div class="col-lg-8 col-md-10 mx-auto"
				style="font-size: 25px; margin-top: 3em">
				<c:out value="${article.texte}" />
			</div>
		</div>
	</div>

</body>

<footer class="page-footer ">
	<div class="mt-5 pt-5 pb-5 page-footer bg-primary">
		<div class="container ">
			<div class="row">
				<div class="col-lg-5 col-xs-12 about-company">
					<h2 style="color: white">A propos</h2>
					<p class="pr-5 text-white">Ce blog est un projet d'essai.</p>
					<p class="pr-5 text-white">
						Source de l'image: <a
							href=https://cdn.cia-france.com/blog/img/blog-cia-france-home.jpg
							style="color: white">https://cdn.cia-france.com/blog/img/blog-cia-france-home.jpg</a>
					</p>
				</div>
				<div class="col"></div>
				<div class="col-lg-55 col-xs-12 contact" style="color: white">
					<h4 class="mt-lg-0 mt-sm-4">Contact</h4>
					<i class="fa fa-envelope-o mr-3" style="color: white">victor.pineau@ynov.com</i>
				</div>
			</div>
			<div class="row mt-5">
				<div class="col copyright">
					<p class="">
						<small class="text-white-50">© 2020. All Rights Reserved.</small>
					</p>
				</div>
			</div>
		</div>
	</div>

</footer>
</html>