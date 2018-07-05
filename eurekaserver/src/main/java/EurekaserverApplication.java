import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
www
/**
 * @author sunxueyan-ds
 * @Title: EurekaserverApplication
 * @ProjectName eurekaserver
 * @Description: TODO
 * @date 2018/7/4 14:23
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaserverApplication.class,args);
    }
}
