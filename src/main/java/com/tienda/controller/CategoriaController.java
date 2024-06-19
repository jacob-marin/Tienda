
package com.tienda.controller;

import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired  // 
    CategoriaService categoriaService; // con este objeto culaquir metodo que este dentro de este controlador vamos a poderlo utilizar
    
    @GetMapping("/listado")
    public String listado(Model model) { // model, es el trasporte de datos entre el controlador y la vista HTML
        //el primero es la clase por ese con mayuscula y el segundo el objeto, se define el nombre que sea.
        List<Categoria> lista = categoriaService.getCategorias(false);
        model.addAttribute("categorias",lista);
        model.addAttribute("totalCategorias", lista.size());
        
        return "/categoria/listado";
    }
    
}
