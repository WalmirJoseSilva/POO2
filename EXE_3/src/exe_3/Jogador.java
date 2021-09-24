
package exe_3;

/**
 *
 * @author WALMIR
 */
public class Jogador {
public String v1;
   Carta[] cartas = new Carta[12];
   int numroDcartas = 0;
   
   
public Carta RecebeCarta(int numeroDcartas){
    
    numeroDcartas++;
    return cartas[numeroDcartas];
    

        
   }

    public void ValorDamao() {
     
    }
}
