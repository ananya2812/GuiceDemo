package com.ie.guicedemo.requests;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.ie.guicedemo.services.DrawShape;

public class CircleRequest {

	@Inject
	@Named("Circle")
	DrawShape shape;

	public void makeRequest() {
		shape.draw();
	}

}
