package com.shopping.common.config;

import com.google.common.base.Predicate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by Moussa on 04/11/17.
 * This class configure how swagger work, wich path it will expose
 */
@Configuration
@EnableSwagger2
@ConfigurationProperties(prefix = "swagger")
@PropertySource("classpath:application.yml")
public class SwaggerConfig {

    /**
     * Group name of swagger
     */
    final static String SWAGGER_GROUP_NAME = "Shopping";

    /**
     * List of path that swagger will expose
     */
    private List<String> path;

    /**
     * Implementation of swagger
     *
     * @return
     */
    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SPRING_WEB)
                .groupName("Shopping")
                .apiInfo(apiInfo())
                .select()
                .paths(postPaths())
                .build();
    }

    /**
     * Return the predicate built with all path that swagger will expose
     *
     * @return
     */
    private Predicate<String> postPaths() {
        return or(getPath().stream().map(p -> regex(p)).collect(Collectors.toList()));
    }

    /**
     * Document the API
     *
     * @return
     */
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("no")
                .contact("Moussa BALDE")
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
                .version("2.0")
                .build();

        return apiInfo;
    }

    /**
     * Method that get list of path that swagger will expose
     */
    public List<String> getPath() {
        return this.path;
    }

    /**
     * Method that set list of path that swagger will expose
     */
    public void setPath(List<String> path) {
        this.path = path;
    }
}
