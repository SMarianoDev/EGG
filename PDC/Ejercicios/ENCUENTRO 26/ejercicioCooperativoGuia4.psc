Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	
	Dimension tablero[9, 12]
	Dimension vector[9]
	
	inicializarMatriz(tablero)
	agregarPalabra(tablero,"vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	acomodarPalabras(tablero)
	imprimirMatriz(tablero)
	
FinAlgoritmo

SubProceso inicializarMatriz(tablero)
	definir i,j Como Entero
	para i=0 hasta 8 Hacer
		para j=0 hasta 11 Hacer
			tablero(i,j) = "*"
		FinPara
	FinPara
FinSubProceso


SubProceso imprimirMatriz(tablero)
	definir i,j Como Entero
	para i=0 hasta 8 Hacer
		para j=0 hasta 11 Hacer
			escribir sin saltar " " tablero(i,j) " "
		FinPara
		escribir " "
	FinPara
FinSubProceso


SubProceso agregarPalabra(tablero, palabra, n)
	definir j, long Como Entero
	long= Longitud(palabra)
	para j=0 hasta long-1 Hacer
		tablero(n,j) = subcadena(palabra,j,j)
	FinPara
FinSubProceso


Funcion posi <- buscarR(tablero,i)
	definir j, long, contador, posi Como Entero
	contador = 0
	para j <- 0 hasta 11
		si tablero(i,j) = "r" y contador <> 1
			contador = contador + 1
			posi = j
			//				Escribir posi
		FinSi
	FinPara
FinSubProceso


SubProceso acomodarPalabras(tablero)
	Definir i,j,res Como Entero
	Definir vector Como Caracter
	Dimension vector(12)

	para i=0 hasta 8 Hacer
		res = 5 - buscarR(tablero,i)
		para j <- 0 Hasta 11
			vector(j) = tablero(i,j)
			si j < res
				tablero(i,j) = "*"
			SiNo
				tablero(i,j) = vector(j-res)
			FinSi
		FinPara
	FinPara
FinSubProceso
