//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
//rio. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar tam-
//bi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se en-
//cuentra el valor. En caso de que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso de que el n�mero a buscar no est� adentro del arreglo se debe mostrar
//un mensaje.


Algoritmo sin_titulo
	
	definir vector, n, i, num, j, cont como entero
	definir log como logico
	log=falso
	escribir "ingrese el tama�o del vector"
	leer n
	dimension vector(n)
	cont=0
	escribir "ingrese el numero a buscar"
	leer num
	
	para i= 0 hasta n-1
		escribir "ingrese los numeros del vector"
		leer vector(i)
		
	FinPara
	
	para j = 0 hasta n-1
		
		si num = vector(j)  entonces 
			escribir "la posicion del numero es ", j
			log=verdadero
		
		FinSi
		
	FinPara
	
	si log = falso Entonces
		escribir "no se encuentra el numero"
	FinSi
	
FinAlgoritmo
