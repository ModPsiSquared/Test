package com.nakhak.test;


import com.nakhak.graph.GNodeExtended;
import com.nakhak.graph.GraphWalker;

import java.util.ArrayList;

public class TestForProblemOne extends BaseTestClassForGraphProblems {

    public Boolean SimpleTreeNoBranches() {

        GraphWalker gw = new GraphWalker();
        ArrayList<GNodeExtended> a = gw.walkGraph(simpleTree);
        return Print(a).compareTo("A\nB\nC\n") == 0;
    }

    public Boolean TwoTierTreeWithTwoBranches() {

        GraphWalker gw = new GraphWalker();
        ArrayList<GNodeExtended> a = gw.walkGraph(twoTierTreeTwoBranches);
        return Print(a).compareTo("A\nB\nC\n") == 0;
    }

    @Override
    public Boolean ThreeTierWithTwoBranches() {

        GraphWalker gw = new GraphWalker();
        ArrayList<GNodeExtended> a = gw.walkGraph(threeTierWithTwoBranches);
        return Print(a).compareTo("A\nB\nB1\nB2\nC\nC1\nC2\n") == 0;
    }

    @Override
    public Boolean UnevenTierWithMultipleBranches() {

        GraphWalker gw = new GraphWalker();
        ArrayList<GNodeExtended> a = gw.walkGraph(unevenTierWithMultipleBranches);
        return Print(a).compareTo("A\nB\nB1\nB2\nC\n") == 0;
    }


    public String Print(ArrayList<GNodeExtended> nodes) {

        StringBuilder sb = new StringBuilder();

        for (GNodeExtended gne :
                nodes) {
            sb.append(gne.getName());
            sb.append("\n");
        }

        return sb.toString();

    }

}


