/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hudson
 */
public class TestaAluno {
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno();
        a1.nome = "Hudson Junior";
        a1.curso = "Sistemas de Informacao";
        a1.materia = "Banco de Dados";
        a1.nota = 88;
        
        System.out.println("Aluno:"+ a1.nome);
        System.out.println("Curso:"+ a1.curso);
        
        Aluno a2 = new Aluno();
        a2.nome = "Clara Cardoso";
        a2.curso = "Letras";
        a2.materia = "Ingles Instrumental";
        a2.nota = 79;
        
        System.out.println("Aluno:"+ a2.nome);
        System.out.println("Curso:"+ a2.curso);
        
        Aluno a3 = new Aluno();
        a3.nome = "Carlos Henrrique";
        a3.curso = "Matematica";
        a3.materia = "GAAL";
        a3.nota = 80;
        
        System.out.println("Aluno:"+ a3.nome);
        System.out.println("Curso:"+ a3.curso);
        
        
        
        
               
    }
    
}
