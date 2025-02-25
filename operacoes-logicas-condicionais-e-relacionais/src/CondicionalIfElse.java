
public class CondicionalIfElse {

	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 20;
		int nota4 = 80;
	
		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

		if (mediaAluno >= 70) {
			System.out.println("Parabéns você está aprovado com nota final: " + mediaAluno);
		} else if (mediaAluno > 50) {
			System.out.println("Você está de recuperação com nota final: " + mediaAluno);
		} else {
			System.out.println("Você está reprovado com nota final: " + mediaAluno);
		}

	}

}
