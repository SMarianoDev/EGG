Algoritmo sin_titulo
	Definir matrizA, matrizB,n,m Como Entero
	Escribir "ingrese un valor"
	leer n
	Escribir "ingrese un valor"
	Leer m
	Dimension matrizA[n,m],matrizB[n,m]
	llenarMatriz(matrizA,matrizA,n,m)
	mostrarMatrizA(matrizA,n,m)
	mostrarMatrizB(matrizA,n,m)
	
FinAlgoritmo
SubProceso llenarMatriz(matrizA,matrizB,n,m)
	Definir i,j Como Entero
	para i <- 0 Hasta n-1
		para j <- 0 Hasta m-1
			matrizA(i,j) = Aleatorio(0,100)
			matrizB(i,j) = matrizA(i,j)
		FinPara
		
	FinPara
FinSubProceso
SubProceso mostrarMatrizA(matrizA,n,m)
	Definir i,j Como Entero
	para i <- 0 Hasta n-1
		para j <- 0 Hasta m-1
			Escribir Sin Saltar "(",matrizA(i,j),")"
		FinPara
		Escribir ""
	FinPara
	Escribir "----------------------------------"
FinSubProceso

SubProceso mostrarMatrizB(matrizB,n,m)
	Definir i,j Como entero
	para j <- 0 Hasta n-1
		para i <- 0 Hasta m-1
			Escribir Sin Saltar "(",matrizB(i,j),")"
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	