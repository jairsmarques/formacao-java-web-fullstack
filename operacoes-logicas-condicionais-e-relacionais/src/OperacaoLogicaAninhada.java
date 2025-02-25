
public class OperacaoLogicaAninhada {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 95;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		if (mediaAluno >= 50) {
			if (mediaAluno >= 70) {
				if (mediaAluno > 90) {
					System.out.println("Aluno está aprovado direto com média: " + mediaAluno + " - Parabéns");
				} else {
					System.out.println("Aluno está aprovado direto com média: " + mediaAluno);
				}
			} else {
				System.out.println("Aluno está em recuperação com média: " + mediaAluno);
			}
		} else {
			System.out.println("Aluno reprovado direto com média: " + mediaAluno);
		}

	}

}
