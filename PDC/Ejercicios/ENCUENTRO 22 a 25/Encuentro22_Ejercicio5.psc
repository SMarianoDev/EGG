Algoritmo sin_titulo
	Definir i,j,k Como Entero
	Definir frase, matriz, letra Como Caracter
	Dimension matriz(3,3)
	Escribir "ingrese frase"
	leer frase
	
	k = 0
	Para i <- 0 Hasta 2 Hacer
		para j <- 0 Hasta 2
			matriz(i,j)=subcadena(frase,k,k)
			k = k +1
			Escribir Sin Saltar matriz(i,j), " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
