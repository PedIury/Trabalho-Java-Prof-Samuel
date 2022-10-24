package br.com.caelum.ed;

public class Aluno {
	private String nome;
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String toString() {
	return this.nome;
	}
	public boolean equals(Object o) {
	Aluno outro = (Aluno)o;
	return this.nome.equals(outro.nome);
	}
	public void adiciona (Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
		if (this.alunos[i] == null) {
		this.alunos[i] = aluno;
		break;
				}
			}
		}
	public void adiciona(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
		if (this.alunos[i] == null) {
		this.alunos[i] = aluno;
		break;
			}
		}
	public class TesteLinearVSConstante {
		public static void main(String[] args) {
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {
		Aluno aluno = new Aluno();
		vetor.adiciona(aluno);
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo em segundos = " + tempo);
		}
	}
	
}
