# JavaEE-Blog-WebApp
PROJET FINAL : BLOG - VICTOR PINEAU B2B

RAPPEL:
Overview

L'objectif est de créer un blog en JavaEE. Les fonctionnalités classiques devront être implémentées. Le code source devra être herbégé sur un repository git dont j'aurais l'accès (mon compte: romainsessa). Le projet sera construit avec l'archetype webapp de Maven. Le projet devra être déployable dans un serveur Tomcat grâce au fichier .war (téléchargeable du repository).
Design

C'est avant tout le code Java qui sera évalué, cependant un design moderne (standard du web actuel) devra être mis en place.
Fonctionnalités

    Un article se définit par :

        un auteur
        un titre
        une courte description
        un texte
        une date

Consultation

L'application web permettra de :

    Consulter sur la page d'accueil les 2 derniers articles créés.
    Consulter la liste de tous les articles : affichage du titre, de l'auteur, de la courte description et de la date.
    Consulter un article de façon unitaire.
    Consulter la liste des auteurs avec pour chaque auteur la liste des titres des articles écrits.

Edition

L'application web permettre de :

    Ajouter un nouvel article (la date sera générée automatiquement).
    Modifier un article (la date sera générée automatiquement).
    Supprimer un article.

NOTE DE L'AUTEUR

    Le bonus n'a pas été effectué. 
    La table SQL admet 25chars pour l'auteur, 50chars le titre, 100chars la description et 3000chars pour le texte. 
    Les données de la table SQL ne sont pas encodées en UTF-8, se faisant il est possible qu'il y est des erreurs d'affichage          (notemmant les accents).
    La BDD se nomme "blog", avec comme utilisateur "root" et sans mdp. La table se nomme "articles" et est située à la racine du projet.

