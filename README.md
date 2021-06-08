# SpringBootRedisCache
Simple Spring Boot Redis Cache Example

Programming Language:-Java,
Frame Work:-Spring Boot,
Build Tool:-Gradle,
MySQL is Used as Database
And For Cache , Redis Cache Server is Used.

#Gradle Dependancy For Redis
implementation 'org.springframework.boot:spring-boot-starter-data-redis'
implementation group: 'redis.clients', name: 'jedis', version: '3.6.0'

#Redis Properties in Application.properties
spring.cache.type=redis ,Which defines the Type of Cache
spring.redis.host = localhost , This defines the Redis Host
spring.redis.port = 6379 ,This Defines the Redis Port Number 
spring.cache.redis.time-to-live = 600000 ,Time For cache to live

#Redis Cache Annotations
@EnableCaching :- This Annotations is used to Enable cache in the Application.

@Cacheable(value = "", key = "") :-To Store the cache
@CacheEvict(value = "", key = "") :-To Delete the cache
@CachePut(value = "", key = "") :-To Update the Stored Cache

