package pesquisa_list;
import java.util.ArrayList;
import java.util.List;


public class CatalogoLivro {
    private List<Livro> livroList;
    
    public CatalogoLivro(){this.livroList = new ArrayList<>();}
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao ){
        livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livrosPorAutor.add(l);
            }
          }
          return livrosPorAutor;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
              livrosPorIntervaloAnos.add(l);
            }
          }
          return livrosPorIntervaloAnos;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivro catalogoLivros = new CatalogoLivro();
        catalogoLivros.adicionarLivro("livro 1", "Autor 1", 1999);
        catalogoLivros.adicionarLivro("livro 2", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("livro 3", "Autor 3", 2001);
        catalogoLivros.adicionarLivro("livro 4", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("livro 5", "Autor 5", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2005));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 2"));
    }
}
