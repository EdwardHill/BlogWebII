package miniblog.dados.repositorio;

import java.util.List;

import miniblog.dados.IRepositorio;
import miniblog.negocio.entidades.Comentario;

public class RepositorioComentario implements IRepositorio <Comentario> {
	private List <Comentario> comentarios;
	
	public RepositorioComentario(List <Comentario> comentarios){
		this.comentarios=comentarios;
	}
	
	@Override
	public void adicionar(Comentario entidade) {
		comentarios.add(entidade);
		
	}

	@Override
	public void remover(Comentario entidade) {
		comentarios.remove(entidade);
		
	}

	@Override
	public void editar(Comentario entidade) {
		Comentario comentario=null;
		for(Comentario c : comentarios){
			if(c.getId_comentario() == entidade.getId_comentario()){
			 comentario = c;
			}
		}
		if(comentario!= null){
			comentario.setComentario(entidade.getComentario());
			comentario.setData(entidade.getData());
			comentario.setNome_visistante(entidade.getNome_visistante());
		}
		
	}

	@Override
	public List<Comentario> entidade() {
		// TODO Auto-generated method stub
		return comentarios;
	}

	@Override
	public Comentario pesquisar(Comentario entidade) {
		Comentario comentario=null;
		for(Comentario c : comentarios){
			if(c.getId_comentario()==entidade.getId_comentario()){
			 comentario = c;
			}
		}
		
		return comentario;
	}

}
