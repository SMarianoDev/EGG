Algoritmo sin_titulo
	Definir matriz Como Entero
	Dimension matriz(10,10)
	
	llenarVector(matriz)
	mostrarVector(matriz)
	
	
FinAlgoritmo

SubProceso llenarVector(matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta 9
		para j <- 0 Hasta 9
			matriz(i,j) = Aleatorio(1,9)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarVector(matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta 9
		para j <- 0 Hasta 9
			Escribir Sin Saltar matriz(i,j)
		FinPara
		Escribir ""
	FinPara
FinSubProceso

