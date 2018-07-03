package com.myframework;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({
    "classpath:${env}.properties" // mention the property file name
})
public interface MyEnvironment extends Config {

    String url();
    
    String username();
    
    String password();
    
    @Key("db.hostname")
    
    String getDBHostname();
    
    @Key("db.port")
    
    int getDBPort();
    
    @Key("db.username")
    
    String getDBUsername();
    
    @Key("db.password")
    
    String getDBPassword();
    
    @Key("broswername")
    String getBroswer();
    

}