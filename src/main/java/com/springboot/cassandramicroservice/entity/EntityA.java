package com.springboot.cassandramicroservice.entity;

import com.springboot.cassandramicroservice.IdentifierUDT;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("EntityA")
public class EntityA {

    @Column
    @PrimaryKey
    private String name;

    @Column
    private String description;
    @Column
    @Frozen
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "identifier", )
    private IdentifierUDT entityIdentifier;
}
