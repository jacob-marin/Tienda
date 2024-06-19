
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service // es un servicio que va a respinder cuando hagan un llamado a CategoriaService
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired // cuando necesito un objeto de cierto tipo el se lo va a inyectar
    private CategoriaDao categoriaDao;  // aqui esta esto cundo lo ocupo , se instancia solo

    @Override
    public List<Categoria> getCategorias(boolean activo) {
        List<Categoria> lista = categoriaDao.findAll();
        
        //Filtrar en caso de querer solo activos
        if(activo){
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }
}
