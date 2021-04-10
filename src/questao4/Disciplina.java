
package questao4;

/**
 *
 * @author Viviane Viana
 */

//4. Crie um programa que implemente uma classe Disciplina que possui os atributos: nome da
//disciplina e código. A classe Disciplina deve conter um construtor para inicializar os atributos, um método
//que retorno o seu nome, um método para adicionar um professor e um método para retornar o nome do
//professor (caso tenha). Implemente também uma classe Professor que possui os atributos nome, id. A
//classe Professor deve possuir um construtor para inicializar os atributos. Uma disciplina pode possuir
//nenhum ou pelo menos um professor responsável. A Figura 2 apresenta o diagrama UML da associação.

public class Disciplina {
    public String nome;
    public int codigo;
    public Professor professor;
    
    
    public Disciplina(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public String getNomeDisciplina() {
        return this.nome;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getNomeProfessor() {
        return this.professor.nome;
    }
}
