// Proxy de la calculadora IMC
class ProxyCalculadoraIMC implements CalculadoraIMC {
    private CalculadoraIMCReal calculadoraReal = new CalculadoraIMCReal();

    @Override
    public String calcularIMC(double peso, double altura) {
        // Validar datos antes de calcular
        if (peso <= 0 || altura <= 0) {
            return "Datos invalidos. Peso y altura deben ser valores positivos mayores que cero.";
        }
        
        return calculadoraReal.calcularIMC(peso, altura);
    }
}

