/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.util.StringUtil;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luan Alves
 */

@Service
public class CursoService implements CursoIService {
    
    // DAO responsável pelo acesso ao banco
    @Autowired
    private CursoIDao cursoDao;
    
    // Salva um novo curso após validações
    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if (curso == null) {
            throw new RuntimeException("Dados do curso não preenchidos.");
        } else if (curso.getId() != null) {
            throw new RuntimeException("Curso já existente no banco de dados.");
        } else if (StringUtil.isEmpty(curso.getNome())) {
            throw new RuntimeException("Nome do curso não pode estar vazio.");
        }

        return cursoDao.save(curso);
    }
    
    // Atualiza um curso existente após validar ID
    @Override
    public Curso update(Curso curso) throws RuntimeException {
        if (curso == null || curso.getId() == null) {
            throw new RuntimeException("Curso inválido para atualização.");
        }

        return cursoDao.update(curso);
    }
    
    // Remove um curso após validar ID
    @Override 
    public void delete(Curso curso) throws RuntimeException {
        if (curso == null || curso.getId() == null) {
            throw new RuntimeException("Curso inválido para exclusão.");
        }

        cursoDao.delete(curso);
    }
    
    // Retorna todos os cursos
    @Override
    public List<Curso> findAll() throws RuntimeException {
        List<Curso> cursos = cursoDao.findAll();
        if(cursos.isEmpty()){
            return Collections.emptyList();
        }
        return cursos;
    }
    
    // Busca curso por ID com validação
    @Override
    public Curso findById(Long id) throws RuntimeException {
        if (id == null) {
            throw new RuntimeException("ID inválido.");
        }

        return cursoDao.findById(id);
    }
    
}