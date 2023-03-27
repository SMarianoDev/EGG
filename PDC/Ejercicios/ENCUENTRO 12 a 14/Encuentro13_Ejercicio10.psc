Algoritmo sin_titulo
	
	Definir num Como Entero
	Definir  conversion Como Caracter
	Escribir "ingrese un numero" 
	leer num
	
	conversion = ConvertirATexto(num)
	Escribir num " = " sumatoria(conversion,num)
	
FinAlgoritmo

Funcion resultado <- sumatoria(conversion Por Valor, num Por Valor)
	Definir resultado, cantidad, i Como Entero
	Definir total Como Caracter
	cantidad = Longitud(conversion)-1
	resultado = 0
	para i <- 0 Hasta cantidad
		si i = cantidad
			si num mod 10 <> 0
				resultado = resultado + ConvertirANumero(Subcadena(conversion,i,i))
				Escribir Sin Saltar Subcadena(conversion,i,i)
				Escribir Sin Saltar " = "
			FinSi
		SiNo
			si num mod 10 <> 0
				resultado = resultado + ConvertirANumero(Subcadena(conversion,i,i))
				Escribir  Sin Saltar Subcadena(conversion,i,i)
				Escribir Sin Saltar " + "
			FinSi
		FinSi
	FinPara
FinFuncion
	