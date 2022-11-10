Ejercicio realizado por gonzalo campderros
class Cubo:
    """
    crear la clase cubo con los atributos ancho, alto y profundidad con
    un metodo calcular_volument que tendra la formula:
    volumnen = ancho * altura * profundidad
    que el usuario ingrese los valores
    """
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self. alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

ancho = int(input("ingrese el ancho"))
alto = int(input("ingrese el alto"))
profundidad = int(input("ingrese la profundidad"))
Cubo = Cubo(alto, ancho, profundidad)
print(F"El volumen del cubo es: {Cubo.calcular_volumen()}")


#Ejercicio realizado por Luciano Diaz
#Crear una funcion para calcular el total de un pago inluyendo impuesto IVA

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    
    return pago_total
#Ejecutamos la funcion

pago_sin_impuesto = float(input("digite el pago sin impuestos: "))
impuesto = float(input("Digite el monto del impuesto a apgar: "))
pago_con_impuesto = calcular_total_pago (pago_sin_impuesto, impuesto)

print(f"El pago con impuesto es de ; {pago_con_impuesto}")


#Ejercicio realizado por Carolina Jurczysyzn

from Color import Color
from FiguraGeometrica import FiguraGeometrica

class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto, ancho, color):
        FiguraGeometrica.__init__(self, ancho, alto)
        Color.__init__(self, color)

    def calcular_area(self):
        return self.alto * self.ancho

    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'

    #Ejecutamos desde test figura geométrica
from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'Rojo')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Cálculo del área del cuadrado: {cuadrado1.calcular_area()}')

# MRO
print(Cuadrado.mro())

print(cuadrado1)

rectangulo1 = Rectangulo(3, 6, 'Verde')
print(f'Cálculo del área del rectángulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

#Ejercicio realizado por Juan Manuel Eztala

var nombre = "Juan";
var apellido = "Eztala";
var nombreCompleto =  nombre+" "+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Juan"+" "+"Eztala";
console.log(nombreCompleto2); 


# Ejercicio realizado por Myriam Nuñez 
class Aritmetica:
    """
    Operaciones de: suma, resta, multiplicacion y division
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self. operandoB = operandoB

    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    def resta(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(8, 7) # Le pasamos los argumentos para los operandos
print(f"La suma de los numeros es: {aritmetica1.sumar()}")
print(f"La resta de los numeros es: {aritmetica1.resta()}")
print(f"La multiplicacion de los numeros es: {aritmetica1.multiplicar()}")
print(f"La division de los numeros es: {aritmetica1.dividir():.2f}")


#Ejercicio realizado por Balladares Florencia
# Ejercicio 3: Funcion Recursiva
# Imprimir numero de 5 a 1 de manera descente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el numero 3 debe imprimir:
# 3
# 2
# 1
# Si se ingresan numeros negativos no imprime nada
def imprimir_numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        imprimir_numeros_recursivos(numero-1) #Caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print("valor ingresado incorrecto...")

imprimir_numeros_recursivos(5)
