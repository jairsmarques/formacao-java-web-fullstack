package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		// new Aluno() -> instância (criação de Objeto)
		// aluno1 -> referência para o objeto Aluno

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		String idade = JOptionPane.showInputDialog("Qual a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento ?");
		String rg = JOptionPane.showInputDialog("Registro Geral ?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da mãe ?");
		String pai = JOptionPane.showInputDialog("Nome do pai ?");
		String matricula = JOptionPane.showInputDialog("Data da matricula ?");
		String serie = JOptionPane.showInputDialog("Qual a série ?");
		String escola = JOptionPane.showInputDialog("Nome da escola ?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 ?");

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
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setNota4(Double.valueOf(nota4));

		System.out.println("Nome do aluno 1 é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Registro geral: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe: " + aluno1.getNomeMae());
		System.out.println("Nome da pai: " + aluno1.getNomePai());
		System.out.println("Data de matrícula: " + aluno1.getDataMatricula());
		System.out.println("Série: " + aluno1.getSerieMatriculado());
		System.out.println("Nome da Escola: " + aluno1.getNomeEscola());
		System.out.printf("Média das notas = %.2f%n", aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());

	}

}
