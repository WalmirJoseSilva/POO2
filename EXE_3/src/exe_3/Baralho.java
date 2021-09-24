
package exe_3;

/**
 *
 * @author WALMIR
 */
public class Baralho {
   
    public Carta[] cartas = new Carta[52];
  
    int numeroDcartas;
    
    public Baralho(){
        cartas[0] = new Carta("2",  "♠", 2);
        cartas[1] = new Carta("3",  "♠", 3);
        cartas[2] = new Carta("4",  "♠", 4);
        cartas[3] = new Carta("5",  "♠", 5);
        cartas[4] = new Carta("6",  "♠", 6);
        cartas[5] = new Carta("7",  "♠", 7);
        cartas[6] = new Carta("8",  "♠", 8);
        cartas[7] = new Carta("9",  "♠", 9);
        cartas[8] = new Carta("10", "♠", 10);
        cartas[9] = new Carta("J",  "♠", 11);
        cartas[10] = new Carta("Q", "♠", 12);
        cartas[11] = new Carta("K", "♠", 13);
        cartas[12] = new Carta("A", "♠", 1);  
        
        cartas[13] = new Carta("2", "♣", 2);
        cartas[14] = new Carta("3", "♣", 3);
        cartas[15] = new Carta("4", "♣", 4);
        cartas[16] = new Carta("5", "♣", 5);
        cartas[17] = new Carta("6", "♣", 6);
        cartas[18] = new Carta("7", "♣", 7);
        cartas[19] = new Carta("8", "♣", 8);
        cartas[20] = new Carta("9", "♣", 9);
        cartas[21] = new Carta("10","♣", 10);
        cartas[22] = new Carta("J", "♣", 11);
        cartas[23] = new Carta("Q", "♣", 12);
        cartas[24] = new Carta("K", "♣", 13);
        cartas[25] = new Carta("A", "♣", 1);

        cartas[26] = new Carta("2", "♦", 2);
        cartas[27] = new Carta("3", "♦", 3);
        cartas[28] = new Carta("4", "♦", 4);
        cartas[29] = new Carta("5", "♦", 5);
        cartas[30] = new Carta("6", "♦", 6);
        cartas[31] = new Carta("7", "♦", 7);
        cartas[32] = new Carta("8", "♦", 8);
        cartas[33] = new Carta("9", "♦", 9);
        cartas[34] = new Carta("10","♦", 10);
        cartas[35] = new Carta("J", "♦", 11);
        cartas[36] = new Carta("Q", "♦", 12);
        cartas[37] = new Carta("K", "♦", 13);
        cartas[38] = new Carta("A", "♦", 1);

        cartas[39] = new Carta("2", "♠", 2);
        cartas[40] = new Carta("3", "♠", 3);
        cartas[41] = new Carta("4", "♠", 4);
        cartas[42] = new Carta("5", "♠", 5);
        cartas[43] = new Carta("6", "♠", 6);
        cartas[44] = new Carta("7", "♠", 7);
        cartas[45] = new Carta("8", "♠", 8);
        cartas[46] = new Carta("9", "♠", 9);
        cartas[47] = new Carta("10","♠", 10);
        cartas[48] = new Carta("J", "♠", 11);
        cartas[49] = new Carta("Q", "♠", 12);
        cartas[50] = new Carta("K", "♠", 13);
        cartas[51] = new Carta("A", "♠", 1);
        
        numeroDcartas = 52;
    }
   
    
    public void embaralhar(Carta[] Cartas,int i){
        for( i = 0; i < numeroDcartas; i++);
           Carta temp = cartas[i];
           int tempi = (int) (Math.random() * numeroDcartas);
           Cartas[i] = cartas[tempi];
           cartas[tempi] = temp;
           i++;
    }


public Carta Darcarta(){

   numeroDcartas--;
        return cartas[numeroDcartas];
        
        
}
public void revelarBaralho(){
   Baralho t = new Baralho();
        int i = 0;
        while (i < numeroDcartas){
           System.out.println(cartas[i].naipe);
           System.out.println(cartas[i].valor);
        }

    }
   public Carta[] DistribuirCartas() {
   int i = 12;
   Carta[] retorno = new Carta[12];
   while (i > 0){
       if(numeroDcartas > 0){
           numeroDcartas--;
          retorno[i] = cartas[numeroDcartas+1];
          i--;
       }
   }  
   return retorno;
  
   }

    
}