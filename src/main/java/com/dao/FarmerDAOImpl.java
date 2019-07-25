package com.dao;

import com.entity.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class FarmerDAOImpl implements FarmerDAO {
    private EntityManager entityManager;

    @Autowired
    public FarmerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Farmer create(Farmer farmer)
    {
    entityManager.persist(farmer);
    entityManager.flush();
    return farmer;
    }

    @Override
    public void update(Farmer farmer) {
        entityManager.merge(farmer);

    }

    @Override
    public void delete(Farmer farmer) {
        entityManager.remove(farmer);

    }

    @Override
    public Farmer getById(int id) {

        String q ="select a from Farmer a where a.farmerId=:id";
        Query query = entityManager.createQuery(q);
        query.setParameter("id",id);
        List result = query.getResultList();
        if (result.size()>0)
        {
            return (Farmer)result.get(0);
        }

        return null;
    }

    @Override
    public List<Farmer> getAllByStatus(int status)

    {
        String q ="select a from Farmer a where a.farmerStatus=:status";
        Query query = entityManager.createQuery(q);
        query.setParameter("status",status);
        return query.getResultList();
    }
}
