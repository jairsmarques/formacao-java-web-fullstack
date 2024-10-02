package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memória*/
		Aluno aluno1;
		/*new Aluno() é uma instancia(Criação de Objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome:");
		String idade = JOptionPane.showInputDialog("Qual a idade:");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?:");
		String rg = JOptionPane.showInputDialog("Registro geral?:");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?:");
		String mae = JOptionPane.showInputDialog("Nome da Mãe?:");
		String pai = JOptionPane.showInputDialog("Nome do pai?:");
		String matricula = JOptionPane.showInputDialog("Data da matricula?:");
		String serie = JOptionPane.showInputDialog("Qual série?:");
		String escola = JOptionPane.showInputDialog("Nome da escola?:");
		String nota1 = JOptionPane.showInputDialog("Nota1?:");
		String nota2 = JOptionPane.showInputDialog("Nota2?:");
		String nota3 = JOptionPane.showInputDialog("Nota3?:");
		String nota4 = JOptionPane.showInputDialog("Nota4?:");
		
		aluno1 = new Aluno();/*Aqui será o João*/
		
		/*settando os atributos*/
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		 /*recupera os dados*/
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("RG = " + aluno1.getRegistroGeral());
		System.out.println("CPF = " + aluno1.getNumeroCpf());
		System.out.println("Nome mãe = " + aluno1.getNomeMae());
		System.out.println("Nome pai = " + aluno1.getNomePai());
		System.out.println("Media da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado2 = " + aluno1.getAlunoAprovado2());
		System.out.println("-------------------------------------------");
		/*======================================================================*/
		
	}

}
