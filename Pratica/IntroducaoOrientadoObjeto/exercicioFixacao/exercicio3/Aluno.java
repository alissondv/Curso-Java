package exercicio3;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double gradeFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}

	public String aprovacao() {
		return gradeFinal()>=60? "PASS":"FAILED\n" +"MISSING "+ diferencaAprovacao();
	}
	public double diferencaAprovacao() {
		return 60 - gradeFinal();
	}

	public String toString() {
		return "FINAL GRADE = "+gradeFinal()+"\n"+aprovacao();
	}

}
