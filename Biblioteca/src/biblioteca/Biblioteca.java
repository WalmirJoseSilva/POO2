
package biblioteca;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WALMIR
 */
public class Biblioteca {

  
    public static void main(String[] args) {
                ListaAutores la = new ListaAutores();
        ListaLivros ll = new ListaLivros();
       Scanner entrada = new Scanner(System.in);
       System.out.println("Entre com um número entre 1 e 6:");
       int num = entrada.nextInt();
         switch (num) {  
                 
                 // Inserir Livros
                 case 1:{
                     String titulo=JOptionPane.showInputDialog("Inserir título do Livro: ");
                     int ano = Integer.parseInt(JOptionPane.showInputDialog("Inserir ano do Livro: "));
                     String isbn=JOptionPane.showInputDialog("Inserir ISBN do Livro: ");
                     double preco= Double.parseDouble(JOptionPane.showInputDialog("Inserir preço do Livro: "));
                     String area=JOptionPane.showInputDialog("Inserir Área Científica do Livro: ");
                     String nome=JOptionPane.showInputDialog("Inserir Autor do Livro: ");
                     Livro novo = new Livro(titulo, ano, isbn, preco, area);
                     ll.insere(novo);
                     la.insere(nome);
                     break;
                 }  
                 
                 // Listar Livros por ordem alfabética de título
                 case 2:{
                     ll.lista();
                     break;
                 }  
                 
                  // Listar Livros de um autor por ordem alfabética de título
                 case 3:{  
                     la.listaAutores();                                        
                     break;
                 }    
         
                 //Listar Livros de uma Área por ordem alfabética de título
                 case 4:{
                     
                     break;
                 } 
                 
                 //Listar Um Livro por ISBN
                 case 5:{
                    
                     break;
                 }   
                 
               //Listar Autores com Livros
                 case 6:{
                     
                     break;
                 }  
                 
                 default: System.out.println("Opção não disponível. Escolha uma das opções!");
                 }                            
             }       
    }

   

