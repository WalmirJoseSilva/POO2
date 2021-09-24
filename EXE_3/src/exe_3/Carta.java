
package exe_3;

/**
 *
 * @author WALMIR
 */
public class Carta {
    
    
    public String naipe;
    public String valor;
    public int v1;
    private Iterable<Carta> cartas;
    
    public Carta(String v, String n, int vn){
        valor = v;
        naipe = n;
        v1 = vn;
    }
public int ValorDamao(){
    int valordamao = 0;
    for (Carta carta : cartas){
        valordamao += carta.v1;
                
    }
    return valordamao;
}
}
