/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hudson
 */
public class TestaVendas {
    public static void main(String[] args){
         Vendas v1 = new Vendas();
        v1.produto = "Notebook Acer";
        v1.preco = 2000;
        v1.vendedor = "Lucas Cardoso";
        
        System.out.println("Produto:"+v1.produto);
        System.out.println("Preco:"+v1.preco);
        
         Vendas v2 = new Vendas();
        v2.produto = "Zen Fone MAX";
        v2.preco = 2000;
        v2.vendedor = "Hudson Cleuber";
        
        System.out.println("Produto:"+v2.produto);
        System.out.println("Preco:"+v2.preco);
        
         Vendas v3 = new Vendas();
        v3.produto = "Xbox One X";
        v3.preco = 1999;
        v3.vendedor = "Igor Gabriel";
        
        System.out.println("Produto:"+v3.produto);
        System.out.println("Preco:"+v3.preco);
    }
    
}
