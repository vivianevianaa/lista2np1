
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

public class ControleRemoto {
    public int volume = 0;
    public int canal = 0;
    
    public ControleRemoto (int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    
    public int aumentarVolume() {
        return this.volume++;
    }
    
    public int diminuirVolume() {
        return this.volume--;
    }
    
    public int aumentarCanal() {
        return this.canal++;
    }
    
    public int diminuirCanal() {
        return this.canal--;
    }
    
    public void mudarCanal(int proxCanal) {
        this.canal = proxCanal;
    }
    
    public void mostrarInfos() {
        System.out.println("Volume atual: " + this.volume);
        System.out.println("Canal atual: " + this.canal);
    }
    
}
