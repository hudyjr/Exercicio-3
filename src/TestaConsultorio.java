/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaConsultorio {
    
    public static void main(String[] args){
        Consultorio c1 = new Consultorio();
        c1.paciente = "Lucas Cardoso";
        c1.DataExa = "30-04-1997";
        c1.preco = 300;
        
        System.out.println("Paciente:"+c1.paciente);
        System.out.println("Data do exame:"+c1.DataExa);
        
        Consultorio c2 = new Consultorio();
        c2.paciente = "Beatriz Cardoso";
        c2.DataExa = "24-12-2003";
        c2.preco = 150.75;
        
        System.out.println("Paciente:"+c2.paciente);
        System.out.println("Data do exame:"+c2.DataExa);
        
        Consultorio c3 = new Consultorio();
        c3.paciente = "Luciene Cardoso";
        c3.DataExa = "12-08-1974";
        c3.preco = 200.35;
        
        System.out.println("Paciente:"+c3.paciente);
        System.out.println("Data do exame:"+c3.DataExa);
    }
    
}
