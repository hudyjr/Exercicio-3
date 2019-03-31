/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnB
 */
public class TestaAluno {
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno();
        a1.nome = "Lucas Cardoso";
        a1.curso = "Sistemas de Informacao";
        a1.materia = "Redes II";
        a1.nota = 67;
        
        System.out.println("Aluno:"+ a1.nome);
        System.out.println("Curso:"+ a1.curso);
        
        Aluno a2 = new Aluno();
        a2.nome = "Milena Cardoso";
        a2.curso = "Administração";
        a2.materia = "Economia";
        a2.nota = 79;
        
        System.out.println("Aluno:"+ a2.nome);
        System.out.println("Curso:"+ a2.curso);
        
        Aluno a3 = new Aluno();
        a3.nome = "Carlos Henrrique";
        a3.curso = "Matematica";
        a3.materia = "calculo numerico";
        a3.nota = 80;
        
        System.out.println("Aluno:"+ a3.nome);
        System.out.println("Curso:"+ a3.curso);
        
        
        
        
               
    }
    
}
