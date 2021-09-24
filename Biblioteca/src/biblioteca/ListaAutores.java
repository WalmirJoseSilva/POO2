
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author WALMIR
 */
public class ListaAutores {
private Autor primAutor;

public void insere(String nome){
        Autor novo = new Autor(nome);
        if (primAutor == null){
            novo.setNome(nome);
            primAutor=novo;
        }
        else {
            if (primAutor.getNome().compareTo(nome) > 0){
                novo.setProxAutor(primAutor);
                primAutor = novo;
            }
            else {
                Autor temp = primAutor;
                Autor anteriorTemp = null;        
                while (temp != null && temp.getNome().compareTo(nome) < 0){
                    anteriorTemp = temp;
                    temp = temp.getProxAutor();
                }
                novo.setProxAutor(temp);
                anteriorTemp.setProxAutor(novo);
            }
        }
    }

public Autor pesquisa(String nome){
    Autor temp = primAutor;
    Autor posA = temp;
    if (temp!=null) {
        // JOptionPane.showMessageDialog(null,temp.getNome().compareTo(nome));
        while (temp.getNome().compareTo(nome)!=0 && temp.getProxAutor()!= null)
        temp = temp.getProxAutor();
        
        if(temp.getNome().compareTo(nome)==0){    
            //JOptionPane.showMessageDialog(null,temp.getNome());
            JOptionPane.showMessageDialog(null,"O nome " + nome + " existe");
            return posA;
        }
    else
        JOptionPane.showMessageDialog(null,"O nome " + nome + " Não existe");
        return posA;
    }
    else
        JOptionPane.showMessageDialog(null,"Vazia!");
        return posA;
}

public void listaAutores(){
    Autor temp = primAutor;
    String x="";
    while (temp != null){
        x=x+temp.getNome()+"\n";
        temp= temp.getProxAutor();
    }
    JOptionPane.showMessageDialog(null, x);        
}    
}
