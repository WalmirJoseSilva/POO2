
package exe_3;
/**
 *
 * @author WALMIR
 */
public class EXE_3 {

    
    public static void main(String[] args) {
       
        
        Baralho b = new Baralho();
        b.embaralhar();
        Jogador Walmir = new Jogador();
        Jogador user = new Jogador();
        user.cartas = b.DistribuirCartas();
    }
    
}
