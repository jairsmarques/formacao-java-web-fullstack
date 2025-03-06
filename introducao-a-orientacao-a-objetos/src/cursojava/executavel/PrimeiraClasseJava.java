package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/* Objeto ainda não existe na memória */
		Aluno aluno1;
		
		/* criando um objeto na memória*/
		aluno1 = new Aluno(); // Aqui será o João
		// new Aluno() -> instância (criação de Objeto)
		// aluno1 -> referência para o objeto Aluno
		
		
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
	    aluno1.setDataNascimento("18/10/87");
	    aluno1.setRegistroGeral("44554.45444.545");
	    aluno1.setNumeroCpf("54544.545454.5454");
	    aluno1.setNomeMae("Shirley");
	    aluno1.setNomePai("Antonio");
	    aluno1.setDataMatricula("10/01/20219");
	    aluno1.setSerieMatriculado("5");
	    aluno1.setNomeEscola("Escola JDEV Treinamento");
	    aluno1.setNota1(90.0);
	    aluno1.setNota2(80.8);
	    aluno1.setNota3(70.9);
	    aluno1.setNota4(90.7);
	
		System.out.println("Nome do aluno 1 é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.printf("Média das notas = %.2f%n" , aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());
	
		/* ======================================================== */
		
		System.out.println("------------------------------------------");
		/* Agora temos um objeto na memória (new cria um objeto na memória) */
		Aluno aluno2 = new Aluno(); // Aqui será o Pedro
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Nome do aluno 2 é = " + aluno2.getNome());
		System.out.println("Idade do aluno 2 é = " + aluno2.getIdade());
		System.out.println("nascimento do aluno 2 = " + aluno2.getDataNascimento());
		
		/* ======================================================== */
		
		Aluno aluno3 = new Aluno(); // Aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}

}
