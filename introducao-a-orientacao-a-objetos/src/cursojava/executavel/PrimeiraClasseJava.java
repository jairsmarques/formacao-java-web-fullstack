package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/* Objeto ainda não existe na memória */
		Aluno aluno1;
		
		/* criando um objeto na memória*/
		aluno1 = new Aluno(); // Aqui será o João
		
		/* Agora temos um objeto na memória (new cria um objeto na memória) */
		Aluno aluno2 = new Aluno(); // Aqui será o Pedro
		
		Aluno aluno3 = new Aluno(); // Aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}

}
