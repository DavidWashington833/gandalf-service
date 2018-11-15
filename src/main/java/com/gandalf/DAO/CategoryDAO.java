/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gandalf.DAO;

import com.gandalf.DTO.CategoryDTO;
import com.gandalf.HibernateUtil;
import com.gandalf.models.Categoria;
import com.gandalf.models.Produto;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author David Washington
 */
public class CategoryDAO extends DAO {
    
    public List<Categoria> get() {
        return session.createCriteria(Categoria.class).list();
    }
    
    public CategoryDTO getCategoryDTO(Categoria category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.id = category.getIdCategoria();
        categoryDTO.name = category.getNomeCategoria();
        categoryDTO.description = category.getDescCategoria();
        return categoryDTO;
    }
    
}
