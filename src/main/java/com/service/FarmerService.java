package com.service;

import com.entity.Farmer;

import java.util.List;

public interface FarmerService {
    Farmer create(Farmer farmer);

    void update(Farmer farmer);
    void delete(Farmer farmer);

    Farmer getById(int id);
    List<Farmer> getAllActive();
}
