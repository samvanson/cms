package com.honglu.listener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.InstanceInfo;

/**
 * Eureka 事件监听
 *
 * @author conly.wang
 * @create 2018-07-23 17:32:00
 **/
@Component
public class EurekaStateChangeListener {
	
	private static Logger log = LoggerFactory.getLogger(EurekaStateChangeListener.class);

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
    	log.info(event.getServerId() + "\t" + event.getAppName() + " 服务下线");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info(instanceInfo.getAppName() + "已注册成功");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
    	log.info(event.getInstanceInfo().getInstanceId() + "\t" + event.getServerId() + "\t" + event.getAppName() + " 服务进行续约成功");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
    	log.info("Eureka Server 启动中...");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
    	log.info("Eureka Server 已启动");
    }
    
}