package server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import server.entity.Card;
import server.repository.CardRepository;
import server.service.CardService;
import server.service.CardServiceJPA;
import server.service.CardServiceRest;
import server.service.CardServiceRestClient;

@SpringBootApplication
@Configuration
@EntityScan(basePackages = "server.entity")
public class AppServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppServer.class).run(args);
    }

    @Bean
    public RestTemplate restTemplate() {return new RestTemplate();}


    @Bean
    public CardService cardService() {
        return new CardServiceRestClient();
    }



}
