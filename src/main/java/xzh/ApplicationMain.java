package xzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 向振华
 * @date 2018/10/23 16:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
