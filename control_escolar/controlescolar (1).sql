-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-07-2019 a las 04:01:57
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `controlescolar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id_usuario` int(11) NOT NULL,
  `n_completo` varchar(50) NOT NULL,
  `f_nacimiento` varchar(15) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `nomusuario` varchar(20) NOT NULL,
  `contraseña` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id_usuario`, `n_completo`, `f_nacimiento`, `sexo`, `correo`, `telefono`, `direccion`, `nomusuario`, `contraseña`) VALUES
(1, 'ningunos', '1985-08-22', 'Masculino', 'ninguno@s', '9513241121', 'calle 333', 'root', 'root');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion`
--

CREATE TABLE `asignacion` (
  `id_asignacion` int(11) NOT NULL,
  `id_grpdisponibles` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asignacion`
--

INSERT INTO `asignacion` (`id_asignacion`, `id_grpdisponibles`, `id_estudiante`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `id_docente` int(11) NOT NULL,
  `n_completo` varchar(50) NOT NULL,
  `cod_presu` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `año_ingreSEP` varchar(15) NOT NULL,
  `año_ingreESC` varchar(15) NOT NULL,
  `año_ingreZN` varchar(15) NOT NULL,
  `f_nacimiento` varchar(15) NOT NULL,
  `RFC` varchar(13) NOT NULL,
  `cargo` varchar(30) NOT NULL,
  `no_ident` varchar(10) NOT NULL,
  `contraseña` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`id_docente`, `n_completo`, `cod_presu`, `telefono`, `direccion`, `correo`, `CURP`, `año_ingreSEP`, `año_ingreESC`, `año_ingreZN`, `f_nacimiento`, `RFC`, `cargo`, `no_ident`, `contraseña`) VALUES
(1, 'Galli Munir Maximiliano Enrico', 'ADS', '95127872', 'Calle Arazola No. 110', 'hjmaximilianoenrico9@yopmail.c', 'GAMM890609HASLNX07', '1994-12-02', '2000-02-11', '2000-02-03', '2019-07-16', 'GAMM890609618', 'Maestro', '123', '123'),
(2, 'Bueno Sustaeta Ainara M.', 'AS321', '95173628', 'Bulevar Calcedo No. 246', 'dfsustaeta5@yopmail.com', 'BUSA890609HTLNSI03', '2003-07-06', '2000-07-20', '2018-09-08', '1983-06-11', 'BUSA890609U35', 'Maestro', '901', '901'),
(3, 'Sergio Bergaretxe Acarregui', 'CDSES2', '951283281', 'Hamilton No. 808', 'emacarregui12@yopmail.com', 'LMPP23JJW323DDEFW', '2019-06-01', '2019-06-02', '2019-06-03', '2019-06-04', 'H3HD344DS2E4G', 'Maestro', '5261', '5261');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `id_estudiante` int(11) NOT NULL,
  `matricula` varchar(10) NOT NULL,
  `n_completo` varchar(50) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `f_nacimiento` varchar(15) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `grp_sanguineo` varchar(5) NOT NULL,
  `id_grado` int(11) NOT NULL,
  `id_padre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id_estudiante`, `matricula`, `n_completo`, `CURP`, `f_nacimiento`, `sexo`, `grp_sanguineo`, `id_grado`, `id_padre`) VALUES
(1, '192311', 'Martinez Hernandez Diego', 'MAHP061016HOCRRDA4', '2001-10-01', 'Masculino', 'O -', 1, 1),
(2, '192302', 'Juarez Perez Luis LUIS', 'JUPJ120381HOCRRSR2', '1999-02-05', 'Masculino', 'O +', 3, 2),
(3, '1234', 'Perez Perez Pedro', 'OSORTPP123', '2019-06-01', 'Masculino', 'AB +', 2, 3),
(4, '432121', 'Perez Perez Maria', 'MSUEJFK123KJ', '1999-06-15', 'Femenino', 'B -', 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grado`
--

CREATE TABLE `grado` (
  `id_grado` int(11) NOT NULL,
  `numero` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grado`
--

INSERT INTO `grado` (`id_grado`, `numero`) VALUES
(1, '1º'),
(2, '2º'),
(3, '3º');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo_identificador`
--

CREATE TABLE `grupo_identificador` (
  `id_grupo` int(11) NOT NULL,
  `letra` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grupo_identificador`
--

INSERT INTO `grupo_identificador` (`id_grupo`, `letra`) VALUES
(1, 'A'),
(2, 'B'),
(3, 'C'),
(4, 'D');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `id_grado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre`, `id_grado`) VALUES
(1, 'Español', 1),
(2, 'Matematicas', 1),
(3, 'Biologia', 1),
(4, 'Geografia', 1),
(5, 'Ingles', 1),
(6, 'Artes', 1),
(7, 'Formacion civica y etica', 1),
(8, 'Historia', 1),
(9, 'Educacion Fisica', 1),
(10, 'Autonomia curricular', 1),
(11, 'Tutoria y educacion socioemocional', 1),
(12, 'Español II', 2),
(13, 'Matematicas II', 2),
(14, 'Ciencias II', 2),
(15, 'Ingles II', 2),
(16, 'Artes II', 2),
(17, 'Educacion Fisica II', 2),
(18, 'Formacion civica y etica II', 2),
(19, 'Historia II', 2),
(20, 'Autonomia curricular II', 2),
(21, 'Tutoria y educacion socioemocional II', 2),
(22, 'Español III', 3),
(23, 'Matematicas III', 3),
(24, 'Ciencias III', 3),
(25, 'Ingles III', 3),
(26, 'Artes III', 3),
(27, 'Educacion fisica III', 3),
(28, 'Formacion civica y etica III', 3),
(29, 'Historia III', 3),
(30, 'Autonomia curricular III', 3),
(31, 'Tutoria y educacion socioemocional III', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `padre`
--

CREATE TABLE `padre` (
  `id_padre` int(11) NOT NULL,
  `np_completo` varchar(50) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `padre`
--

INSERT INTO `padre` (`id_padre`, `np_completo`, `correo`, `telefono`, `direccion`) VALUES
(1, 'Perez Perez Maria', 'prznmaria@gmail.com', '9510901122', 'calle diaz ordaz'),
(2, 'Martinez Diaz Jose', 'josemtz@gmail.com', '9512531147', 'calle zapata numero 23'),
(3, 'Jose juan Martinez', 'jose@gmail.com', '9512227661', 'California 5'),
(4, 'Hugo', 'correo', '123', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `primeraño`
--

CREATE TABLE `primeraño` (
  `id_primeraño` int(11) NOT NULL,
  `grado` varchar(3) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `primeraño`
--

INSERT INTO `primeraño` (`id_primeraño`, `grado`, `id_grupo`, `id_estudiante`, `id_docente`) VALUES
(1, '1º', 1, 1, 1),
(2, '1º', 1, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `segundoaño`
--

CREATE TABLE `segundoaño` (
  `id_segundoaño` int(11) NOT NULL,
  `grado` varchar(3) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `segundoaño`
--

INSERT INTO `segundoaño` (`id_segundoaño`, `grado`, `id_grupo`, `id_estudiante`, `id_docente`) VALUES
(1, '2º', 3, 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `terceraño`
--

CREATE TABLE `terceraño` (
  `id_terceraño` int(11) NOT NULL,
  `grado` varchar(3) NOT NULL,
  `id_grupo` int(11) NOT NULL,
  `id_estudiante` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `terceraño`
--

INSERT INTO `terceraño` (`id_terceraño`, `grado`, `id_grupo`, `id_estudiante`, `id_docente`) VALUES
(1, '3º', 3, 2, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD PRIMARY KEY (`id_asignacion`),
  ADD KEY `asginargrpdis` (`id_grpdisponibles`),
  ADD KEY `asignaalum` (`id_estudiante`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`id_estudiante`),
  ADD KEY `grado_escolar` (`id_grado`),
  ADD KEY `padro_tutor` (`id_padre`);

--
-- Indices de la tabla `grado`
--
ALTER TABLE `grado`
  ADD PRIMARY KEY (`id_grado`);

--
-- Indices de la tabla `grupo_identificador`
--
ALTER TABLE `grupo_identificador`
  ADD PRIMARY KEY (`id_grupo`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`),
  ADD KEY `grado_esco` (`id_grado`);

--
-- Indices de la tabla `padre`
--
ALTER TABLE `padre`
  ADD PRIMARY KEY (`id_padre`);

--
-- Indices de la tabla `primeraño`
--
ALTER TABLE `primeraño`
  ADD PRIMARY KEY (`id_primeraño`),
  ADD KEY `asigngrup` (`id_grupo`),
  ADD KEY `asignest` (`id_estudiante`),
  ADD KEY `asigdoce` (`id_docente`);

--
-- Indices de la tabla `segundoaño`
--
ALTER TABLE `segundoaño`
  ADD PRIMARY KEY (`id_segundoaño`),
  ADD KEY `asgrp` (`id_grupo`),
  ADD KEY `asgest` (`id_estudiante`),
  ADD KEY `asgdoc` (`id_docente`);

--
-- Indices de la tabla `terceraño`
--
ALTER TABLE `terceraño`
  ADD PRIMARY KEY (`id_terceraño`),
  ADD KEY `asignamoselgrupo` (`id_grupo`),
  ADD KEY `asignamoselestudiante` (`id_estudiante`),
  ADD KEY `asignamoseldocente` (`id_docente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `asignacion`
--
ALTER TABLE `asignacion`
  MODIFY `id_asignacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `id_estudiante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `grado`
--
ALTER TABLE `grado`
  MODIFY `id_grado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `grupo_identificador`
--
ALTER TABLE `grupo_identificador`
  MODIFY `id_grupo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `padre`
--
ALTER TABLE `padre`
  MODIFY `id_padre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `segundoaño`
--
ALTER TABLE `segundoaño`
  MODIFY `id_segundoaño` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `terceraño`
--
ALTER TABLE `terceraño`
  MODIFY `id_terceraño` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignacion`
--
ALTER TABLE `asignacion`
  ADD CONSTRAINT `asginargrpdis` FOREIGN KEY (`id_grpdisponibles`) REFERENCES `gupos_disponibles` (`id_grpdisponibles`),
  ADD CONSTRAINT `asignaalum` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`);

--
-- Filtros para la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD CONSTRAINT `grado_escolar` FOREIGN KEY (`id_grado`) REFERENCES `grado` (`id_grado`),
  ADD CONSTRAINT `padro_tutor` FOREIGN KEY (`id_padre`) REFERENCES `padre` (`id_padre`);

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `grado_esco` FOREIGN KEY (`id_grado`) REFERENCES `grado` (`id_grado`);

--
-- Filtros para la tabla `primeraño`
--
ALTER TABLE `primeraño`
  ADD CONSTRAINT `asigdoce` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`),
  ADD CONSTRAINT `asignest` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`),
  ADD CONSTRAINT `asigngrup` FOREIGN KEY (`id_grupo`) REFERENCES `grupo_identificador` (`id_grupo`);

--
-- Filtros para la tabla `segundoaño`
--
ALTER TABLE `segundoaño`
  ADD CONSTRAINT `asgdoc` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`),
  ADD CONSTRAINT `asgest` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`),
  ADD CONSTRAINT `asgrp` FOREIGN KEY (`id_grupo`) REFERENCES `grupo_identificador` (`id_grupo`);

--
-- Filtros para la tabla `terceraño`
--
ALTER TABLE `terceraño`
  ADD CONSTRAINT `asignamoseldocente` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`id_docente`),
  ADD CONSTRAINT `asignamoselestudiante` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id_estudiante`),
  ADD CONSTRAINT `asignamoselgrupo` FOREIGN KEY (`id_grupo`) REFERENCES `grupo_identificador` (`id_grupo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
