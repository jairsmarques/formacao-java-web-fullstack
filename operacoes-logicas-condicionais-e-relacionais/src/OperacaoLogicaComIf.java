
public class OperacaoLogicaComIf {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 90;
		int nota4 = 70;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condição lógica com IF */
		if (mediaAluno >= 70) {
			System.out.println("Parabéns, você está aprovado com nota final: " + mediaAluno);
		}

	}

}
