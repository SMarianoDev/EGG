Algoritmo comprobar2
	Definir palabra Como Caracter
	Definir longPalabra Como entero
	Escribir "ingrese palabra"
	leer palabra
	
	longPalabra = Longitud(palabra)-1
	
	si Subcadena(palabra,0,0) = Subcadena(palabra,longPalabra,longPalabra) Entonces
		Escribir " CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo