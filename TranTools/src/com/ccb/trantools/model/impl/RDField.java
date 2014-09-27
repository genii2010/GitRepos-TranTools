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
public class RDField extends AbstractRDNode {

	public RDField(String name) {
		super(name);	
	}
	
	public RDField(String name, String dataLength, String dataType, String required){
		super(name);
		this.dataLength = dataLength;
		this.dataType = dataType;
		this.required = required;
	}
	
	public void setDataLength(String dataLength){
		this.dataLength = dataLength;
	}
	
	public void setDataType(String dataType){
		this.dataType = dataType;
	}
	
	public void setRequired(String required){
		this.required = required;
	}

}
