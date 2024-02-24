FROM openjdk:17

EXPOSE 8081
ADD target/product-service.jar product-service

ENTRYPOINT ["java", "-jar", "/product-service.jar"]