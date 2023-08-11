package ss08_cleancode_refactoring.exercise;

import java.util.Scanner;

public class TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";

    public static String displayResult(int player1Score, int player2Score) {
        String result = "";
        if (player1Score == player2Score) {
            result = getDrawScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            result = getWinner(player1Score, player2Score);
        } else {
            result = getDifferentScore(player1Score, player2Score);
        }
        return result;
    }

    private static String getDifferentScore(int player1Score, int player2Score) {
        int tempScore = 0;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2Score;
            }
        }
        switch (tempScore) {
            case 0:
                score += LOVE;
                break;
            case 1:
                score += FIFTEEN;
                break;
            case 2:
                score += THIRTY;
                break;
            case 3:
                score += FORTY;
                break;
        }
        return score;
    }

    private static String getWinner(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private static String getDrawScore(int player1Score) {
        String score;
        switch (player1Score) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;
        }
        return score;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter player 1' s name: ");
//        String name1 = scanner.nextLine();
//        System.out.println("Enter player 2' s name: ");
//        String name2 = scanner.nextLine();
        System.out.println(displayResult(10,20));
    }
}


