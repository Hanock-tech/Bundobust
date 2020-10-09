package com.police.bundobust.configuration;

import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
/*
public class df{




public static void establishConnections() 
{ 

    try { 
        MongoClient db 
            = new MongoClient("localhost", 27017); 

        MongoCredential credential; 
        credential 
            = MongoCredential 
                  .createCredential( 
                      "GFGUser", "mongoDb", 
                      "password".toCharArray()); 
        System.out.println( 
            "Successfully Connected"
            + " to the database"); 

        MongoDatabase database 
            = db.getDatabase("mongoDb"); 
        System.out.println("Credentials are: "
                           + credential); 
    } 
    catch (Exception e) { 
        System.out.println( 
            "Connection establishment failed"); 
        System.out.println(e); 
    } 
}
}
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.MongoClient;
@SuppressWarnings("deprecation")
@Configuration
@EnableMongoRepositories(basePackages="com.police.bundobust.repository" )
public class MongoDBConfig {
   
    @SuppressWarnings("deprecation")
	@Bean
    public  MongoDbFactory mongoDbFactory() throws Exception {
    	MongoClient mongoClient = new MongoClient("3.15.171.67",27017);
    	UserCredentials userCredentials = new UserCredentials("","");
        return new MongoDbFactory(mongoClient, "concretepage",userCredentials);
    }
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
} */


