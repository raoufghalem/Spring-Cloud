# Spring-Cloud
Full working application as a Distributed system

Architecture: 

    ConfigServer
    
                Discovery
                
                         Microservices/applications
                         - All the enterprise Logic 
                         
                                                   FrontEnd OR API (they all use the same backend services)
                                                   - All Incoming traffic is load ballanced to the backend services
                                                   
                                                   

Step 1 : start the Discovery server on port 2000   ---> localhost:2000

         -all application that starts must register to the Discovery server
         
         
Step 2 : Start the configServer on port 3000  --> localhost:3000

          -this server holds all the config files of the ( microservices/applications/services )
          however you wanna call it
      
Step 3 : launch all the services ie. productService, reviewService, ( frontEnd OR  frontEndWithFeign )

          -Any starting service/application will fetch all of its configuration files from the config server
          
          
          -Then it registers to the Discovery server for availability to other downstream services

Note:

      -- Client side load ballancing is used on the frontEnd service OR API 
      
      -- Same goes for Circuit breakers to avoid network overload or cascade failure (for fault tolerance)
      
      
      
Future Additions and improvements:

      -Add a password vault for sensitive config files and password encription
      
      -Add Spring Security (Oauth2, JWT ...)
      
      -Add Some metrics and Logging-tracing  services
      
      
      
Long Term:

      -Use SpringBoot 2.0
      
      -Make a parallel project for Reactive programming
      
      -Use messaging for Logging and metrics
      
