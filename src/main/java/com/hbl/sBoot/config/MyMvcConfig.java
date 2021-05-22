package com.hbl.sBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//使用WebMvcConfigurerAdapter可以扩展SpringMVC功能
//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hbl").setViewName("success");
    }
    //所有的WebMvcConfigurerAdapter组件都会一起作用
    @Bean//将组件注册在容器
    public WebMvcConfigurer webMvcConfigurer(){

       WebMvcConfigurer adapter = new WebMvcConfigurer() {
           @Override
           public void addViewControllers(ViewControllerRegistry registry) {
               registry.addViewController("/").setViewName("login");
               registry.addViewController("/index.html").setViewName("login");
               registry.addViewController("/main.html").setViewName("dashboard");
           }
           //注册拦截器
          /* @Override
           public void addInterceptors(InterceptorRegistry registry) {
               registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                       .excludePathPatterns("/index.html","/","/user/login","asserts/**","/webjars/**");
           }*/
       };
       return adapter;
    }

}
