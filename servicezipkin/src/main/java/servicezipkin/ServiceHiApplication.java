package servicezipkin;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *  * Created by pr on 2019年04月11日
 *  
 */
@SpringBootApplication
@RestController
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class,args);
    }

    private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    @RequestMapping(value = "/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }

    @RequestMapping("/info")
    public String info(){

        LOG.log(Level.INFO,"calling trace service-hi");
        return "I, Qin Shihuang, make money";
    }


    @Bean
    public Sampler defaultSampler(){

        return Sampler.ALWAYS_SAMPLE;
    }
}
