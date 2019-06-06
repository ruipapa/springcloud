package Hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 *  * Created by pr on 2019年05月17日
 *  
 */
@EnableHystrix
@EnableHystrixDashboard
@SpringCloudApplication
public class ServiceHyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHyApplication.class, args);
    }
}
