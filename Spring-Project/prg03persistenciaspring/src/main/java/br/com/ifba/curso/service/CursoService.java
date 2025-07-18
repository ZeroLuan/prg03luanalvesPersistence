/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
import br.com.ifba.infrastructure.util.StringUtil;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luan Alves
 */

@Service // Camada responsavel pelas regras e conexão para operações relativas ao crud no banco de dados
@RequiredArgsConstructor
public class CursoService implements CursoIService {
    
// DAO responsável pelo acesso ao banco
private final CursoRepository cursoRepository;

private static final Logger log = LoggerFactory.getLogger(CursoService.class);

    // Salva um novo curso após validações
    @Override
    public Curso save(Curso curso) throws RuntimeException {
        log.info("Tentando salvar curso: {}");

        if (curso == null) {
            log.info("Tentativa de salvar curso nulo.");
            throw new RuntimeException("Dados do curso não preenchidos.");
        } else if (curso.getId() != null) {
            log.info("Tentativa de salvar curso já existente com ID: {}");
            throw new RuntimeException("Curso já existente no banco de dados.");
        } else if (StringUtil.isEmpty(curso.getNome())) {
            log.info("Tentativa de salvar curso com nome vazio.");
            throw new RuntimeException("Nome do curso não pode estar vazio.");
        }

        Curso salvo = cursoRepository.save(curso);
        log.info("Curso salvo com sucesso: {}");
        return salvo;
    }

    // Atualiza um curso existente após validar ID
    @Override
    public Curso update(Curso curso) throws RuntimeException {
        log.info("Tentando atualizar curso: {}");

        if (curso == null || curso.getId() == null) {
            log.info("Tentativa de atualizar curso inválido ou sem ID.");
            throw new RuntimeException("Curso inválido para atualização.");
        }

        Curso atualizado = cursoRepository.save(curso);
        log.info("Curso atualizado com sucesso: {}");
        return atualizado;
    }

    // Remove um curso após validar ID
    @Override 
    public void delete(Curso curso) throws RuntimeException {
        log.info("Tentando excluir curso: {}");

        if (curso == null || curso.getId() == null) {
            log.info("Tentativa de excluir curso inválido ou sem ID.");
            throw new RuntimeException("Curso inválido para exclusão.");
        }

        cursoRepository.delete(curso);
        log.info("Curso excluído com sucesso: {}");
    }

    // Retorna todos os cursos
    @Override
    public List<Curso> findAll() throws RuntimeException {
        log.info("Buscando todos os cursos.");

        List<Curso> cursos = cursoRepository.findAll();
        if (cursos.isEmpty()) {
            log.info("Nenhum curso encontrado.");
            return Collections.emptyList();
        }

        log.info("Cursos encontrados: {}");
        return cursos;
    }

    // Busca curso por ID com validação
    @Override
    public Curso findById(Long id) throws RuntimeException {
        log.info("Buscando curso pelo ID: {}");

        if (id == null) {
            log.info("Tentativa de busca com ID nulo.");
            throw new RuntimeException("ID inválido.");
        }

        Curso curso = cursoRepository.findById(id)
                .orElseThrow(() -> {
                    log.info("Nenhum curso encontrado para o ID: {}");
                    return new RuntimeException("Curso não encontrado para o ID: " + id);
                });

        log.info("Curso encontrado: {}");
        return curso;
    }

    
}