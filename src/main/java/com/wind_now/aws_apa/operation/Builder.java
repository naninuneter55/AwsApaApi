/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wind_now.aws_apa.operation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ono
 */
public abstract class Builder {
	static final Logger logger = LoggerFactory.getLogger(Builder.class);
    public abstract Object invoke(List<String> keywords);
}
