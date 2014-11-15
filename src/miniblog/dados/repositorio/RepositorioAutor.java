package miniblog.dados.repositorio;

import java.util.List;

import miniblog.dados.IRepositorio;
import miniblog.negocio.entidades.Autor;

public class RepositorioAutor implements IRepositorio <Autor> {
	private List <Autor> autores;
	
	public RepositorioAutor(List <Autor> autores){
		this.autores=autores;
	}
	
	@Override
	public void adicionar(Autor entidade) {
	autores.add(entidade);
	}

	@Override
	public void remover(Autor entidade) {
		autores.remove(entidade);
		
	}

	@Override
	public void editar(Autor entidade) {
		Autor autor=null;
		for(Autor a : autores){
			if(a.getId_autor() == entidade.getId_autor()){
			 autor = a;
			}
		}
		if(autor!= null){
			autor.setNome(entidade.getNome());
			autor.setSexo(entidade.getSexo());
			autor.setDescricao_perfil(entidade.getDescricao_perfil());
			autor.setImagem_perfil(entidade.getImagem_perfil());
			autor.setData_nascimento(entidade.getData_nascimento());
			autor.setSenha(entidade.getSenha());
		}
	}

	@Override
	public List<Autor> entidade() {
		
		return autores;
	}

	@Override
	public Autor pesquisar(Autor entidade) {
		Autor autor=null;
		for(Autor a : autores){
			if(a.getId_autor() == entidade.getId_autor()){
			 autor = a;
			}
		}
		
		return autor;
	}

}
