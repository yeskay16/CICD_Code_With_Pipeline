import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo("API", "MyAPI", "1.0", "tos", new Contact("Pankaj", "xyz.com", "abc@gmail.com"), "apache", "apache 2.0"))
                .produces(new HashSet<String>(Arrays.asList("application/json", "application/xml")))
                .consumes(new HashSet<String>(Arrays.asList("application/json", "application/xml")));
    }
}
