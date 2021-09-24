
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author WALMIR
 */
public class ListaLivros {
private Livro primLivro;


public void insere(Livro novo){
    
    if (primLivro == null){
        primLivro=novo;
    }
    else {
        if (primLivro.getTitulo().compareTo(novo.getTitulo()) < 0){
            novo.setProxLivro(primLivro);
            primLivro = novo;
        }
        else {
            Livro temp = primLivro.getProxLivro();
            Livro anteriorTemp = null;        
            while (temp != null && temp.getTitulo().compareTo(novo.getTitulo()) < 0){
                anteriorTemp = temp;
                temp = temp.getProxLivro();
            }
            
            novo.setProxLivro(temp);
            anteriorTemp.setProxLivro(novo);
        }
    }
}

public Livro pesquisa(String titulo){
    Livro temp = primLivro;
    Livro posL = temp;
    if (temp!=null) {
        JOptionPane.showMessageDialog(null,temp.getTitulo().compareTo(titulo));
        while (temp.getTitulo().compareTo(titulo)!=0 && temp.getProxLivro()!= null)
        temp = temp.getProxLivro();
        
        if(temp.getTitulo().compareTo(titulo)==0){    
            JOptionPane.showMessageDialog(null,temp.getTitulo());
            JOptionPane.showMessageDialog(null,"O nome " + titulo + " existe");
            return posL;
        }
    else
        JOptionPane.showMessageDialog(null,"O nome " + titulo + " Não existe");
        return posL;
    }
    else
        JOptionPane.showMessageDialog(null,"Vazia!");
    return posL;
}

public void lista(){
    Livro temp = primLivro;
    String x="";
    while (temp != null){
        x=x+"Título: "+temp.getTitulo()+"\n Ano: "+temp.getAno()+"\n ISBN: "+temp.getIsbn()+"\n Preço: "+temp.getPreco()+"\n Área Científica: "+temp.getArea()+"\n";
        temp= temp.getProxLivro();
    }
    JOptionPane.showMessageDialog(null, x);    
}    
}
