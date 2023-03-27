Algoritmo sin_titulo
	
	definir vector ,i  como entero
	definir suma, resta, multi como real
	i = 0
	suma=0
	resta=0
	multi=1
	
	general(suma,resta,multi,i)
	
	
FinAlgoritmo

SubProceso general(suma,resta,multi,i)
	Definir vector Como Entero
	dimension vector(10)
	para i=0 hasta 9
		escribir "ingrese un numero"
		leer vector(i)
		
		suma = suma + vector(i)
		si i = 0 Entonces
			resta = vector(i)
		SiNo
			resta = resta - vector(i) 
		FinSi
		multi= multi * vector(i)
		
	FinPara
	escribir suma
	escribir resta
	escribir multi
FinSubProceso
	