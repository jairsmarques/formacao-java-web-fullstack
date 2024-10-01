
public class OperacaoTernaria {

	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);

	}

}
