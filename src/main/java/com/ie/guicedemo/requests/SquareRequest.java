package com.ie.guicedemo.requests;

import com.google.inject.Inject;
import com.ie.guicedemo.services.DrawShape;

public class SquareRequest {

	DrawShape shape;

	@Inject
	public SquareRequest(DrawShape s) {
		shape = s;
	}

	public void makeRequest() {
		shape.draw();
	}
}
