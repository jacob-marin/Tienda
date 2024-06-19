
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author jacob
 */
// aqui van a estar todas las interfaces 
public interface CategoriaService {
    
    //Metodo que obtiene una lista de categorias
    public List<Categoria> getCategorias(boolean activo);
}
