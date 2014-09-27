/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccb.trantools.model.impl;

/**
 *
 * @author liangjp
 */
public class RDArray extends AbstractRDParent {

	public RDArray(String name) {
		super(name);
	}
	
	public void setRequired(String required){
		this.required = required;
	}

}
