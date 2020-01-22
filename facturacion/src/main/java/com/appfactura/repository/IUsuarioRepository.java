package com.appfactura.repository;


import org.springframework.data.repository.CrudRepository;

import com.appfactura.entity.Usuario;



public interface IUsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
