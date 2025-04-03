// Classe ClassificacaoImc
public class ClassificacaoImc {
    
    // Método para classificar o IMC conforme as faixas da OMS
    public static String classificar(double imc) {
        if (imc < 18.5) {
            return "Baixo peso. É recomendado procurar um médico para avaliação criteriosa.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal.";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso. Consulte um médico e reveja hábitos para reverter o quadro.";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I. É importante buscar orientação médica e nutricional.";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II. Busca por orientação médica e nutricional é fundamental.";
        } else {
            return "Obesidade grau III. A chance de outras doenças associadas é mais elevada. Busque orientação médica imediatamente.";
        }
    }
}