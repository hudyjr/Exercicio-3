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
        a1.nome = "John Herbert";
        a1.curso = "Sistemas de Informacao";
        a1.materia = "Banco de dados";
        a1.nota = 65;
        
        System.out.println("Aluno:"+ a1.nome);
        System.out.println("Curso:"+ a1.curso);
        
        Aluno a2 = new Aluno();
        a2.nome = "Raissa Ferreira";
        a2.curso = "Quimica";
        a2.materia = "Organica 3";
        a2.nota = 98;
        
        System.out.println("Aluno:"+ a2.nome);
        System.out.println("Curso:"+ a2.curso);
        
        Aluno a3 = new Aluno();
        a3.nome = "Carlos Max";
        a3.curso = "Administração";
        a3.materia = "Estatistica";
        a3.nota = 70;
        
        System.out.println("Aluno:"+ a3.nome);
        System.out.println("Curso:"+ a3.curso);
        
        
        
        
               
    }
    
}
