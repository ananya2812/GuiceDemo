package com.ie.guicedemo.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.ie.guicedemo.annotations.Circle;
import com.ie.guicedemo.annotations.Square;
import com.ie.guicedemo.services.DrawCircle;
import com.ie.guicedemo.services.DrawShape;
import com.ie.guicedemo.services.DrawSquare;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
		bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class);
//		bind(String.class).annotatedWith(ColorValue.class).toInstance("Blue");
//		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(7);
	}
}
