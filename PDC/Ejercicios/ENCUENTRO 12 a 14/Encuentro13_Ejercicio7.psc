Algoritmo sin_titulo
	
	Definir num Como Caracter
	Escribir "ingrese numero"
	leer num
	
	Escribir cambio(num)
	
FinAlgoritmo

Funcion conversion <- cambio(num por referencia)
	Definir conversion, cantidad Como Entero
	
	cantidad = Longitud(num)
	
	si cantidad <= 3
		conversion = ConvertirANumero(num)
	SiNo
		Escribir "ingrese un numero de 3 digitos"
	FinSi
	
	FinFuncion
	