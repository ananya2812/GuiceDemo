package com.ie.guicedemo.requests;

import com.google.inject.Inject;
import com.ie.guicedemo.annotations.Square;
import com.ie.guicedemo.services.DrawShape;

public class SquareRequest {

	@Inject
	@Square
	DrawShape shape;

	public void makeRequest() {
		shape.draw();
	}

}
