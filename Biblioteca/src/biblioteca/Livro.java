
package biblioteca;

/**
 *
 * @author WALMIR
 */
public class Livro {
private	String titulo;
private int ano;
private String isbn;
private double preco;
private String area;
private Autor primAutor;
private Livro proxLivro;

public Livro (String tituloT, int anoT, String isbnT, double precoT, String areaT){
	titulo = tituloT;
	ano = anoT;
	isbn = isbnT;
	preco = precoT;
	area = areaT;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public Livro getProxLivro() {
	return proxLivro;
}

public void setProxLivro(Livro proxLivro) {
	this.proxLivro = proxLivro;
} 
}
