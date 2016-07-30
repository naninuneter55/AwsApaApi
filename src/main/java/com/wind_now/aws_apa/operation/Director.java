/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.aws_apa.operation;

import java.util.List;

/**
 *
 * @author ono
 */
public class Director {
	private final Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	@SuppressWarnings("unchecked")
	public <T, S> Object construct(T arg, Class<S> clazz) {
		Object result = null;
		if (arg instanceof List<?>) {
			List<String> titles = (List<String>) arg;
			result = builder.invoke(titles);
		}
		return result;
	}

}
