# spring-cloud-zuul-eureka-hystrix-example


**Applications**

- zuul-service - API Gateway/Edge Service which is registered with Eureka and routes the requests to Client and Server using Eureka Service. Port : **8079**
- eureka-service - The Eureka service which is the Service Registry - http://localhost:8070/
- user-service - The Service which is going to give data to the Client. 
- user-client - The Service which is going to get data from user-service via the Discovery Service from the Service Registry (eureka-service). http://localhost:8079/api/client/rest/user/client

Access User information using
http://localhost:8079/api/client/rest/user/client
