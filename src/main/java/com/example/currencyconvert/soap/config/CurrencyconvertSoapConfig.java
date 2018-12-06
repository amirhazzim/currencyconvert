package com.example.currencyconvert.soap.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.currencyconvert.soap.CurrencyconvertService;

@Configuration
public class CurrencyconvertSoapConfig {
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endPoint() {
		Endpoint endpointImpl = new EndpointImpl(bus, new CurrencyconvertService());
		endpointImpl.publish("/service");
		return endpointImpl;
	}
}
