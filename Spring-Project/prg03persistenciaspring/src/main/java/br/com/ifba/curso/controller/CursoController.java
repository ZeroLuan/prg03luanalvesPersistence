/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService;
import java.util.List;
import org.slf4j.Logger;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Luan Alves
 */
@Controller // camada de entrada responsavel por trafegar os dados para a service, onde possui regras. 
@RequiredArgsConstructor
public class CursoController implements CursoIController {
    
    private final CursoIService cursoIService;
    
    private static final Logger log = LoggerFactory.getLogger(CursoController.class);
    
    @Override
    public List<Curso> findAll() throws RuntimeException{
        log.info("Procuranto por todos Cursos");
        return cursoIService.findAll();
    }
    
    @Override
    public Curso save(Curso curso) throws RuntimeException{
        log.info("Cadastrando novo Curso");
        return cursoIService.save(curso);
    }
    
    @Override 
    public Curso update(Curso curso) throws RuntimeException{
        log.info("Atualizando um Curso");
        return cursoIService.update(curso);
    }
    
    @Override
    public void delete(Curso curso) throws RuntimeException{
        log.info("Deletando um Curso");
         cursoIService.delete(curso);    
    }
    
    @Override
    public Curso findById(Long id) throws RuntimeException{
        log.info("Buscando um Curso pelo ID");
        return cursoIService.findById(id);
    }
    
}