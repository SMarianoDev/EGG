Algoritmo sin_titulo
	Definir matriz Como Entero
	Definir vector Como Caracter
	Dimension matriz[6,6]
	Dimension vector[6]
	llenarVector(vector)
	llenarMatriz(matriz)
	mostrarColumnas(matriz)
	
FinAlgoritmo

SubProceso llenarVector(vector)
	Definir i,j Como Entero
	vector(0) = "LUN      "
	vector(1) = "MAR      "
	vector(2) = "MIER     "
	vector(3) = "JUE      "
	vector(4) = "VIE      "
	vector(5) = "TOTAL"
	Escribir "                   " Sin Saltar
	para i <- 0 Hasta 5
		Escribir Sin Saltar vector(i), " "
	FinPara
	Escribir ""
FinSubProceso

SubProceso llenarMatriz(matriz)
	Definir i,j, suma Como Entero
	suma = 0
	para i <- 0 Hasta 5
			suma = 0
			para j <- 0 Hasta 5
				si j <= 4
					matriz(i,j) = Aleatorio(20,50)
					suma = suma + matriz(i,j)
				SiNo
					matriz(i,j) = suma
				FinSi
			FinPara
	FinPara
FinSubProceso

SubProceso mostrarColumnas(matriz)
	Definir i,j Como Entero
	para i <- 0 Hasta 5
		si i <= 4
			Escribir Sin Saltar "Producto   " , i+1 ":"
			para j <- 0 Hasta 5
				Escribir Sin Saltar "      (",matriz(i,j),")"
			FinPara
			Escribir ""
		SiNo
			Escribir Sin Saltar "Total semana  "
			sumaFilas(matriz)
		FinSi
	FinPara
FinSubProceso

SubProceso sumaFilas(matriz)
	Definir i,j, vector, suma Como Entero
	Dimension vector(6)
	para j <- 0 Hasta 5
		si j <= 4
			suma = 0
			para i <- 0 Hasta 5
				si i <= 4
					suma = suma + matriz(i,j)
					vector(j) = suma
				FinSi
			FinPara
			Escribir Sin Saltar "     (",vector(j),")"
		SiNo
			Escribir "      ----"
		FinSi
	FinPara
	maximo(matriz)
FinSubProceso

SubProceso maximo(matriz)
	Definir i,j, vector, suma, numMax, producto Como Entero
	Dimension vector(7)
	suma = 0
	producto = 0
	Escribir Sin Saltar "Prod + vendido    "
	para j <- 0 Hasta 5
		numMax = 0
		si j <= 4
			para i <- 0 Hasta 5
				si i <= 4
					suma = matriz(i,j)
					si suma > numMax
						numMax = suma
						producto = i
					FinSi
				FinSi
			FinPara
			segun producto Hacer
				0:
					Escribir Sin Saltar "Prod.1    "
				1:
					Escribir Sin Saltar "Prod.2    "
				2:
					Escribir Sin Saltar "Prod.3    "
				3:
					Escribir Sin Saltar "Prod.4    "
				4:
					Escribir Sin Saltar "Prod.5    "
			FinSegun
		SiNo
			Escribir "  ----"
		FinSi
	FinPara
	Escribir ""
FinSubProceso
	