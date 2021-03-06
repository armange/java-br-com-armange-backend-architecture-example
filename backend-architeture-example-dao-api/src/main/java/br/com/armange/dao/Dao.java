package br.com.armange.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;

import br.com.armange.entity.Identifiable;

public interface Dao<T extends Serializable, I extends Identifiable<T>> {

    Class<I> getEntityClass();
    
    I save(I identifiable);
    
    void update(I identifiable);
    
    //Postponed.
    //void saveOrUpdate(I identifiable);
    
    void delete(T identifiable);
    
    //Postponed.
    //Transaction beginTransaction();
    
    I findOne(T identity);
    
    //Postponed.
    //I findOneByNative(String query, Map<String, Object> parameters);
    
    I findOneByJPQL(String query, Map<String, Object> parameters);
    
    //Postponed.
    //List<I> findManyByNative(String query, Map<String, Object> parameters);
    
    List<I> findAll();
    
    Page<I> findPage();
    
    CountedPage<I> findCountedPage();
    
    List<I> findManyByJPQL(String query, Map<String, Object> parameters);
    
    Page<I> findPageByJPQL(String query, Map<String, Object> parameters, int page, int pageSize);
    
    CountedPage<I> findCountedPageByJPQL(String query, Map<String, Object> parameters, int page, int pageSize);
    
    CriteriaBuilder getCriteriaBuilder();
}