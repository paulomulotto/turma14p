package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

/*
 *  DAO => Design Patter (Data Access Object)
 *  Dentro do DAO devemos encontrar métodos para:
 *  Cadastrar (create)
 *  Consultar (Read)
 *  Atualizar (Update)
 *  Apagar (Delete)
 *  Formando assim o CRUD
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	/*
	 * Métodos que o Sprin cria são:
	 * save() -> gravar / atualizar
	 * findById() => consultar pela chave primaria
	 * findAll() => consultar todas as linhas
	 * deleteById() => apagar através da chave primaria
	 * deleteAll() => apagar tudo
	 */
	
	public Usuario findByEmailAndSenha(String email, String senha);
}
