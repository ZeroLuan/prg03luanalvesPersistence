package br.com.ifba.infrastructure.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 * @author Luan Alves
 * @param <Entity>
 */

@Transactional
@SuppressWarnings("unchecked")
public class GenericDao <Entity extends PersistenceEntity> implements GenericIDao<Entity>{

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public Entity save (Entity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
        public Entity update (Entity entity) {
        entityManager.merge(entity);
        return entity;
    }

    @Override
        public void delete (Entity entity) {
        entity = findById(entity.getId());
        entityManager.remove(entity);
    }

    @Override
    public List<Entity> findAll() {
        String nomeClasse = getTypeClass().getSimpleName(); // Ex: "Curso"
        return (List<Entity>) entityManager
            .createQuery("from " + nomeClasse, getTypeClass())
            .getResultList();
    }


    @Override
    public Entity findById(Long id) {
        return (Entity) entityManager.find(getTypeClass(), id);
    }
    
    protected Class<?> getTypeClass(){
        
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
                
        return clazz;
    }

}
