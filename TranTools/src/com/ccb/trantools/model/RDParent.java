/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccb.trantools.model;

import java.util.List;

/**
 *
 * @author liangjp
 */
public interface RDParent {
    	public void addChild(RDNode node);
	public void addChildren(List<RDNode> children);
	public void removeChild(RDNode child);
	public void removeAllChildren(List<RDNode> children);
	public List<RDNode> getChildren();
	public boolean hasChildren();
}
