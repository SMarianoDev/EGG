Algoritmo sin_titulo
	
	Definir i, cantidad Como Entero
	Definir palabra Como Caracter
	
	Escribir "ingrese palabra"
	leer palabra
	
	cantidad = Longitud(palabra)
	
	para i <- cantidad Hasta 0
		Escribir Sin Saltar Subcadena(palabra,i,i), " "
	FinPara
	
FinAlgoritmo
