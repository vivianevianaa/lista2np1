
package questao2;

import java.util.Calendar;

/**
 *
 * @author Viviane Viana
 */

//2. Faça um programa usando a linguagem de programação Java que implemente uma classe Pessoa
//que possui os atributos nome, altura e idade. A classe Pessoa deve conter um construtor para inicializar os
//atributos e os seguintes métodos: um método para mostrar os dados da pessoa e outro método para calcular
//o seu ano de nascimento. A Figura 1 apresenta o diagrama UML da classe Pessoa.

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    
    public Pessoa (String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public int calcularAnoNascimento() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int anoNasc = anoAtual - this.idade;
        return anoNasc;
    }
        
    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Ano de nascimento: " + calcularAnoNascimento());
    }    

    //teste
    public static void main(String[] args) {
        Pessoa vivi = new Pessoa("Viviane", 22, (float) 1.54);
        
        vivi.mostrarDados();
    }
}
