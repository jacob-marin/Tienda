
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author jacob
 */
// aqui van a estar todas las interfaces 
public interface ProductoService {
    
    //Metodo que obtiene una lista de productos
    public List<Producto> getProductos(boolean activo);
    
   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
}

//se realiza el cambo general de las palabras cpon "ctrol + h "
