package com.appfactura.repository;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.appfactura.entity.Cliente;

public interface IClienteRepository extends PagingAndSortingRepository<Cliente, Long>{
	
	
}
