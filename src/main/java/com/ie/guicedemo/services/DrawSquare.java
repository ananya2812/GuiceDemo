package com.ie.guicedemo.services;

public class DrawSquare implements DrawShape {

	private String color;
	private Integer edge;

	public DrawSquare(String color, Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

	public void draw() {
		System.out.println("Draw Square of Color: " + color + " Edge: " + edge);
	}

//	@Inject
//	public DrawSquare(@ColorValue String color,@EdgeValue Integer edge) {
//		super();
//		this.color = color;
//		this.edge = edge;
//	}

//	public void draw() {
//		System.out.println("Draw Square ");
//	}

}
