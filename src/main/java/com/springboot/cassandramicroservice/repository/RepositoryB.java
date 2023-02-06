package com.springboot.cassandramicroservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryB extends CassandraRepository<EntityB, String> {
}
