Algoritmo sin_titulo
	
	Definir i,j, lados Como Entero
	
	Escribir "ingrese un numero de lados"
	leer lados
	
	
	para i<- 1 Hasta lados Hacer
		para j <- 1 Hasta lados Hacer
			si i > 1 y i < lados y j > 1 y j < lados Entonces
				Escribir  "   " Sin Saltar
			sino 
				Escribir " * "  Sin Saltar
			FinSi
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo