package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
//    public static boolean hasBalancedBrackets(String str) {
//        int left_brackets = 0;
//        int right_brackets = 0;
//
//        for (char ch : str.toCharArray()) {
//            // if there's a left bracket, count it
//            if (ch == '[') {
//                left_brackets++;
//            // otherwise, if there is a right bracket
//            } else if (ch == ']') {
//                // and there are more left brackets than right brackets currently counted, count it
//                if(left_brackets - right_brackets > 0) {
//                    right_brackets++;
//                // if there are equal brackets or fewer left than right, and we are encountering a right bracket, this means a right bracket is out of order and we can return false right away
//                } else {
//                    return false;
//                }
//            } // if the character is anything other than a left or right bracket, ignore it and continue with the next character
//        }
//        // left and right brackets are equal, and there is at least one of the left brackets
//        return left_brackets == right_brackets && left_brackets > 0;
//    }


    // SOLUTION CODE plus counter for at least one bracket being present - all my tests pass
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        int counter = 0;
        for (char ch : str.toCharArray()) {
            // if there have been 0 brackets, equal brackets, or at least one left bracket
            if (brackets >= 0) {
                // and there is a left bracket, count it
                if (ch == '[') {
                    brackets++;
                    counter++;
                // or if there is a right bracket, count it (by removing from total count of brackets)
                } else if (ch == ']') {
                    brackets --;
                }
            // otherwise, there is a right bracket without a mate, so return false right away
            } else {
                return false;
            }
        }
        return brackets == 0 && counter > 0;
    }

    // function we start with
//    public static boolean hasBalancedBrackets(String str) {
//        int brackets = 0;
//        for (char ch : str.toCharArray()) {
//            if (ch == '[') {
//                brackets++;
//            } else if (ch == ']') {
//                brackets--;
//            }
//        }
//        return brackets == 0;
//    }

}
