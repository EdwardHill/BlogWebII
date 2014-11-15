package miniblog.dados;

import java.util.List;

public interface IRepositorio <E>{
	void adicionar(E entidade);
	void remover(E entidade);
	void editar(E entidade);
	List <E> entidade();
	E pesquisar(E entidade);
}
