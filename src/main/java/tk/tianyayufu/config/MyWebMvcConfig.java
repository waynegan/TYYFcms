package tk.tianyayufu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.inject.Inject;


@Configuration
public class MyWebMvcConfig {
    @Inject
    private Environment env;

    @Bean
    public WebMvcConfigurerAdapter forwardToIndex() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/admin").setViewName(
                    "forward:/admin.html");
                registry.addViewController("/rest").setViewName(
                    "forward:/swagger-ui/index.html");
                registry.addViewController("/restful").setViewName(
                    "forward:/restful.html");
            }

        };
    }

}
