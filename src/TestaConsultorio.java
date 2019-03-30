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
        c1.paciente = "John Herbert";
        c1.DataExa = "22-03-2019";
        c1.preco = 300.55;
        
        System.out.println("Paciente:"+c1.paciente);
        System.out.println("Data do exame:"+c1.DataExa);
        
        Consultorio c2 = new Consultorio();
        c2.paciente = "Luana Ingrid";
        c2.DataExa = "26-04-2019";
        c2.preco = 150.75;
        
        System.out.println("Paciente:"+c2.paciente);
        System.out.println("Data do exame:"+c2.DataExa);
        
        Consultorio c3 = new Consultorio();
        c3.paciente = "John Herbert";
        c3.DataExa = "01-05-2019";
        c3.preco = 200.35;
        
        System.out.println("Paciente:"+c3.paciente);
        System.out.println("Data do exame:"+c3.DataExa);
    }
    
}
