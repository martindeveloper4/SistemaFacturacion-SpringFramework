package com.appfactura.repository;

import org.springframework.data.repository.CrudRepository;

import com.appfactura.entity.Factura;



public interface IFacturaRepository extends CrudRepository<Factura, Long>{

}