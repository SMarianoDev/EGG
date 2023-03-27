Algoritmo sin_titulo
	Definir vector, long Como Entero
	Escribir "ingrese longitud del vector"
	leer long
	Dimension vector(long)
	
	Escribir "el producto es de: " ,producto(vector,long)
	
FinAlgoritmo

Funcion resultado <- producto(vector,long)
	Definir resultado, i, multi Como Entero
	resultado = 1
	para i <- 0 Hasta long-1
		vector(i) = Aleatorio(1,10)
		Escribir Sin Saltar "V(",vector(i),")"
		si i = long-1
			Escribir Sin Saltar " = "
		SiNo
			Escribir Sin Saltar "*"
		finsi
		resultado = resultado * vector(i)
	FinPara
FinFuncion
	