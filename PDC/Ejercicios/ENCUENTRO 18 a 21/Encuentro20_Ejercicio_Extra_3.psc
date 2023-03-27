Algoritmo sin_titulo
	Definir vector1 Como caracter
	Definir i,long, vector2 Como entero
	
	Escribir "ingrese la longitur del vector"
	leer long
	Dimension vector1(long), vector2(long)
	
	para i <- 0 Hasta long-1
		Escribir "ingrese ", i+1 "° nombre"
		leer vector1(i)
		vector2(i) = Longitud(vector1(i))
	FinPara
	para i <- 0 Hasta long-1
		Escribir vector1(i) " tiene " vector2(i) " letras"
	FinPara
FinAlgoritmo
