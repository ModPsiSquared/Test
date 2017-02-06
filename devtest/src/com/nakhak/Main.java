package com.nakhak;

import com.nakhak.test.TestForProblemOne;
import com.nakhak.test.TestForProblemTwo;


public class Main {

    public static void main(String[] args) throws Exception {


        //Problem 1 tests
        TestForProblemOne testForProblemOne = new TestForProblemOne();
        if (!testForProblemOne.SimpleTreeNoBranches())
            throw new Exception("SimpleTreeNoBranches Failed");

        if (!testForProblemOne.TwoTierTreeWithTwoBranches())
            throw new Exception("TwoTierTreeWithTwoBranches Failed");

        if (!testForProblemOne.ThreeTierWithTwoBranches())
            throw new Exception("DeepTreeWithMultipleBranches Failed");

        if (!testForProblemOne.UnevenTierWithMultipleBranches())
            throw new Exception("UnevenTierWithMultipleBranches Failed");

        //Problem 2 tests
        TestForProblemTwo testForProblemTwo = new TestForProblemTwo();
        if (!testForProblemTwo.SimpleTreeNoBranches())
            throw new Exception("SimpleTreeNoBranches Failed");

        if (!testForProblemTwo.TwoTierTreeWithTwoBranches())
            throw new Exception("TwoTierTreeWithTwoBranches Failed");

        if (!testForProblemTwo.ThreeTierWithTwoBranches())
            throw new Exception("ThreeTierWithTwoBranches Failed");

        if (!testForProblemTwo.UnevenTierWithMultipleBranches())
            throw new Exception("UnevenTierWithMultipleBranches Failed");


    }

}
