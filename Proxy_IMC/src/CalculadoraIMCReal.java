public class CalculadoraIMCReal implements CalculadoraIMC {
    @Override
    public String calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "Por debajo del peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
