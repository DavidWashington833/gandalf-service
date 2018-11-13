/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gandalf.DTO;

import com.google.gson.annotations.Expose;
import com.gandalf.models.Cliente;
import com.gandalf.models.Produto;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author David Washington
 */
public class ProductDTO {

    public int idProduct;
    public String nameProduct;
    public BigDecimal priceProduct;
    public BigDecimal discountProduct;
    public Integer stockProduct;
    public String descriptionProduct;
    public int activeProduct;
    public byte[] imageProduct;

}