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
