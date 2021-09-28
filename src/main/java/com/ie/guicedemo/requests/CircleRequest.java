package com.ie.guicedemo.requests;

import com.google.inject.Inject;
import com.ie.guicedemo.annotations.Circle;
import com.ie.guicedemo.services.DrawShape;

public class CircleRequest {

	@Inject
	@Circle
	DrawShape shape;

	public void makeRequest() {
		shape.draw();
	}

}
