public class PruebaCalculadoraIMC {
    public static void main(String[] args) {

        // Crear una instancia de la calculadora IMC (Proxy)
        CalculadoraIMC calculadora = new ProxyCalculadoraIMC();

        Salida.imprimir("Calculadora de IMC");
        double peso = Entrada.leerDouble("Ingrese su peso en kg: ");

        double altura = Entrada.leerDouble("Ingrese su altura en metros (separado por ','): ");

        // Calcular el IMC y mostrar el resultado
        String resultado = calculadora.calcularIMC(peso, altura);
        Salida.imprimir("Su IMC es: " + resultado);
    }
}
