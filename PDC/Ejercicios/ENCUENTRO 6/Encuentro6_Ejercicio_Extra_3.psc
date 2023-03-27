Algoritmo digitos
	
	Definir num Como entero
	definir cantidad Como real
	Escribir "ingrese un numero"
	leer num
	
	
	cantidad = Longitud(ConvertirATexto(num))
	
	Segun cantidad Hacer
		3: 
			Escribir "El numero es de 3 digitos"
		De Otro Modo:
			Escribir "El numero es de: " , cantidad " digitos"
	FinSegun
	
FinAlgoritmo
