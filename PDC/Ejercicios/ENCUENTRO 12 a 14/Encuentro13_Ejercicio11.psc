Algoritmo sin_titulo
	
	Definir num, num2 Como real
	
	Hacer
		Escribir "ingrese numero"
		leer num
		num2 = num
		si conteo(num,num2) = Verdadero
			Escribir "Todos los numeros son impares"
		SiNo
			Escribir "Sus numeros no son todos impares"
		FinSi
	Mientras Que num <> 0
	
FinAlgoritmo

Funcion numImp <- conteo(num Por valor, num2 Por Valor)
	Definir par, imp, n, i Como real
	Definir numImp Como Logico
	n = 0
	par = 0
	imp = 0
	
	Mientras num2 mod 10 <> 0 
		n = n +1
		num2 =trunc(num2/10)
	FinMientras
	
	para i <- 1 Hasta n
		num2 = trunc(num mod 10)
		num =trunc (num/10)
		si num2 mod 2 = 1
			imp = imp + 1
		FinSi
	FinPara
	
	si imp = n
		numImp = Verdadero
	SiNo
		numImp = Falso
	FinSi
FinFuncion
	