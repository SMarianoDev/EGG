Algoritmo sin_titulo
	Definir matriz, n, m,  suma Como Entero
	Escribir "ingrese las dimensiones de la matriz"
	leer n, m
	dimension matriz(n,m)
	suma = 0
	
	aleat(n,m,matriz)
	mostr(n,m,matriz)
	
FinAlgoritmo

SubProceso aleat(n,m,matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta  n-1 Hacer
		para j <- 0 Hasta  m-1 Hacer
			matriz(i,j) = Aleatorio(1,10)
		FinPara
		
	FinPara
FinSubProceso

SubProceso mostr(n,m,matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta  n-1 Hacer
		para j <- 0 Hasta  m-1 Hacer
			Escribir Sin Saltar " ", matriz(i,j) " "
		FinPara
		Escribir  " "
		
	FinPara
FinSubProceso
	