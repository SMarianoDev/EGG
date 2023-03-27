Algoritmo Final
	//Definición de variables
	Definir calculadora Como Entero
	Definir cadena1, cadena2 Como Caracter
	Definir diagonal3D1, diagonal3D2 Como Entero
	//Definimos las 3 dimensiones de la matriz calculadora
	Dimension calculadora(3, 3, 3)
	//Asignamos valores a las cadenas de texto
	cadena1 = "123456789"
	cadena2 = "321654987"
	//Inicializamos la matriz
	inicializarMatriz(calculadora)
	//Llenamos las matrices como se marca en el enunciado
	llenarMatriz_Z0(calculadora, cadena1)
	llenarMatriz_Z1(calculadora, cadena2)
	llenarMatriz_Z2(calculadora)
	//Mostramos los resultados de la matriz
	imprimirMatriz(calculadora)
	//Asignamos los valores de las diagonales 3D
	diagonal3D1 = calculadora(0, 2, 0)*calculadora(1, 1,1)*calculadora(2, 0, 2)
	diagonal3D2 = calculadora(0, 0, 0)*calculadora(1, 1,1)*calculadora(2, 2, 2)
	//Escribimos los resultados de las diagonales
	Escribir "La multiplicación de los elementos de la diagonal 3D 1 es ",diagonal3D1
	Escribir "La multiplicación de los elementos de la diagonal 3D 2 es ",diagonal3D2
	
FinAlgoritmo

SubProceso llenarMatriz_Z0(matriz, cadena)
	Definir i,j, cont Como Entero
	cont = 0
	para i <- 0 Hasta 2
		para j <- 0 hasta 2
			matriz[0,i,j] = ConvertirANumero(Subcadena(cadena,cont,cont))
			cont = cont + 1
		FinPara
	FinPara
FinSubProceso

SubProceso llenarMatriz_Z1(matriz, cadena)
	Definir i,j, cont Como Entero
	cont = 0
	para i <- 0 Hasta 2
		para j <- 0 hasta 2
			matriz[1,i,j] = ConvertirANumero(Subcadena(cadena,cont,cont))
			cont = cont + 1
		FinPara
	FinPara
FinSubProceso

SubProceso llenarMatriz_Z2(matriz)
	Definir i,j, cont Como Entero
	cont = 0
	para i <- 0 Hasta 2
		para j <- 0 hasta 2
			matriz[2,i,j] = matriz[0,i,j] * matriz[1,i,j]
		FinPara
	FinPara
FinSubProceso

SubProceso inicializarMatriz(matriz)
	Definir i,j,k Como Entero
	para k <- 0 Hasta 2
		para i <- 0 Hasta 2
			para j <- 0 hasta 2
				matriz[k,i,j] = 0
			FinPara
		FinPara
	FinPara

FinSubProceso

SubProceso imprimirMatriz(matriz)
	Definir i,j,k Como Entero
	para k <- 0 Hasta 2
		para i <- 0 Hasta 2
			para j <- 0 hasta 2
				Escribir Sin Saltar "(",matriz[k,i,j],")"
			FinPara
			Escribir ""
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	