package com.nakhak.test;

import com.nakhak.graph.GNodeExtended;
import com.nakhak.graph.GNodeImpl;

public abstract class BaseTestClassForGraphProblems {

    protected GNodeExtended simpleTree;
    protected GNodeExtended twoTierTreeTwoBranches;
    protected GNodeExtended threeTierWithTwoBranches;
    protected GNodeExtended unevenTierWithMultipleBranches;

    public BaseTestClassForGraphProblems() {
        simpleTree = getSimpleTree();
        twoTierTreeTwoBranches = getTwoTierTreeTwoBranches();
        threeTierWithTwoBranches = getThreeTierWithTwoBranches();
        unevenTierWithMultipleBranches = getUnevenTierWithMultipleBranches();
    }


    public abstract Boolean SimpleTreeNoBranches();

    public abstract Boolean TwoTierTreeWithTwoBranches();

    public abstract Boolean ThreeTierWithTwoBranches();

    public abstract Boolean UnevenTierWithMultipleBranches();


    protected GNodeExtended getSimpleTree() {
        GNodeExtended node = new GNodeImpl("A");
        GNodeExtended nodeB = node.addChild("B");
        nodeB.addChild("C");
        return node;
    }

    protected GNodeExtended getTwoTierTreeTwoBranches() {
        GNodeExtended node = new GNodeImpl("A");
        node.addChild("B");
        node.addChild("C");
        return node;
    }

    protected GNodeExtended getThreeTierWithTwoBranches() {
        GNodeExtended node = new GNodeImpl("A");
        GNodeExtended nodeB = node.addChild("B");
        GNodeExtended nodeC = node.addChild("C");
        nodeB.addChildren(new String[]{"B1", "B2"});
        nodeC.addChildren(new String[]{"C1", "C2"});
        return node;
    }

    protected GNodeExtended getUnevenTierWithMultipleBranches() {
        GNodeExtended node = new GNodeImpl("A");
        GNodeExtended nodeB = node.addChild("B");
        GNodeExtended nodeC = node.addChild("C");
        nodeB.addChildren(new String[]{"B1", "B2"});

        return node;
    }
}
