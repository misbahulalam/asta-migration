package com.cefalo.asta.service;

import com.cefalo.asta.model.Institute;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * @author <a href="mailto:misbahulalam@gmail.com">Md. Misbahul Alam Chowdhury</a> on Aug 31, 2017
 * @since 1.0
 */
@Service
public class InstituteService {

    @PersistenceContext
    private EntityManager em;

    public List<Institute> listInstitutes() {
        if (em == null) {
            throw new NullPointerException("em shouldn't be null");
        }

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Institute> query = criteriaBuilder.createQuery(Institute.class);
        CriteriaQuery<Institute> select = query.select(query.from(Institute.class));

        return em.createQuery(select).getResultList();
    }

}
