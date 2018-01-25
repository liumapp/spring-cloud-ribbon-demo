# spring-cloud-ribbon-demo
Simple demo for Spring Cloud Ribbon 

## how to use

* start ribbon-demo-eureka first 
 
    * then view http://localhost:1234
    
    * you can the eureka pannel 
    
* start client A and client B , they are named ribbon-demo-client-a and ribbon-demo-clint-b

    * then you can find they are registed in eureka pannel
    
    * client A is listening on 8081 and client B is listening on 8082
    
* start customer , it was named ribbon-demo-customer

    * view http://localhost:8083
    
    * keep refresh the page , you can find client A and client B is offering their server . 
    