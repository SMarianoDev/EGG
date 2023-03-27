Algoritmo sin_titulo
	Definir matriz Como Entero
	Definir vector Como Caracter
	Dimension matriz[5,5],vector[6]
	llenarVector(vector)
	llenarMtriz(matriz)
FinAlgoritmo
SubProceso llenarVector(vector)
	Definir i,j Como Entero
	vector(0) = "NORTE        "
	vector(1) = "SUR        "
	vector(2) = "ESTE       "
	vector(3) = "OESTE        "
	vector(4) = "CENTRO        "
	vector(5) = "TOTAL"
	Escribir "              " Sin Saltar
	para i <- 0 Hasta 5
		Escribir Sin Saltar vector(i), " "
	FinPara
	Escribir ""
FinSubProceso

SubProceso llenarMtriz(matriz)
	Definir i,j, suma, suma2 Como Entero
	suma2 = 0
	para i <- 0 Hasta 5 Hacer
		si i <= 4
			suma = 0
			Escribir Sin Saltar "Rep.",i+1
			para j <- 0 Hasta 5 Hacer
				si j <= 4
				matriz[i,j] = Aleatorio(1,9)
				Escribir Sin Saltar "          (",matriz[i,j],")"
				suma = suma + matriz[i,j]
				suma2 = suma2 + matriz[i,j]
			SiNo
				Escribir Sin Saltar "           (",suma,")"
			fin si
			FinPara
			Escribir ""
		FinSi
	FinPara
	sumaFilas(matriz,suma2)
FinSubProceso

SubProceso sumaFilas(matriz,suma2)
	Definir i,j, vector, suma Como Entero
	Dimension vector(6)
	Escribir "T.Zona" Sin Saltar
	para j <- 0 Hasta 5
		si j <= 4
			suma = 0
			para i <- 0 Hasta 5
				si i <= 4
					suma = suma + matriz(i,j)
					vector(j) = suma
				FinSi
			FinPara
			Escribir Sin Saltar "         (",vector(j),")"
		SiNo
				Escribir "         (",suma2,")"
		FinSi
	FinPara
	Escribir ""
FinSubProceso
