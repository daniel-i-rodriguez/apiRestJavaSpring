package com.init.productos.res;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.init.productos.dao.productosDao;

import com.init.productos.entitys.productos;


@RestController
@RequestMapping("NutriNET/Cliente")

public class productoREST {
	
	@Autowired
	private productosDao productosDao;
	
	@GetMapping
	public ResponseEntity<List<productos>> getProducto(){
		List<productos> producto = productosDao.findAll();
		return ResponseEntity.ok(producto);
		
	}
	
	@PostMapping
	public ResponseEntity<productos> createProducto(@RequestBody productos producto){
		productos newproducto = productosDao.save(producto);
		return ResponseEntity.ok(newproducto);
		
	}
	
	@PutMapping
	public ResponseEntity<productos> updateProducto(@RequestBody productos producto){
		productos newproducto = productosDao.save(producto);
		return ResponseEntity.ok(newproducto);
		
	}
	
	/*
	@GetMapping
	public String hello() {
		return "jajajjaja";
	}
	*/
}
