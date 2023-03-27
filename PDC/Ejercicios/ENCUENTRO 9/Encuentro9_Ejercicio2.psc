Algoritmo sin_titulo
	
	Definir palabra Como Caracter
	Definir i, cantidad Como Entero
	
	Escribir "ingrese una palabra"
	leer palabra
	cantidad = Longitud(palabra)
	
	para i <- 0 Hasta cantidad
		Escribir Sin Saltar Subcadena(palabra,i,i)
		Escribir Sin Saltar " "
	FinPara
	
FinAlgoritmo
