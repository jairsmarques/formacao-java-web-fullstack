
public class OperacaoLogicaComIfElse {

	public static void main(String[] args) {

		int nota1 = 35;
		int nota2 = 65;
		int nota3 = 35;
		int nota4 = 51;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condições lógica com IF e ELSE */
		if (mediaAluno > 60) {
			System.out.println("Parabens, você está aprovado com nota final: " + mediaAluno);
		} else if (mediaAluno >= 40 && mediaAluno <= 60) {
			System.out.println("Aluno em recuperação com nota final: " + mediaAluno);
		} else {
			System.out.println("Aluno reprovado com nota final: " + mediaAluno);
		}

	}
}
