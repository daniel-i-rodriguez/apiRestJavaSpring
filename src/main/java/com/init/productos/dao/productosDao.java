package com.init.productos.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.init.productos.entitys.productos;

public interface productosDao extends JpaRepository<productos, Long> {

}
