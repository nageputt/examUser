package com.nikhil.user.UserDetails.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import com.nikhil.user.UserDetails.UserConstants;

/**
 * WebMvcConfig class is used to configure view resolver
 * 
 * @author NIKHIL
 * @since 28-04-2021
 *
 */
@Configuration
@ComponentScan("com.user")
public class WebMvcConfig {
	
	/**
	 * templateResolver method is used for loading templates located on the class path
	 * @return {@link ClassLoaderTemplateResolver}
	 */
	@Bean
    @Description("Thymeleaf template resolver serving HTML 5")
    public ClassLoaderTemplateResolver templateResolver() {
		ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
        classLoaderTemplateResolver.setPrefix(UserConstants.PREFIX);
        classLoaderTemplateResolver.setCacheable(false);
        classLoaderTemplateResolver.setSuffix(UserConstants.SUFFIX);
        classLoaderTemplateResolver.setTemplateMode(UserConstants.TEMPLATE_MODE);
        classLoaderTemplateResolver.setCharacterEncoding(UserConstants.UNICODE_FORMAT);
        return classLoaderTemplateResolver;
    }


}
