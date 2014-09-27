/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccb.trantools.model.impl;

import com.ccb.trantools.model.RDNode;
import com.ccb.trantools.model.RDParent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author liangjp
 */
public abstract class AbstractRDParent extends AbstractRDNode implements RDParent {
	
	private List<RDNode> children = new CopyOnWriteArrayList<RDNode>(); 
	
	public AbstractRDParent(String name) {
		super(name);
	}
	
	public AbstractRDParent(String name, RDParent parent){
		super(name);
		this.parent = parent;
	}

	@Override
	public void addChild(RDNode child) {
		children.add(child);
		child.setParent(this);
	}

	@Override
	public void addChildren(List<RDNode> children) {
		for(RDNode node : children){
			addChild(node);
		}
	}

	@Override
	public void removeChild(RDNode child) {
		children.remove(child);
		child.setParent(null);
	}

	@Override
	public void removeAllChildren(List<RDNode> children) {
		for(RDNode node : children){
			removeChild(node);
		}
	}

	@Override
	public List<RDNode> getChildren() {
		return this.children;
	}

	@Override
	public boolean hasChildren() {
		return this.children.size() > 0;
	}

}
