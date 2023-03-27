Algoritmo sin_titulo
	Definir matrizA, matrizB, matrizC Como Entero
	Dimension matrizA[3,3],matrizB[3,3],matrizC[3,3]
	llenarMatriz(matrizA,matrizB,matrizC)
FinAlgoritmo
SubProceso llenarMatriz(matrizA,matrizB,matrizC)
	Definir i,j Como Entero
	para i <- 0 Hasta 2
		para j <- 0 Hasta 2
			matrizA(i,j) = Aleatorio(1,9)
			Escribir Sin Saltar "(",matrizA(i,j),")"
		FinPara
		Escribir ""
	FinPara
	Escribir "-----------------------------------------"
	para i <- 0 Hasta 2
		para j <- 0 Hasta 2
			matrizB(i,j) = Aleatorio(1,9)
			Escribir Sin Saltar "(",matrizB(i,j),")"
		FinPara
		Escribir ""
	FinPara
	Escribir "-----------------------"
	multiMatriz(matrizA,matrizB,matrizC)
	mostrarMultiMatriz(matrizA,matrizB,matrizC)
FinSubProceso

SubProceso multiMatriz(matrizA,matrizB,matrizC)
	Definir i,j,k,j2, multi, suma Como Entero
	
	para k <- 0 Hasta 2
		para i <- 0 Hasta 2
			suma = 0
			para j <- 0 Hasta 2
				multi = matrizA(k,j) * matrizB(j,i)
				Escribir Sin Saltar matrizA(k,j),"*", matrizB(j,i), " = ",multi," "
				suma = suma + multi
				matrizC(k,i) = suma
			FinPara
			Escribir Sin Saltar " = ",suma
			Escribir ""
		FinPara
		Escribir "-------------------------------"
	FinPara
FinSubProceso
SubProceso mostrarMultiMatriz(matrizA,matrizB,matrizC)
	Definir i,j,k,j2, multi, suma Como Entero
	para i <- 0 Hasta 2
		para j <- 0 Hasta 2
			Escribir Sin Saltar "(",matrizC(i,j),")"
		FinPara
		Escribir ""
	FinPara
FinSubProceso
