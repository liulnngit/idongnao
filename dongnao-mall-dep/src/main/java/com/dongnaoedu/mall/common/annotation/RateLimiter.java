package com.dongnaoedu.mall.common.annotation;

/**
 * 限流注解
 * @author allen
 */
@Target(ElementType.METHOD)//作用于方法上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimiter {

    int limit() default 5;
    int timeout() default 1000;
}