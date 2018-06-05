package com.globalmatics.bike.controllers;

import com.globalmatics.bike.models.Bike;
import com.globalmatics.bike.repositiories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 6/2/18 at 12 39
 **/
@RestController

@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    private BikeRepository bikeRepository;

    /**
     *
     * @return
     */
    @GetMapping
    public List<Bike>list() {
        return bikeRepository.findAll();
    }

    /**
     *
     * @param bike
     */
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {

        return bikeRepository.getOne(id);
    }
}
