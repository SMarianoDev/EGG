Algoritmo sin_titulo
	
	Definir num, num2, num3 Como real
	
	Hacer
		Escribir "ingrese numero"
		leer num
		num2 = num
		num3 = num
		si conteo(num,num2,num3) = Verdadero
			Escribir "Todos los numeros son impares"
		SiNo
			Escribir "Sus numeros no son todos impares"
		FinSi
	Mientras Que num <> 0
	
FinAlgoritmo

Funcion numImp <- conteo(num Por referencia, num2 Por referencia, num3 Por Referencia)
	Definir par, imp, n, i, m Como real
	Definir numImp Como Logico
	n = 0
	imp = 0
	m = 1
	i = 10
	
	Mientras num2 mod 10 <> 0 
		n = n +1
		m = m*10
		num2 =trunc(num2/10)
	FinMientras
	m = m/10
	Repetir
		
	num3 =trunc (num / m)
	Escribir num3
	
	num2 = trunc(num mod i)
	Escribir num2
	m = m/10
	i = i*10
	Mientras Que num3 = num2
	
	
//	para i <- 1 Hasta n
//		num2 = trunc(num mod 10)
//		
//		Escribir num
//		si num2 mod 2 = 1
//			imp = imp + 1
//		FinSi
//	FinPara
	
	si imp = n
		numImp = Verdadero
	SiNo
		numImp = Falso
	FinSi
FinFuncion