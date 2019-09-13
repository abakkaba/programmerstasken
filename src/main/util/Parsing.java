package main.util;

import main.domain.QueryLine;
import main.domain.TimeLine;

import java.util.ArrayList;
import java.util.List;

import static main.util.Constants.*;

/**
 * @author Sergey Moroz
 * @since 13.09.2019
 */

public class Parsing {

    private static final List<TimeLine> timeLines = new ArrayList<>();
    private static final StringBuilder output = new StringBuilder();

    private Parsing() {
        // @comment: implementation not needed
    }

    public static String parse(List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            String[] fields = input.get(i).split(SPACE);
            if (fields[0].equals(TIME_LINE)) {
                timeLines.add(new TimeLine(i, fields[1], fields[2], fields[3], fields[4], fields[5]));
            } else if (fields[0].equals(QUERY_LINE)) {
                analyze(new QueryLine(i, fields[1], fields[2], fields[3], fields[4]));
            }
        }
        return output.toString();
    }

    private static void analyze(QueryLine queryLine) {
        int count = 0;
        int waitingTime = 0;
        for (TimeLine timeLine : timeLines) {
            if (timeLine.isMatch(queryLine)) {
                waitingTime += timeLine.getWaitingTime();
                count++;
            }
        }
        output.append(count > 0 ? String.valueOf(waitingTime / count) : HYPHEN)
                .append(System.lineSeparator());
    }

}
