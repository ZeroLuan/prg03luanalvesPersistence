/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.repository;

import br.com.ifba.curso.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author a1591
 */
//Interface para poder persistir os dados no banco 
public interface CursoRepository extends JpaRepository<Curso, Long>{
    
}
