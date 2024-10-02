package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memória*/
		Aluno aluno1;
		aluno1 = new Aluno();/*Aqui será o João*/
		
		/*Agora temos um objeto na memória*/
		Aluno aluno2 = new Aluno();/*Aqui será o Pedro*/
		
	    Aluno aluno3 = new Aluno();/*Aqui será o Alex*/
	    
	    Aluno aluno4 = new Aluno("Maria");
	    
	    Aluno aluno5 = new Aluno("José", 50);

	}

}
