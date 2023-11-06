package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] text1 = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(text1, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        int currentWidth = 0;

        while (start < words.length) {
            currentWidth = words[start].length();
            end = start + 1;

            while (end < words.length && currentWidth + words[end].length() + 1 <= maxWidth) {
                currentWidth += words[end].length() + 1;
                end++;
            }

            StringBuilder line = new StringBuilder();

            if (end == words.length || end - start == 1) {
                // Left-justify the line if it's the last line or only one word in the line.
                line.append(words[start]);
                for (int i = start + 1; i < end; i++) {
                    line.append(" ");
                    line.append(words[i]);
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spaces = maxWidth - currentWidth + (end - start - 1);
                int extraSpaces = spaces % (end - start - 1);
                int spaceSize = spaces / (end - start - 1);

                for (int i = start; i < end - 1; i++) {
                    line.append(words[i]);
                    for (int j = 0; j < spaceSize + (i - start < extraSpaces ? 1 : 0); j++) {
                        line.append(" ");
                    }
                }
                line.append(words[end - 1]);
            }

            result.add(line.toString());
            start = end;
        }

        return result;
    }
}
