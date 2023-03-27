/// Pedir al usuario que ingrese el valor del radio de una circunferencia
/// Calcular Area y Perimetro de la circunferencia
/// Area = PI * radio2
/// Perimetro = 2 * PI * radio


Algoritmo calculo_circunferencia
	
	Definir valorUsuario Como Entero
	Definir area Como Real
	Definir perimetro Como Real
	
	Escribir "Indique el radio de la circunferencia"
	Leer valorUsuario
	
	area = PI*(valorUsuario*valorUsuario)
	Escribir "El area es: ", area " cm cuadrados"
	
	perimetro = 2*PI*valorUsuario
	Escribir "El perimetro es de: ", perimetro " cm"
	
FinAlgoritmo