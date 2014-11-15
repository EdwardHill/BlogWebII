package miniblog.dados.repositorio;

import java.util.List;

import miniblog.dados.IRepositorio;
import miniblog.negocio.entidades.Postagem;

public class RepositorioPostagem implements IRepositorio<Postagem> {
	private List <Postagem> postagens; 
	
	
	public RepositorioPostagem(List <Postagem> postagens){
		this.postagens = postagens;
	}
	@Override
	public void adicionar(Postagem entidade) {
		postagens.add(entidade);
		
	}

	@Override
	public void remover(Postagem entidade) {
		postagens.remove(entidade);
		
	}

	@Override
	public void editar(Postagem entidade) {
		Postagem postagem=null;
		for(Postagem p : postagens){
			if(p.getId_postagem() == entidade.getId_postagem()){
			 postagem =p;
			}
		}
		if(postagem!= null){
			postagem.setAutor(entidade.getAutor());
			postagem.setCategoria(entidade.getCategoria());
			postagem.setComentarios(entidade.getComentarios());
			postagem.setConteudo(entidade.getConteudo());
			postagem.setData(entidade.getData());
			postagem.setFonte(entidade.getFonte());
			postagem.setTitulo(entidade.getTitulo());
			postagem.setMedia(entidade.getMedia());
			postagem.setQuantidade_visualizacao(entidade.getQuantidade_visualizacao());
		
		}
		
	}

	@Override
	public List<Postagem> entidade() {
		// TODO Auto-generated method stub
		return postagens;
	}

	@Override
	public Postagem pesquisar(Postagem entidade) {
		Postagem postagem = null;
		for(Postagem p : postagens){
			if(p.getId_postagem() == entidade.getId_postagem()){
			 postagem = p;
			}
		}
		
		return postagem;
	}

	
	}

	