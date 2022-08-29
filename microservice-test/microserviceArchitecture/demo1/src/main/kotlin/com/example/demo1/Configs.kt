package com.example.demo1

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.security.oauth2.resource.DefaultUserInfoRestTemplateFactory
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateFactory
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.openfeign.security.OAuth2FeignRequestInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.client.OAuth2ClientContext
import org.springframework.security.oauth2.client.OAuth2RestTemplate
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

@Configuration
@EnableResourceServer
class ResourceServerConfig: ResourceServerConfigurerAdapter() {

    @Bean
    fun feignInterceptor(@Qualifier("oauth2ClientContext") contex:OAuth2ClientContext, detail:OAuth2ProtectedResourceDetails) =OAuth2FeignRequestInterceptor(contex,detail)

    @Bean
    @LoadBalanced
    fun oauth2RestTemplate( userInfoRestTemplateFactory: UserInfoRestTemplateFactory):OAuth2RestTemplate{
        return userInfoRestTemplateFactory.userInfoRestTemplate
    }
}