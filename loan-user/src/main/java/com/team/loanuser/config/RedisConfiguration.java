package com.team.loanuser.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class RedisConfiguration {

    /**
     * 注册 RedisTemplate
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
//        注册到系统中去
        redisTemplate.setConnectionFactory(factory);
        //  1.2.36  低版本
        GenericFastJsonRedisSerializer  serializer = new GenericFastJsonRedisSerializer();
        redisTemplate.setValueSerializer(serializer);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }

    /**
     * 注册 hash
     * @param redisTemplate
     * @return
     */
    @Bean
    public HashOperations<String,String,Object> hashOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForHash();
    }

    /**
     * 注册 list
     * @param redisTemplate
     * @return
     */
    @Bean
    public ListOperations<String,Object> listOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForList();
    }

    /**
     * 注册 value
     * @param redisTemplate
     * @return
     */
    @Bean
    public ValueOperations<String,Object> valueOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForValue();
    }

    /**
     * 注册 set
     * @param redisTemplate
     * @return
     */
    @Bean
    public SetOperations<String,Object> setOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForSet();
    }

    /**
     * 注册 zSet
     * @param redisTemplate
     * @return
     */
    @Bean
    public ZSetOperations<String,Object> zSetOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForZSet();
    }

    /**
     * 注册 geo
     * @param redisTemplate
     * @return
     */
    @Bean
    public GeoOperations<String,Object> geoOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForGeo();
    }

    /**
     * 注册 cluster
     * @param redisTemplate
     * @return
     */
    @Bean
    public ClusterOperations<String,Object> clusterOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForCluster();
    }

    /**
     * 注册 hyperLogLog
     * @param redisTemplate
     * @return
     */
    @Bean
    public HyperLogLogOperations<String,Object> hyperLogLogOperations(RedisTemplate<String,Object> redisTemplate){
        return redisTemplate.opsForHyperLogLog();
    }
}
