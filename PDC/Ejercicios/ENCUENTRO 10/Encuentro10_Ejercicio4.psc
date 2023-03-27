Algoritmo sin_titulo
	
	Definir i, j, fact Como Entero
	
	fact = 1
	
	para j <- 1 Hasta  5
		
		para i <- 1 Hasta 1 Hacer
			
			fact = fact * j
			Escribir Sin Saltar "!",j
			
			Segun j Hacer
				
				1: Escribir Sin Saltar  ""
				2: Escribir Sin Saltar  " = 1*2"
				3: Escribir Sin Saltar  " = 1*2*3"
				4: Escribir Sin Saltar  " = 1*2*3*4"
				5: Escribir Sin Saltar  " = 1*2*3*4*5"
				
			FinSegun
			
		FinPara
		
		Escribir " = ", fact
		
	FinPara
FinAlgoritmo
