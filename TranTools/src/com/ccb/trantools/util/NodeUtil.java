/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccb.trantools.util;

import com.ccb.trantools.model.RDNode;
import com.ccb.trantools.model.impl.RDElement;

/**
 *
 * @author liangjp
 */
public class NodeUtil {
	
	public static RDNode findRDNodeForName(String name, RDNode node){
		if(node.getName().equalsIgnoreCase(name)){
			return node;
		}else if(node instanceof RDElement){
			RDElement rdEle = (RDElement)node;
			for(RDNode rdNode : rdEle.getChildren()){
				RDNode finded = findRDNodeForName(name, rdNode);
				if(finded != null){
					return finded;
				}
			}
		}
		
		return null;
	}
	
        public static void main(String[] args){
            System.out.println("aa");
        }
}
