Algoritmo sin_titulo
	Definir matriz,f Como Entero
	
	Escribir "ingrese las filas que desea"
	leer f
	Dimension matriz[f,3]
	llenarMatriz(matriz,f)
	mostrarMatriz(matriz,f)
FinAlgoritmo

SubProceso llenarMatriz(matriz,f)
	Definir i,j Como Entero
	para i <- 0 Hasta f-1
		Para j <- 0 Hasta 2
			si j < 2
			Escribir "ingrese valor " , j+1  " y la fila " i+1
			leer matriz(i,j)
		SiNo
			matriz(i,j) = matriz(i,0) + matriz(i,1)
		FinSi
		FinPara
	FinPara
FinSubProceso
SubProceso mostrarMatriz(matriz,f)
	Definir i,j Como Entero
	para i <- 0 Hasta f-1
		Para j <- 2 Hasta 2
			Escribir matriz(i,0), " + " , matriz(i,1) , " = " , matriz(i,j)
		FinPara
	FinPara
FinSubProceso