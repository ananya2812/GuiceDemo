package com.ie.guicedemo.module;

import com.google.inject.AbstractModule;
import com.ie.guicedemo.services.DrawShape;
import com.ie.guicedemo.services.DrawSquare;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
	}
}
