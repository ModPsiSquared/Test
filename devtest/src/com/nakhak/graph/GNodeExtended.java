package com.nakhak.graph;


import com.nakhak.definition.GNode;

public interface GNodeExtended extends GNode {
    GNodeExtended addChild(GNode child);

    GNodeExtended addChild(String child);

    boolean addChildren(String[] children);

}
