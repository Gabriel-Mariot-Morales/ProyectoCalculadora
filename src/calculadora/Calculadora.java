public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) {
            return suma();
        } else if (operacion.equals("resta")) {
            return resta();
        } else if (operacion.equals("multiplicar")) {
            return multiplicar();
        } else {
            System.out.println("Operación '" + operacion + "' no soportada actualmente.");
            return Integer.MIN_VALUE;
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

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(4, 5);
        int resultadoSuma = calc.realizarOperacion("suma");
        System.out.println("La suma es: " + resultadoSuma);
        int resultadoResta = calc.realizarOperacion("resta");
        System.out.println("La resta es: " + resultadoResta);
        int resultadoMultiplicar = calc.realizarOperacion("multiplicar");
        System.out.println("La multiplicación es: " + resultadoMultiplicar);
    }
}