package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
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
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Nota1?:");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Nota2?:");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Nota3?:");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Nota4?:");
		
		Aluno aluno1 = new Aluno();
		
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
		
		
		
		System.out.println(aluno1.toString());/*Descrição do objeto na memória*/
		
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado" + aluno1.getAlunoAprovado2());
		
		
		
	}

}
