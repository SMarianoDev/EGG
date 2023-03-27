Algoritmo sin_titulo
	Definir matriz Como Entero
	Dimension matriz(5,5)
	
	remplazar(matriz)
	mostr(matriz)
	
FinAlgoritmo

SubProceso remplazar(matriz)
	Definir i,j Como Entero
	
	para i <- 0 Hasta 4
		para j <- 0 Hasta 4
			si i = j Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(1,10)
			FinSi
		FinPara
	FinPara
	
FinSubProceso

SubProceso mostr(matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta 4
		para j <- 0 Hasta 4
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	