package com.vallegrande.producto.service;

import com.vallegrande.producto.h2.entity.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(Long id);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);
}
