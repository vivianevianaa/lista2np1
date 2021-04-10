
package questao5;

/**
 *
 * @author Viviane Viana
 */

//5. Uma Universidade possui diversos Cursos. Cada Curso pode possuir nenhum ou diversos
//Alunos matriculados. Implemente um sistema de acordo com o diagrama UML da Figura 3.

public class Estudante {
    public String nome;
    public int matricula;
    public Curso curso;
    
    public Estudante(String nome, int matricula, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
}
