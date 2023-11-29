package com.Level1TenPrograms;

public class SubsequenceOfTwoStrings {

	class SolutionNode {

	    String direction;

	    int value;

	    

	    public SolutionNode(String direction, int value) {

	        this.direction = direction;

	        this.value = value;

	    }

	}


	class Solution {

	    public String solution(String s1, String s2) {

	        if (s1.length() == 0 || s2.length() == 0) {

	            return "";

	        }

	        // building the table with the extra row and column

	        SolutionNode[][] lcs = new SolutionNode[s1.length()+1][s2.length()+1];

	        for (int i = 0; i <= s1.length(); i++) {

	            for (int j = 0; j <= s2.length(); j++) {

	                lcs[i][j] = new SolutionNode("sink", 0);

	            }

	        }

	        // skip first row; it is supposed to be all zeros anyway

	        for (int i = 1; i <= s1.length(); i++) {

	            // skip first column; it is supposed to be all zeros anyway

	            for (int j = 1; j <= s2.length(); j++) {

	                if (s1.charAt(i-1) == s2.charAt(j-1)) {

	                    lcs[i][j].value = lcs[i-1][j-1].value + 1;

	                    lcs[i][j].direction = "up-left";

	                } else if (lcs[i][j-1].value == lcs[i-1][j].value) {

	                    lcs[i][j].direction = "both";

	                    lcs[i][j].value = lcs[i][j-1].value;

	                } else if (lcs[i][j-1].value > lcs[i-1][j].value) {

	                    lcs[i][j].direction = "left";

	                    lcs[i][j].value = lcs[i][j-1].value;

	                } else {

	                    lcs[i][j].direction = "up";

	                    lcs[i][j].value = lcs[i-1][j].value;

	                }

	            }

	        }

	        // The table is built; now to traceback

	        int i = s1.length();

	        int j = s2.length();

	        SolutionNode node = lcs[i][j];

	        int val = node.value;

	        StringBuilder sb = new StringBuilder();

	        while (val > 0) {

	            // Could instead go 'left' on 'both'

	            if (node.direction.equals("up") || node.direction.equals("both")) {

	                i--;

	            } else if (node.direction.equals("left")) {

	                j--;

	            } else {

	                i--;

	                j--;

	                // need to prepend since this constructs the lcs in reverse

	                sb.insert(0, s1.charAt(i));

	            }

	            node = lcs[i][j];

	            val = node.value;

	        }

	        return sb.toString();

	    }

	}
}
