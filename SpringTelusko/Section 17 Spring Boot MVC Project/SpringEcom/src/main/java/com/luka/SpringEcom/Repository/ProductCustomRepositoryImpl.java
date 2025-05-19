package com.luka.SpringEcom.Repository;

import com.luka.SpringEcom.model.Product;
import jakarta.persistence.Cache;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductCustomRepositoryImpl implements ProductCustomRepository {
    private final EntityManager entityManager;

    @Autowired
    public ProductCustomRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> query=
                entityManager.createQuery("FROM "+Product.class.getSimpleName()+" WHERE name LIKE :name",Product.class);

        query.setParameter("name","%"+name+"%");
        return query.getResultList();
    }

    @Override
    public List<Product> findByCategory(String category) {
        TypedQuery<Product> query=
                entityManager.createQuery("FROM "+Product.class.getSimpleName()+" WHERE category= :category",Product.class);

        query.setParameter("category", category);
        return query.getResultList();
    }
}
