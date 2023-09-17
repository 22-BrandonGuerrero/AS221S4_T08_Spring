package com.vallegrande.producto.h2.repositoy;

import com.vallegrande.producto.h2.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
