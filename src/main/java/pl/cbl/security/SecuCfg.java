package pl.cbl.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecuCfg extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        	http.csrf().disable();
        	
        	http.authorizeRequests().antMatchers("/")
        		.permitAll().anyRequest().authenticated()
        		.and().formLogin().loginPage("/loginform").permitAll()
            .loginProcessingUrl("/process").permitAll()
            .usernameParameter("user")
            .passwordParameter("password");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder authoryzation) throws Exception {
		authoryzation.inMemoryAuthentication().withUser("cbl").password("password").roles("USER"); // with this method we can create an user and set login and password for him
	}
	
	
	
}
