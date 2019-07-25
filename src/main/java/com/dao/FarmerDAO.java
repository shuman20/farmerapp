package com.dao;

import com.entity.Farmer;

import java.util.List;

public interface FarmerDAO {
    Farmer create(Farmer farmer);
    void update(Farmer farmer);
    void delete(Farmer farmer);
    Farmer getById(int id);
    List<Farmer> getAllByStatus(int status);

}
