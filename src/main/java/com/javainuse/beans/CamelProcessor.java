package com.javainuse.beans;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CamelProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		// Get input from exchange
		String msg = exchange.getIn().getBody(String.class);
		System.out.println("Sleeping ...");
		Thread.sleep(180000);
		// set output in exchange
		exchange.getOut().setBody("Hello World " + msg);
	}

}