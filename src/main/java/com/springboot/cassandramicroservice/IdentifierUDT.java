package com.springboot.cassandramicroservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;


@Data
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType(value = "identifier")
public class IdentifierUDT {

    private String idKey;
    private String idType;
    private String value;
}
