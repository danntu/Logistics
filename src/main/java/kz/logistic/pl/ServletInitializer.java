package kz.logistic.pl;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    private int s;
    private int udalit;
    @Override


    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PlApplication.class);
    }

}
