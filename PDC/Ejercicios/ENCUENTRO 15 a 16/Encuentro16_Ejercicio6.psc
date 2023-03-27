
Algoritmo sin_titulo
	Definir letra Como caracter
	Repetir
		
		Escribir "ingrese una letra"
		leer letra
		
		verificacion(letra)
	Mientras Que letra <> " "
FinAlgoritmo

SubProceso verificacion(letra)
	Definir margen, valorLetra Como Caracter
	definir i Como Entero
	Definir chequeo como logico
	
	chequeo = Falso
	i = 0
	para i <- 0 Hasta 7
		margen = "mnopqrst"
		valorLetra = Subcadena(margen,i,i)
		
		si letra = valorLetra
			chequeo = Verdadero
		FinSi
	FinPara
	
	si chequeo = Verdadero
		Escribir "la letra SI esta entre M y T"
	SiNo
		Escribir "la letra NO esta entre M y T"
	finsi
	
FinSubProceso
	