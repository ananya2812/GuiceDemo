package com.ie.guicedemo.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.ie.guicedemo.annotations.Circle;
import com.ie.guicedemo.annotations.CircleColorValue;
import com.ie.guicedemo.annotations.EdgeValue;
import com.ie.guicedemo.annotations.RadiusValue;
import com.ie.guicedemo.annotations.Square;
import com.ie.guicedemo.annotations.SquareColorValue;
import com.ie.guicedemo.services.DrawCircle;
import com.ie.guicedemo.services.DrawShape;
import com.ie.guicedemo.services.DrawSquare;

public class AppModule extends AbstractModule {

	@Provides
	@Singleton
	@Square
	DrawShape provideDrawSquare(@SquareColorValue String color, @EdgeValue Integer edge) {
		return new DrawSquare(color, edge);
	}

	@Provides
	@Singleton
	@Circle
	DrawShape provideDrawCircle(@CircleColorValue String color, @RadiusValue Integer radius) {
		return new DrawCircle(color, radius);
	}

	@Override
	protected void configure() {
		bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Violet");
		bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Green");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(20);
		bind(Integer.class).annotatedWith(RadiusValue.class).toInstance(10);
//		bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
//		bind(DrawShape.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class);
//		bind(String.class).annotatedWith(ColorValue.class).toInstance("Blue");
//		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(7);
	}

}
