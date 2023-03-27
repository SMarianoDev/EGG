Algoritmo sin_titulo
	
	definir matriz, n, num,m,i,j,vectorf, vectorc Como Entero
	Definir sumaFilas,sumaColum, sumaDiag, sumaDiag2 Como Logico
	
	
//	Escribir "Ingrese un numero del 1 al 9| Ingrese 0 para terminar"
//	Leer  n
	n = 3
	si n <> 0 
		si n >= 1 y n <= 9
			Dimension matriz(n,n)
			Dimension vectorf(n), vectorc(n)
			para i <- 0 Hasta n-1
				para j <- 0 Hasta n-1
					matriz(i,j) = Aleatorio(1,9)
					Escribir Sin Saltar "(",matriz(i,j),")"
				FinPara
				Escribir ""
			FinPara
//			matriz(0,0) = 2
//			matriz(0,1) = 7
//			matriz(0,2) = 6
//			matriz(1,0) = 9
//			matriz(1,1) = 5
//			matriz(1,2) = 1
//			matriz(2,0) = 4
//			matriz(2,1) = 3
//			matriz(2,2) = 8
			Escribir "-------------------------------------"
			sumaFilas = suma_filas(matriz,n,vectorf)
			Escribir "-------------------------------------"
			sumaColum = suma_columnas(matriz,n,vectorc)
			Escribir "-------------------------------------"
			sumaDiag = suma_diag(matriz,n,vectorf)
			sumaDiag2 = suma_diag2(matriz,n,vectorc)
			Escribir "-------------------------------------"
			
			
			si sumaFilas = Verdadero y sumaColum = Verdadero y sumaDiag = Verdadero y sumaDiag2 = Verdadero
				Escribir "LA MATRIZ ES MAGICA!!!"
				Escribir "-------------------------------------"
				n = -1
			SiNo
				Escribir "LA MATRIZ NO ES MAGICA :c"
				Escribir "-------------------------------------"
				n = -1
			FinSi
		SiNo
			Escribir n " no es un numero valido"
		FinSi
	FinSi
FinAlgoritmo

funcion log <- suma_filas(matriz,n,vectorf)
	Definir i,j,suma, contador Como Entero
	Definir log Como Logico
	log = Falso
	contador = 0
	para i <- 0 Hasta n-1
		suma = 0
		para j <- 0 Hasta n-1
			suma = suma + matriz(i,j)
			vectorf(i) = suma
		FinPara
		Escribir "la suma de la fila ",i+1, " es de: ",vectorf(i)
		si vectorf(i) = vectorf(0)
			contador = contador + 1
		FinSi
	FinPara
	si contador = n
		log = Verdadero
	FinSi
	Escribir log
FinSubProceso

funcion log <- suma_columnas(matriz,n,vectorc)
	Definir i,j,suma, contador Como Entero
	Definir log Como Logico
	log = Falso
	contador = 0
	para j <- 0 Hasta n-1
		suma = 0
		para i <- 0 Hasta n-1
			suma = suma + matriz(i,j)
			vectorc(j) = suma
		FinPara
		Escribir "la suma de la columna ",j+1, " es de: ",vectorc(j)
		si vectorc(j) = vectorc(0)
			contador = contador + 1
		FinSi
	FinPara
	si contador = n
		log = Verdadero
	FinSi
	Escribir log
FinSubProceso

Funcion log <- suma_diag(matriz,n,vectorf)
	Definir i,j,suma, contador Como Entero
	Definir log Como Logico
	log = Falso
	suma = 0
	contador = 0
	para i <- 0 Hasta n-1
		para j <- 0 Hasta n-1
			si i = j Entonces
				suma = suma + matriz(i,j)
			FinSi
		FinPara
	FinPara
	Escribir "La suma de la diagonal principal es de: ",suma
	para i <- 0 Hasta n-1
		si suma = vectorf(i)
			contador = contador +1
		FinSi
	FinPara
	si contador = n
		log = Verdadero
	FinSi
	Escribir log
FinSubProceso


Funcion log <- suma_diag2(matriz,n,vectorc)
	Definir i,j,suma, contador Como Entero
	Definir log Como Logico
	log = Falso
	suma = 0
	contador = 0
	j=n-1
	para i <- 0 Hasta n-1
		suma = suma + matriz(i,j)
		j = j-1
	FinPara
	Escribir "La suma de la diagonal invertida es de: ",suma
	para i <- 0 Hasta n-1
		si suma = vectorc(i)
			contador = contador +1
		FinSi
	FinPara
	si contador = n
		log = Verdadero
	FinSi
	Escribir log
FinSubProceso