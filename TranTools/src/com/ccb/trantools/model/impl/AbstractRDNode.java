/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccb.trantools.model.impl;

import com.ccb.trantools.model.RDNode;
import com.ccb.trantools.model.RDParent;

/**
 *
 * @author liangjp
 */
public abstract class AbstractRDNode implements RDNode {
	
	protected String name;
	protected String dataType;
	protected String dataLength;
	protected String required;
	protected int dotNum=0;
		
	protected RDParent parent;
	
	public AbstractRDNode(String name){
		this.name = name;
		this.dataType = "";
		this.dataLength = "";
		this.required = "";
		this.dotNum=0;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setParent(RDParent parent) {
		this.parent = parent;
	}

	@Override
	public RDParent getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public String getDataType() {
		// TODO Auto-generated method stub
		return dataType;
	}

	@Override
	public String getDataLength() {
		// TODO Auto-generated method stub
		return dataLength;
	}

	@Override
	public String getRequired() {
		// TODO Auto-generated method stub
		return required;
	}

	public int getDotNum() {
		return dotNum;
	}

	public void setDotNum(int dotNum) {
		this.dotNum = dotNum;
	}
	
}
