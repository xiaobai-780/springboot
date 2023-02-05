package cn.azx.service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class IpCountService {

    private Map<String,Integer> ipCountMap = new HashMap<>();
    @Autowired
    //当前request对象的注入工作由使用当前starter的工程提供自动装配
    private HttpServletRequest httpServletRequest;

    public void count(){
        System.out.println("-------------");
        //每次调用当前操作，就记录当前访问的IP，然后累加访问次数

        //1.获取当前操作的IP地址
        String ip = httpServletRequest.getRemoteAddr();
        //2.根据IP地址从Map取值，并递增
        Integer count = ipCountMap.get(ip);
        if (count == null) {
            ipCountMap.put(ip, 1);
        }else {
            ipCountMap.put(ip,count + 1);
        }

    }
}
