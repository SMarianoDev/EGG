Algoritmo PEDIDO_CAFE
	
	Definir pedido Como caracter
	
	Escribir "ingrese que desea tomar"
	escribir "CAFE"
	Escribir "TE"
	leer pedido
	Segun pedido Hacer
		"CAFE":
			Escribir "SOLO" 
			Escribir "CORTADO"
			Leer pedido
			si pedido = "CORTADO" Entonces
				Escribir "Prefiere leche vegetal?"
				Escribir "ingrese SI o NO"
				leer pedido
				si pedido = "SI" Entonces
					Escribir "Preparando cafe con leche vegetal"
				SiNo
					Escribir "preparando cafe con leche comun"
				FinSi
			SiNo
				Escribir "Preparando cafe solo"
			FinSi
			
		"TE":
			Escribir "haciendo te"
	FinSegun
FinAlgoritmo
