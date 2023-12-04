package br.aluno.ifsp.LDC.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import br.aluno.ifsp.LDC.security.service.MyUserDetailsServices;
import br.aluno.ifsp.LDC.security.service.MyUserDetails;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf().disable()
            .authorizeHttpRequests(
                authorize -> authorize
                .requestMatchers(HttpMethod.POST, "/ldc/criarCedula").permitAll()
                .requestMatchers(HttpMethod.POST, "/ldc/criarMoeda").permitAll())
                .authorizeHttpRequests(
                authorize -> authorize
                .requestMatchers(HttpMethod.GET, "/ldc/mostrarMoeda/{idMoeda}").authenticated()
                .requestMatchers(HttpMethod.PUT, "/ldc/editarMoeda/{idMoeda}").authenticated()
                .requestMatchers(HttpMethod.DELETE, "/ldc/deletarMoeda/{idMoeda}").authenticated()
                .requestMatchers(HttpMethod.DELETE, "/ldc/deletarCedula/{idCedula}").authenticated())
            .httpBasic(Customizer.withDefaults());
            
                return http.build();
 }
  
}