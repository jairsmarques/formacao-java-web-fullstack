
public class OperadorTernario {

	public static void main(String[] args) {

		int nota1 = 20;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 80;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		String saidaResultado;

		saidaResultado = mediaAluno >= 70 ? "Aluno Aprovado!"
				: (mediaAluno > 40 && mediaAluno <= 69) ? "Aluno em recuperação!" : "Aluno Reprovado";

		System.out.println(saidaResultado);

	}

}
