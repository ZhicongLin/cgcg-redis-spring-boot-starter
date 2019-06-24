package org.cgcg.redis.core.annotation;

import org.cgcg.redis.core.mybatis.CgBeanHolder;
import org.cgcg.redis.core.entity.RedisHelper;
import org.cgcg.redis.core.RedisAspect;
import org.cgcg.redis.core.RedisManager;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({RedisManager.class, RedisAspect.class, RedisHelper.class, CgBeanHolder.class})
public @interface EnableCgCgRedis {

    String value() default "";
}
