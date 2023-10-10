// Proxy de la calculadora IMC
class ProxyCalculadoraIMC implements CalculadoraIMC {
    private CalculadoraIMCReal calculadoraReal = null;

    @Override
    public String calcularIMC(double peso, double altura) {
        
        if(this.calculadoraReal == null)
        {
            this.calculadoraReal = new CalculadoraIMCReal();
        }
        
        // Validar datos antes de calcular
        if (peso <= 0 || altura <= 0) {
            return "Datos invalidos. Peso y altura deben ser valores positivos mayores que cero.";
        }
        
        return calculadoraReal.calcularIMC(peso, altura);
    }
}

