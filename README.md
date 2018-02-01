# spring-cloud-feign-demo
A simple demo for Spring Cloud Feign

## how to use 

* start eureka , customer , client a and client b project . 

* visit http://localhost:1234 you can find eureka pannal , which client a , client b and customer shall be registed already . 
 
* visit http://localhost:8083 , customer shall be ready to work . 

    * to test hystrix and ribbon , plz visit http://localhost:8083/feign-consumer or http://localhost:8083/feign-consumer2

    * keep refresh the page , you can find client a and client b will be used . 
    
    * close client a and client b , you can find hystrix already working . 
    

