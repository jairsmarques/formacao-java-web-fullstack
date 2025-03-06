
public class OperadorTernario {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		String saidaResultado;

		saidaResultado = mediaAluno >= 70 ? "Aluno Aprovado!"
				: (mediaAluno > 40 && mediaAluno <= 69) ? "Aluno em recuperação!" : "Aluno Reprovado";

		System.out.println(saidaResultado);

	}

}
