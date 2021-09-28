package com.ie.guicedemo.services;

public class DrawCircle implements DrawShape {

	private String color;
	private Integer radius;

	public DrawCircle(String color, Integer radius) {
		super();
		this.color = color;
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Draw Circle of Color: " + color + " Radius: " + radius);
	}

}
