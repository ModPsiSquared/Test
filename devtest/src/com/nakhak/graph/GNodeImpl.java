package com.nakhak.graph;

import com.nakhak.definition.GNode;

import java.util.ArrayList;

public class GNodeImpl implements GNodeExtended {

    public GNodeImpl(String name) {
        this.name = name;
    }

    protected String name;

    protected ArrayList<GNode> children = new ArrayList();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GNode[] getChildren() {
        return children.toArray(new GNode[0]);
    }

    @Override
    public GNodeExtended addChild(GNode child) {
        children.add(child);
        return (GNodeExtended) child;
    }

    @Override
    public GNodeExtended addChild(String child) {
        return addChild(new GNodeImpl(child));
    }

    @Override
    public boolean addChildren(String[] children) {

        for (String child :
                children
                ) {
            if (addChild(child) == null)
                return false;

        }
        return true;
    }

}
