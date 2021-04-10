
package questao3;

/**
 *
 * @author Viviane Viana
 */

//3. Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os
//canais da televisão. O controle remoto permite as seguintes ações:
// Aumentar ou diminuir o volume de som em uma unidade.
// Aumentar e diminuir o número do canal em uma unidade.
// Trocar para um canal indicado.
// Mostrar o volume de som e o canal selecionado atualmente.

public class Televisao {
    public int volume;
    public int canal;
    
    public Televisao (int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
}
