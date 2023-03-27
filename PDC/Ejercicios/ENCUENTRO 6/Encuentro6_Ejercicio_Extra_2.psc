Algoritmo sin_titulo
	
	Definir num1, num2, num3 Como Entero
	Escribir "Ingresar fecha"
	Escribir "DD"
	Escribir "MM"
	Escribir "AAAA"
	Leer num1, num2, num3
	
	si num1<=31 y num2<=12 y num3<=2023 Entonces
		segun num2 Hacer
			1: 
				Escribir num1 , " de Enero de ", num3
			2: 
				Escribir num1 , " de febrero de ", num3
			3: 
				Escribir num1 , " de marzo de ", num3
			4: 
				Escribir num1 , " de abril de ", num3
			5: 
				Escribir num1 , " de mayo de ", num3
			6: 
				Escribir num1 , " de junio de ", num3
			7: 
				Escribir num1 , " de julio de ", num3
			8: 
				Escribir num1 , " de agosto de ", num3
			9: 
				Escribir num1 , " de septiembre de ", num3
			10: 
				Escribir num1 , " de octubre de ", num3
			11: 
				Escribir num1 , " de noviembre de ", num3
			12: 
				Escribir num1 , " de diciembre de ", num3
		FinSegun
	SiNo
		Escribir "fecha mal ingresada"
	FinSi
	
FinAlgoritmo
