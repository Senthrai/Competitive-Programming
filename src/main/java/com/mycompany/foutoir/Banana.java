package com.mycompany.foutoir;

public class Banana {
    public int solution(String S) {
        int B = 0, A = 0, N = 0, count = 0;

        for (char letter : S.toCharArray()) {
            switch (letter) {
                case 'B' : B++;break;
                case 'A' : A++;break;
                case 'N' : N++;break;
            }

            if (B >= 1 && A >= 3 && N >= 2) {
                B--;
                A -= 3;
                N -= 2;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Banana solution = new Banana();
        System.out.println(solution.solution("NAABXXAN"));          // Output: 1
        System.out.println(solution.solution("NAANAAXNABABYNNBZ"));  // Output: 2
        System.out.println(solution.solution("QABAAAWOBL"));        // Output: 0

        String largeInput = "BANANABANANABANANABANANABANANA";
        System.out.println(solution.solution(largeInput)); // Output: 5
        String smallInput = "B";
        System.out.println(solution.solution(smallInput)); // Output: 0
        String emptyInput = "";
        System.out.println(solution.solution(emptyInput)); // Output: 0
        String noBananaInput = "XYZLMNOPQR";
        System.out.println(solution.solution(noBananaInput)); // Output: 0
        String overlappingInput = "BANANABANANA";
        System.out.println(solution.solution(overlappingInput)); // Output: 2
        String multipleBananaInput = "BANANAANANABANANABANANABANANA";
        System.out.println(solution.solution(multipleBananaInput)); // Output: 4
    }

}
