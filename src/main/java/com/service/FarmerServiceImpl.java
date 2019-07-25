package com.service;

import com.dao.FarmerDAO;
import com.entity.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerServiceImpl implements FarmerService {
    private final int Active=1;

    private  FarmerDAO farmerDAO;

    @Autowired
    public FarmerServiceImpl(FarmerDAO farmerDAO) {
     this.farmerDAO=farmerDAO;
    }

    @Override
    public Farmer create(Farmer farmer) {
        return farmerDAO.create(farmer);
    }

    @Override
    public void update(Farmer farmer) {
        farmerDAO.update(farmer);

    }

    @Override
    public void delete(Farmer farmer) {
        farmerDAO.delete(farmer);
    }

    @Override
    public Farmer getById(int id) {
        return farmerDAO.getById(id);
    }

    @Override
    public List<Farmer> getAllActive() {
        return farmerDAO.getAllByStatus(Active);
    }
}
