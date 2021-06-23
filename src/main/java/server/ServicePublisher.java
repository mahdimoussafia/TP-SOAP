package server;

import javax.xml.ws.Endpoint;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import webservices.ProductsManagerImpl;

public class ServicePublisher {

	public static Logger logger = (Logger) LoggerFactory.getLogger(ServicePublisher.class);
	public static void main(String[] args) {
		
		logger.info("Starting service");
		
		Endpoint.publish("http://localhost:2031/webservices/ProductsManager", new ProductsManagerImpl());
		
		logger.info("Server started");
	}
}