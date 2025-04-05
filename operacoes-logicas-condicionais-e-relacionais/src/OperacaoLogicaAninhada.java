
public class OperacaoLogicaAninhada {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 95;
		int nota3 = 90;
		int nota4 = 90;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operações lógicas aninhadas; São operações dentro de operações */

		if (mediaAluno >= 50) {
			if (mediaAluno >= 70) {
				if (mediaAluno > 90) {
					System.out.println("Aluno está aprovado direto - Parabéns = Média: " + mediaAluno);
				} else {
					System.out.println("Aluno está aprovado direto = Média: " + mediaAluno);
				}
			} else {
				System.out.println("Aluno está em recuperação = Média: " + mediaAluno);
			}
		} else {
			System.out.println("Aluno reprovado direto = Média: " + mediaAluno);
		}

	}

}
