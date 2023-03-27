Algoritmo sin_titulo
	Definir i, vector, long, suma Como Entero
	suma = 0
	Escribir "ingrese la Longitud del vector"
	leer long
	
	Dimension vector(long)
	para i<- 0 Hasta long-1
		Escribir "ingrese el valor ", i
		leer vector(i)
		suma = suma + vector(i)
	FinPara
	promedio(suma,long)
FinAlgoritmo

subproceso promedio(suma,long)
	
	Escribir "el promedio es de: " , suma/long
	
FinSubProceso
	