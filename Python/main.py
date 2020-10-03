from calculadora import Calculadora

if __name__ == "__main__":
    calculadora = Calculadora()
    calculadora.valor1=3
    calculadora.valor2=5
    calculadora.sumar()
    print(calculadora.resultado)