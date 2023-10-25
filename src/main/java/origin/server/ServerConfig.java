package origin.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import origin.services.AnnouncementService;
import origin.services.UserService;

@Configuration
public class ServerConfig {

    @Bean
    public UserService getUserService(){
        return new UserService();
    }

    @Bean
    public AnnouncementService getProductService() {
        return new AnnouncementService();
    }

}
