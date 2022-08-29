package com.example.auth

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore


@Configuration
@EnableAuthorizationServer
class AuthorizationConfigServer(private val authenticationManager:AuthenticationManager):AuthorizationServerConfigurerAdapter()  {

    override fun configure(security: AuthorizationServerSecurityConfigurer?) {
        security?.tokenKeyAccess("permitAll()")
            ?.checkTokenAccess("isAuthenticated()")
            ?.passwordEncoder(BCryptPasswordEncoder())
    }

    override fun configure(clients: ClientDetailsServiceConfigurer?) {
        clients?.inMemory()
            ?.withClient("web")?.secret(BCryptPasswordEncoder().encode("admin"))
            ?.authorizedGrantTypes("password","refresh_token")
            ?.scopes("test")
    }

    override fun configure(endpoints: AuthorizationServerEndpointsConfigurer?) {
        endpoints?.tokenStore(tokenStore())
            ?.authenticationManager(authenticationManager)
    }

    @Bean
    fun tokenStore()=InMemoryTokenStore()

}

@Configuration
@EnableWebSecurity
class WebServerConfig(private val userDetailsService: CustomUserDetailsService): WebSecurityConfigurerAdapter(){
    @Bean
    override fun authenticationManagerBean(): AuthenticationManager =super.authenticationManagerBean()

    override fun configure(http: HttpSecurity?) {
        http?.sessionManagement()
            ?.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            ?.and()
            ?.csrf()?.disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.userDetailsService(userDetailsService)?.passwordEncoder(passwordEncoder())
    }

    @Bean
    fun passwordEncoder()=BCryptPasswordEncoder()


}



