/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hudson
 */
public class TestaConsultorio {
    
    public static void main(String[] args){
        Consultorio c1 = new Consultorio();
        c1.paciente = "Marcus Cardoso";
        c1.DataExa = "22-04-1997";
        c1.preco = 300;
        
        System.out.println("Paciente:"+c1.paciente);
        System.out.println("Data do exame:"+c1.DataExa);
        
        Consultorio c2 = new Consultorio();
        c2.paciente = "Vanessa Felix";
        c2.DataExa = "24-11-2004";
        c2.preco = 150.75;
        
        System.out.println("Paciente:"+c2.paciente);
        System.out.println("Data do exame:"+c2.DataExa);
        
        Consultorio c3 = new Consultorio();
        c3.paciente = "Luciene do Carmo";
        c3.DataExa = "12-09-1974";
        c3.preco = 200.35;
        
        System.out.println("Paciente:"+c3.paciente);
        System.out.println("Data do exame:"+c3.DataExa);
    }
    
}
