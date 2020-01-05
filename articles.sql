-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 05 jan. 2020 à 12:29
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `blog`
--

-- --------------------------------------------------------

--
-- Structure de la table `articles`
--

DROP TABLE IF EXISTS `articles`;
CREATE TABLE IF NOT EXISTS `articles` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `auteur` varchar(25) NOT NULL,
  `titre` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  `texte` varchar(3000) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `articles`
--

INSERT INTO `articles` (`id`, `auteur`, `titre`, `description`, `texte`, `date`) VALUES
(1, 'Bootstrap template', 'Man must explore', 'Problems look mighty small from 150 miles up', 'Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe, a round earth in which all the directions eventually meet, in which there is no center because every point, or none, is center â?? an equal earth which all men occupy as equals. The airman\'s earth, if free men make it, will be truly round: a globe in practice, not in theory.\r\n\r\nScience cuts two ways, of course; its products can be used for both good and evil. But there\'s no turning back from science. The early warnings about technological dangers also come from science.\r\n\r\nWhat was most significant about the lunar voyage was not that man set foot on the Moon but that they set eye on the earth.\r\n\r\nA Chinese tale tells of some men sent to harm a young girl who, upon seeing her beauty, become her protectors rather than her violators. That\'s how I felt seeing the Earth for the first time. I could not help but love and cherish her.\r\n\r\nFor those who have seen the Earth from space, and for the hundreds and perhaps thousands more who will, the experience most certainly changes your perspective. The things that we share in our world are far more valuable than those which divide us.\r\nThe Final Frontier\r\n\r\nThere can be no thought of finishing for â??aiming for the stars.â?? Both figuratively and literally, it is a task to occupy the generations. And no matter how much progress one makes, there is always the thrill of just beginning.\r\n\r\nThere can be no thought of finishing for â??aiming for the stars.â?? Both figuratively and literally, it is a task to occupy the generations. And no matter how much progress one makes, there is always the thrill of just beginning.\r\n\r\n    The dreams of yesterday are the hopes of today and the reality of tomorrow. Science has not yet mastered prophecy. We predict too much for the next year and yet far too little for the next ten.\r\n\r\nSpaceflights cannot be stopped. This is not the work of any one man or even a group of men. It is a historical process which mankind is carrying out in accordance with the natural laws of human development.\r\nReaching for the Stars\r\n\r\nAs we got further and further away, it [the Earth] diminished in size. Finally it shrank to the size of a marble, the most beautiful you can imagine. That beautiful, warm, living object looked so fragile, so delicate, that if you touched it with a finger it would crumble and fall apart. Seeing this has to change a man.\r\nTo go places and do things that have never been done before â?? thatâ??s what living is all about.\r\n\r\nSpace, the final frontier. These are the voyages of the Starship Enterprise. Its five-year mission: to explore strange new worlds, to seek out new life and new civilizations, to boldly go where no man has gone before.\r\n\r\nAs I stand out here in the wonders of the unknown at Hadley, I sort of realize thereâ??s a fundamental truth to our nature, Man must explore, and this is exploration at its greatest.', '2020-01-05'),
(2, 'Lorem Ipsum', 'Lorem Ipsum', '\"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"', '\r\n\r\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi nec leo posuere, tempor elit ut, feugiat turpis. Vestibulum a convallis est, vitae auctor massa. Pellentesque posuere urna tellus, eget tempus tortor dapibus sit amet. Vivamus rutrum volutpat ex non suscipit. Sed ligula risus, laoreet ac vulputate non, rhoncus eget magna. Integer tincidunt et nulla quis ultrices. Vivamus efficitur sed magna eu feugiat. Cras erat erat, eleifend condimentum tristique sit amet, feugiat a urna. Aliquam urna enim, gravida eu velit eleifend, faucibus egestas arcu. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec dapibus metus eros, tempus interdum justo euismod porta. Ut lobortis magna non rutrum aliquam.\r\n\r\nPellentesque ultrices magna risus. Donec rutrum lacus quis dui accumsan aliquet. Donec scelerisque dui eu varius bibendum. Fusce a dui semper, gravida est et, hendrerit massa. Nam sagittis, ipsum nec pellentesque vestibulum, enim massa bibendum est, sed condimentum dui lorem id eros. Nulla lacinia ligula dolor, sed commodo ligula pretium ut. Aliquam sollicitudin ultrices leo, ut mollis odio malesuada sit amet. Sed id lacus fermentum, faucibus quam nec, semper massa. Maecenas luctus nibh non est tincidunt tempor. Sed id rhoncus sapien. Nulla egestas, ante nec volutpat consectetur, purus ligula accumsan ex, in rutrum lectus mauris ac lorem.\r\n\r\nNullam eget risus arcu. Vestibulum ultricies auctor cursus. Praesent tempus posuere est, vel tincidunt ipsum vehicula quis. Sed enim nulla, eleifend sagittis aliquam in, pellentesque quis neque. Morbi elit nunc, tincidunt eu nisl nec, efficitur hendrerit dolor. Sed vehicula ut ipsum ut tincidunt. Nullam commodo risus tortor, nec porttitor sapien volutpat at. Vivamus quis mi ipsum.\r\n\r\nSed molestie, ligula volutpat pretium laoreet, lacus diam congue sem, id euismod ipsum ligula eget justo. Suspendisse potenti. Vestibulum congue nulla quis nisi scelerisque aliquam. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent id neque felis. Cras dapibus leo quam, eget euismod risus efficitur sit amet. Morbi eget tellus cursus, blandit ligula a, ultrices nunc. Sed vel rhoncus nunc, ac convallis est. In bibendum rutrum leo quis elementum. Vivamus id elementum lorem. Integer elit ante, iaculis nec venenatis in, dapibus non turpis.\r\n\r\nProin in venenatis lacus, id finibus eros. Nam pretium varius lectus, non consectetur ipsum auctor et. Pellentesque in nisl efficitur, ornare eros eget, ultricies nunc. Integer pellentesque sem diam, in fermentum neque consectetur non. Nullam et posuere velit, et volutpat quam. Phasellus laoreet mi ac arcu pulvinar malesuada. Duis porttitor magna sed nisi venenatis, eu dignissim massa tristique. Nulla egestas, nunc vitae porta tempor, dolor nibh tristique sem, non feugiat justo nulla eu mauris. ', '2020-01-05'),
(3, 'Laezare', 'Test final', 'Le dernier teste CRUD', 'Avec ce dernier test, je conclue la bonne implÃ©mentation des consignes. Note: Le bonus n\'a pas Ã©tÃ© effectuÃ©. La table SQL admet 25chars pour l\'auteur, 50 le titre, 100 la description et 3000 le texte.', '2020-01-05');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
