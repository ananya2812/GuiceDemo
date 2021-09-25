package com.ie.guicedemo.main;

import com.ie.guicedemo.requests.SquareRequest;
import com.ie.guicedemo.services.DrawShape;
import com.ie.guicedemo.services.DrawSquare;

public class DemoApplication {

	private static final String SQUARE_REQ = "SQUARE";

	public static void main(String[] args) {
		sendRequest(SQUARE_REQ);
	}

	private static void sendRequest(String requestType) {
		if (requestType.equals(SQUARE_REQ)) {
//			DrawShape shape = new DrawSquare("Red",10);
//			SquareRequest req = new SquareRequest(shape);
//			req.makeRequest();
		}
	}
}
