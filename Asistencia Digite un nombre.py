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
