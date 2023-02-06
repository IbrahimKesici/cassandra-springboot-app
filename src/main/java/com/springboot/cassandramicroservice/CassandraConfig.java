package com.springboot.cassandramicroservice;


import com.datastax.oss.driver.api.core.auth.AuthProvider;
import com.datastax.oss.driver.internal.core.auth.PlainTextAuthProvider;
import edu.umd.cs.findbugs.annotations.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;


public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.contact-points:placeholder}")
    private String contactPoints;

    @Value("${spring.data.cassandra.port:0000}")
    private int port;

    @Value("${spring.data.cassandra.keyspace:placeholder}")
    private String keySpace;

    @Value("${spring.data.cassandra.username}")
    private String username;

    @Value("${spring.data.cassandra.password}")
    private String password;


    @Value("${spring.data.cassandra.schema-action:NONE}")
    private String schemaAction;

    @NonNull
    @Override
    protected String getContactPoints(){
        return contactPoints;
    }

    @NonNull
    @Override
    protected String getKeyspaceName(){
        return keySpace;
    }

    @Override
    protected int getPort(){
        return port;
    }

    @NonNull
    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.valueOf(schemaAction);
    }

    // TODO
    protected AuthProvider getAuthProvider() {
        return new PlainTextAuthProvider(username, password);
    }

}
