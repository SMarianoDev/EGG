Algoritmo sin_titulo
	
	Definir matriz, num, i, j Como Entero
	Dimension matriz(5,5)
	
	Escribir "ingrese numero a buscar"
	leer num
	
	para i <- 0 Hasta 4
		para j <- 0 Hasta 4
			matriz(i,j) = Aleatorio(1,10)
			Escribir Sin Saltar matriz(i,j)
		FinPara
		Escribir ""
	FinPara
	
	para i <- 0 Hasta 4
		para j <- 0 Hasta 4
			si num = matriz(i,j)
				Escribir "el numero esta en fila: ", i+1 ". columna: ", j+1
			FinSi
		FinPara
	FinPara
	
FinAlgoritmo
