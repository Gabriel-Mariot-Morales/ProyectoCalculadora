public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public Double realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return (double) this.suma();
        } else if (operacion.equals("resta")) {
            return (double) this.resta();
        } else if (operacion.equals("multiplicar")) {
            return (double) this.multiplicar();
        } else if (operacion.equals("dividir")) {
            return this.dividir();
        } else if (operacion.equals("modulo")) {
            return (double) this.modulo();
        } else {
            System.out.println("Operación '" + operacion + "' no soportada actualmente.");
            return null;
        }
    }

    public int suma() {
        return this.numero1 + this.numero2;
    }

    public int resta() {
        return this.numero1 - this.numero2;
    }

    public int multiplicar() {
        return this.numero1 * this.numero2;
    }

    public Double dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return null;
        }
        return (double) this.numero1 / this.numero2;
    }
    public int modulo() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede calcular el módulo con divisor cero.");
            return 0;
        }
        return this.numero1 % this.numero2;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 2);
        Double resultadoSuma = calc.realizarOperacion("suma");
        System.out.println("La suma es: " + resultadoSuma);
        Double resultadoResta = calc.realizarOperacion("resta");
        System.out.println("La resta es: " + resultadoResta);
        Double resultadoMultiplicar = calc.realizarOperacion("multiplicar");
        System.out.println("La multiplicación es: " + resultadoMultiplicar);
        Double resultadoDividir = calc.realizarOperacion("dividir");
        System.out.println("La división es: " + resultadoDividir);

        Calculadora calcError = new Calculadora(5, 0);
        Double resultadoDivisionCero = calcError.realizarOperacion("dividir");
        System.out.println("División por cero: " + resultadoDivisionCero);
    }
}