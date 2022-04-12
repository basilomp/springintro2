package lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Configuration
@ComponentScan("lesson2")
public class AppConfig {

    @Bean
    public FileOutputStream fileOutputStream() throws FileNotFoundException {
        return new FileOutputStream("1.txt");
    }
}
