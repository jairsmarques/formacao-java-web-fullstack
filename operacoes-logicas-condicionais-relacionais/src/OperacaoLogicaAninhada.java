
public class OperacaoLogicaAninhada {

	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 100;
		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado direto com nota = " + media + ", Parabéns!!");
				} else {
					System.out.println("Aluno está aprovado direto com nota = " + media);
				}
			} else {
				System.out.println("Aluno está em recuperação com nota = " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto com nota =  " + media);
		}
	}
}
