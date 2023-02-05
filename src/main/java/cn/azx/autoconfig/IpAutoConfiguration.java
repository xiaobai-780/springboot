package cn.azx.autoconfig;

import cn.azx.service.IpCountService;
import org.springframework.context.annotation.Bean;

public class IpAutoConfiguration {

    @Bean
    public IpCountService ipCountService(){
        return new IpCountService();
    }
}
