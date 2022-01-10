package com.gec.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 替代配置文件
@ComponentScan(
        basePackages = {"com.gec.spring5.*"}
)
public class SpringConfig {
}
