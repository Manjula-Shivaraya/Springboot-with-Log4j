package com.psl.Log4j.Controller;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
private static final Logger log = Logger.getLogger(IndexController.class);

	{
      BasicConfigurator.configure(); //To make use of log4j, configuration file is required. Instead of creating a separate configuration file, make use of BasicConfigurator inside the instance initializer block so that it creates basic configuration to use logger.
	} //Instead of basicconfigurator,Actually a log4j properties file can be created. That file is considered to be a configuration.
	
	@GetMapping("/")
	public String index() {
		log.debug("Loading index page...");
		log.info("Info level.");
		log.warn("Warn level");
		log.error("Error level");
		log.trace("Trace level");
		log.fatal("Fatal level");
		log.debug("Exit");
		return "index";
	}
}
