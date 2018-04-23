# Microservice-architecture-using-Spring-Boot

Taking inspiration from the [Microservices architecture](https://developers.redhat.com/blog/2016/09/15/writing-microservices-an-example-through-a-simple-to-do-application/) post from RedHat, Inc., I created a simple ToDo application using Microservices architecture and Spring Boot.  

The application creates multiple instances of two services - the ToDo service and the User service.  For communication between these services, the application makes use of [Netflix Eureka](https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance).  Client side load distribution/balancing is brought about by using [Netflix Ribbon](https://github.com/Netflix/ribbon/wiki).  It also uses [Netflix Feign](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html) for invoking the RESTful APIs.

Postman GET query images for the two services running and communicating successfully on two ports `8100` and `8000` are [here](https://github.com/absnaik810/Microservice-architecture-using-Spring-Boot/blob/master/Postman%20ToDo%20Service%20Port%208100.png) and [here](https://github.com/absnaik810/Microservice-architecture-using-Spring-Boot/blob/master/Postman%20Users%20Service%20Port%208000.png).

References:
* [Microservices architecture for a ToDo application](https://developers.redhat.com/blog/2016/09/15/writing-microservices-an-example-through-a-simple-to-do-application/) by RedHat, Inc.
* [Netflix Feign](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)
* [Netflix Ribbon](https://github.com/Netflix/ribbon/wiki)
* [Netflix Eureka](https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance)
* [Building a Spring Boot REST API](https://medium.com/@salisuwy/building-a-spring-boot-rest-api-a-php-developers-view-part-i-6add2e794646) blog
* [Microservices architecture](http://www.springboottutorial.com/creating-microservices-with-spring-boot-part-1-getting-started) tutorial
* [Postman tutorial](https://www.getpostman.com/docs/v6/)
