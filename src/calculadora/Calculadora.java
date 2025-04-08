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
        } else {
            System.out.println("Operación '" + operacion + "' no soportada actualmente.");
            return Integer.MIN_VALUE; // Usamos un valor especial para indicar error en este ejemplo simple
        }
    }

    public int suma() {
        return this.numero1 + this.numero2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 3);
        int resultadoSuma = calc.realizarOperacion("suma");
        System.out.println("La suma es: " + resultadoSuma);
    }
}