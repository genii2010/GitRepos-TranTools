/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccb.trantools.model;

/**
 *
 * @author liangjp
 */
public interface RDNode {
    	public String getName();
	public void setParent(RDParent parent);
	public RDParent getParent();
	public String getDataType();
	public String getDataLength();
	public String getRequired();
	public int getDotNum();
	public void setDotNum(int dotNum);
}
