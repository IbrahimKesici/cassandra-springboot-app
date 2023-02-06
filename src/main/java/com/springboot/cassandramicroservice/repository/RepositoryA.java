package com.springboot.cassandramicroservice.repository;

import com.springboot.cassandramicroservice.entity.EntityA;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryA extends CassandraRepository<EntityA, String> {
}
