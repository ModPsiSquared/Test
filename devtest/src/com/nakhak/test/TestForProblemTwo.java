package com.nakhak.test;


import com.nakhak.graph.GraphWalker;

import java.util.ArrayList;

public class TestForProblemTwo extends BaseTestClassForGraphProblems {
    @Override
    public Boolean SimpleTreeNoBranches() {

        GraphWalker gw = new GraphWalker();
        ArrayList<String> a = gw.paths(simpleTree);

        return Print(a).compareTo("( (A B C) )") == 0;
    }

    @Override
    public Boolean TwoTierTreeWithTwoBranches() {
        GraphWalker gw = new GraphWalker();
        ArrayList<String> a = gw.paths(twoTierTreeTwoBranches);

        return Print(a).compareTo("( (A B) (A C) )") == 0;
    }

    @Override
    public Boolean ThreeTierWithTwoBranches() {
        GraphWalker gw = new GraphWalker();
        ArrayList<String> a = gw.paths(threeTierWithTwoBranches);

        return Print(a).compareTo("( (A B B1) (A B B2) (A C C1) (A C C2) )") == 0;
    }

    @Override
    public Boolean UnevenTierWithMultipleBranches() {
        GraphWalker gw = new GraphWalker();
        ArrayList<String> a = gw.paths(unevenTierWithMultipleBranches);

        return Print(a).compareTo("( (A B B1) (A B B2) (A C) )") == 0;
    }


    public String Print(ArrayList<String> paths) {

        StringBuilder sb = new StringBuilder();
        sb.append("( ");

        for (String path :
                paths) {
            sb.append("(");
            sb.append(path);
            sb.append(") ");
        }

        sb.append(")");
        return sb.toString();

    }

    //todo: this test needs a multiteir too
}
