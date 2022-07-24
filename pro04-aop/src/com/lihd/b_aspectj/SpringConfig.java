package com.lihd.b_aspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ：葬花吟留别1851053336@qq.com
 * @description：TODO
 * @date ：2022/4/12 21:20
 */
@Configuration
@ComponentScan(basePackages = {"com.lihd"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
