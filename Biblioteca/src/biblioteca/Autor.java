
package biblioteca;

/**
 *
 * @author WALMIR
 */
public class Autor {
private String nome;
private Autor proxAutor;

public Autor getProxAutor() {
	return proxAutor;
}

public void setProxAutor(Autor proxAutor) {
	this.proxAutor = proxAutor;
}

private Livro primLivro;

public Autor (String nomeT){
	
	nome = nomeT;
	
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}  
}
