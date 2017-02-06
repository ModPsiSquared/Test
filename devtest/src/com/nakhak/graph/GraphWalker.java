package com.nakhak.graph;

import com.nakhak.definition.*;


import java.util.ArrayList;


public class GraphWalker implements WalkGraph, Paths {

    public ArrayList walkGraph(GNode node){

        ArrayList<String> retVal = new ArrayList<>();

        walkGraph(node, retVal);

        return retVal;

    }

    protected void walkGraph(GNode node, ArrayList nodeListing){


        if (!nodeListing.contains(node))
            nodeListing.add(node);

        for (GNode child:
             node.getChildren()) {
            walkGraph(child,nodeListing);

        }

    }

    public ArrayList paths(GNode node){
        ArrayList<String> retVal = new ArrayList<>();
        StringBuilder path = new StringBuilder();

        paths(node,path,retVal);

        return retVal;

    }

    protected void paths(GNode node, StringBuilder currentPath, ArrayList<String> terminalPaths)
    {
        currentPath.append( node.getName());

        GNode[] children = node.getChildren();

        if (children.length == 0){
            terminalPaths.add(currentPath.toString());
            return;
        }
        else {
            currentPath.append(" ");
        }

        for (GNode child:
                children){
            paths(child, new StringBuilder(currentPath.toString()), terminalPaths);
        }
    }
}
