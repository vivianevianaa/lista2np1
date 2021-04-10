
package questao5;

import java.util.List;

/**
 *
 * @author Viviane Viana
 */

//5. Uma Universidade possui diversos Cursos. Cada Curso pode possuir nenhum ou diversos
//Alunos matriculados. Implemente um sistema de acordo com o diagrama UML da Figura 3.

public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Curso> cursos;
    
    public Universidade(String nomeUniversidade, String descricao) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = descricao;
    }
    
    public String getNomeUniversidade() {
        return this.nomeUniversidade;
    }
    
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void getNomeDosCursos() {
        cursos.forEach((c) -> {
            System.out.println(c.nomeCurso);
        });
    }
    
    int totalCursos = 0;
    public int getTotalCursos() {
        cursos.forEach((c) -> {
            totalCursos++;
        });
        return totalCursos;
    }
    
    int totalAlunos = 0;
    List<Estudante> estudantes;
    public int getTotalAlunosUniversidades() {        
        cursos.forEach((c) -> {
            estudantes = c.getEstudantes();
            estudantes.forEach((e) -> {
                totalAlunos++;
            });
        });
        return totalAlunos;
    }
}
