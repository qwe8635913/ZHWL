package com.RuiLing.TMS.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.RuiLing.component.commons.config.CommonResourceServerConfig;

/**
 * 系统管理OAuth2资源服务器
 * 
 * @版权所有 湖南瑞菱科技有限公司
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends CommonResourceServerConfig {

	@Autowired
	public ResourceServerConfig(ResourceServerProperties sso) {
		super(sso);
	}

	/**
	 * 配置拦截路径的安全规则
	 */
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/actuator/**", "/swagger-ui/**", "/swagger-ui.html/**", "/webjars/springfox-swagger-ui/**",
				"/swagger-resources/**", "/v2/api-docs/**", "/druid/**","/map/**").permitAll().anyRequest().authenticated();
	}

	/**
	 * 实例化会话监听
	 * 
	 * @return
	 */
	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();
	}

}
