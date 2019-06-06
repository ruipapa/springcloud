package client.schedualservice;

import org.springframework.stereotype.Component;

/**
 *  * Created by pr on 2019年03月28日
 *  
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    public String sayHiFromClientOne(String name) {
        return "sorry "+name+" ERROR!";
    }
}
