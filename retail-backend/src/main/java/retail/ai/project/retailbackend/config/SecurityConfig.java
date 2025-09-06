package retail.ai.project.retailbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                // 1. Desactivar CSRF (Cross-Site Request Forgery)
            // Es una buena práctica para APIs REST que no usan cookies para la sesión.
            .csrf(csrf -> csrf.disable())

            // 2. Definir las reglas de autorización
            .authorizeHttpRequests(auth -> {
                // Por AHORA, para facilitar el desarrollo, permitiremos todas las peticiones.
                // MÁS ADELANTE, aquí definiremos reglas específicas.
                // Ejemplo: auth.requestMatchers("/api/v1/admin/**").hasRole("ADMIN")
                auth.anyRequest().permitAll();
            })

            // 3. Habilitar la autenticación básica (Basic Auth) para seguir probando en Postman.
            // Cuando implementemos JWT, esto se reemplazará.
            .httpBasic(withDefaults());

        return httpSecurity.build();
    }
}
