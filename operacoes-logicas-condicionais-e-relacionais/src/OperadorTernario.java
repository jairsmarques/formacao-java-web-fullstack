
public class OperadorTernario {

	public static void main(String[] args) {

		int nota1 = 35;
		int nota2 = 35;
		int nota3 = 35;
		int nota4 = 31;

		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operador ternário são para micro validações */

		String resultado = mediaAluno >= 70 ? "Aluno Aprovado"
				: mediaAluno >= 40 && mediaAluno <= 69 ? "Aluno em recuperação " : "Aluno Reprovado";

		System.out.println(resultado);

	}

}
