public class PruebaCalculadora {
    public static void main(String[] args) {
        System.out.println("Probando la función suma:");
        Calculadora calculadora = new Calculadora(10, 5);
        int resultado = calculadora.realizarOperacion("suma");
        System.out.println("10 + 5 = " + resultado + " (Esperado: 15)");
        assert resultado == 15;

        calculadora = new Calculadora(-3, 7);
        resultado = calculadora.realizarOperacion("suma");
        System.out.println("-3 + 7 = " + resultado + " (Esperado: 4)");
        assert resultado == 4;

        calculadora = new Calculadora(0, 0);
        resultado = calculadora.realizarOperacion("suma");
        System.out.println("0 + 0 = " + resultado + " (Esperado: 0)");
        assert resultado == 0;
        System.out.println("Prueba de suma completada.\n");
    }
}