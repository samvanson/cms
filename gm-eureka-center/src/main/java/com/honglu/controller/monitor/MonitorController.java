package com.honglu.controller.monitor;

import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 	服务监控API
 * 	@author conly.wang
 * 	2018-05-18
 */
@RestController
public class MonitorController {
	
	private static org.slf4j.Logger log = LoggerFactory.getLogger(MonitorController.class);

    @RequestMapping(value = "/gmeureka/health.jsp")
    public String health(String message, Model model) {
    	log.info(" gmeureka server is health !");
        return "helloworld" ;
    }

}
