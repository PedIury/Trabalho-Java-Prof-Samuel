package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;
public class Vetor {
	Aluno[] alunos = new Aluno[100000];
public void adiciona(Aluno aluno) {
}
public void adiciona(int posicao, Aluno aluno) {
}
public Aluno pega(int posicao) {
return null;
}
public void remove(int posicao) {
}
public boolean contem(Aluno aluno) {
return false;
}
public int tamanho() {
return 0;
}
public String toString() {
if (this.totalDeAlunos == 0) {
return "[]";
}
StringBuilder builder = new StringBuilder();
builder.append("[");
for (int i = 0; i < this.totalDeAlunos - 1; i++) {
builder.append(this.alunos[i]);
builder.append(", ");
}
builder.append(this.alunos[this.totalDeAlunos - 1]);
builder.append("]");
return builder.toString();
	}
private Aluno[] alunos = new Aluno[100000];
private int totalDeAlunos = 0;
public void adiciona(Aluno aluno) {
this.alunos[this.totalDeAlunos] = aluno;
this.totalDeAlunos++;
}
public int tamanho() {
return this.totalDeAlunos;
}
public boolean contem(Aluno aluno) {
for (int i = 0; i < this.alunos.length; i++) {
if (aluno == this.alunos[i]) {
return true;
}
}
return false;
}
public Aluno pega(int posicao) {
return this.alunos[posicao];
}
public class Teste {
public static void main(String[] args) {
Aluno a1 = new Aluno();
a1.setNome("Rafael");
Vetor1 lista = new Vetor1();
lista.adiciona(a1);
lista.pega(0);
lista.pega(1);
lista.pega(100000000);
}
}

}
