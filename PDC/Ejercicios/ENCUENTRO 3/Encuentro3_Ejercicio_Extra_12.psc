/// calcular distancia entre 2 personas
/// el resultado siempre tiene que ser positivo

Algoritmo distancia
	
	Definir distancia1, distancia2, total Como Real
	
	Escribir "ingrese un numero"
	leer distancia1
	Escribir "ingrese otro numero"
	leer distancia2
	
	total = abs(distancia1-distancia2) //la funcion "abs" lo que hace es quitar el simbolo negativo y dejarte el numero absoluto sin el signo menos. NO ESTA EN LA GUIA 1, lo busque en google.
	
	Escribir "la distancia es de: ", total
	
FinAlgoritmo
