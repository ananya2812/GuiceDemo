package com.ie.guicedemo.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ie.guicedemo.module.AppModule;
import com.ie.guicedemo.requests.SquareRequest;

public class GuiceDemoApplication {

	private static final String SQUARE_REQ = "SQUARE";

	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);
	}

	private static void sendRequest(String requestType) {
		if (requestType.equals(SQUARE_REQ)) {
			Injector injector = Guice.createInjector(new AppModule());
			//DrawShape shape = injector.getInstance(DrawShape.class);
			SquareRequest req = injector.getInstance(SquareRequest.class);
			req.makeRequest();
		}
	}
}
