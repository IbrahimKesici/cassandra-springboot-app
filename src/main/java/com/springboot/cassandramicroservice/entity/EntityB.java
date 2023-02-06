package com.springboot.cassandramicroservice.entity;

import com.springboot.cassandramicroservice.IdentifierUDT;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("EntityB")
public class EntityB {

    @Column
    @PrimaryKey
    private String name;

    @Column
    private String description;
}
