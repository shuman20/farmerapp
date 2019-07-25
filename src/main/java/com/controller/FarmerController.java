package com.controller;

import com.entity.Farmer;
import com.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FarmerController {
    private FarmerService farmerService;

    @Autowired
    public FarmerController(FarmerService farmerService){
        this.farmerService=farmerService;
    }
    @GetMapping("/farmers/active")
    public List<Farmer> getAllFarmers(){
        return farmerService.getAllActive();
    }

    @PostMapping("/farmer")
    public void create(@RequestBody Farmer farmer){
        farmerService.create(farmer);
    }

    @PutMapping("/farmer")
        public void update(@RequestBody Farmer farmer){
        farmerService.update(farmer);
        }
    @DeleteMapping("/farmer")
    public void delete(@RequestBody Farmer farmer){
        farmerService.delete(farmer);
    }

}
