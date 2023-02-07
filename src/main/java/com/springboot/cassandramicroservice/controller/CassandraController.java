package com.springboot.cassandramicroservice.controller;

import com.springboot.cassandramicroservice.repository.RepositoryA;
import com.springboot.cassandramicroservice.repository.RepositoryB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entity")
public class CassandraController {

    private RepositoryA repositoryA;
    private RepositoryB repositoryB;

    public CassandraController(RepositoryA repositoryA, RepositoryB repositoryB){
        this.repositoryA = repositoryA;
        this.repositoryB = repositoryB;
    }

    @GetMapping("/save")
    public Boolean saveEntity(@RequestParam String entity, @RequestParam String name, @RequestParam String description){

        if (entity.equalsIgnoreCase("b")){
            repositoryB.insert()
        }
    }

}
