
package questao5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Viviane Viana
 */

//5. Uma Universidade possui diversos Cursos. Cada Curso pode possuir nenhum ou diversos
//Alunos matriculados. Implemente um sistema de acordo com o diagrama UML da Figura 3.

public class Curso {
    public String nomeCurso;
    public int codigo;
    List<Estudante> estudantes = new ArrayList<>();
    Universidade universidade;
    
    public Curso(String nomeCurso, int codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.universidade = universidade;
    }
    
    public String getNomeCurso() {
        return this.nomeCurso;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void addAlunos(Estudante estudante) {
        this.estudantes.add(estudante);
    }
    
    public List<Estudante> getEstudantes() {
        return this.estudantes;
    }
}
