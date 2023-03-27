Algoritmo sin_titulo
	Definir matriz Como Entero
	Dimension matriz(5,15)
	llenar(matriz)
FinAlgoritmo
SubProceso llenar(matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta 4
		para j <- 0 Hasta 14
			si i = 0 o i = 4 Entonces
				matriz(i,j) = 1
				Escribir Sin Saltar matriz(i,j)
			SiNo
				si j = 0 o j = 14
					matriz(i,j) = 1
					Escribir Sin Saltar matriz(i,j)
				SiNo
					matriz(i,j) = 0
					Escribir Sin Saltar matriz(i,j)
				FinSi
				
			FinSi
		FinPara
		Escribir ""
	FinPara
FinSubProceso