package quizTest;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("");
        ArrayList<String> def = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();

        def.add("definition 1");
        def.add("def2");
        def.add("def3");
        def.add("def4");
        def.add("definition 5");
        def.add("def6");
        def.add("def7");
        def.add("def8");

        words.add("word1");
        words.add("word2");
        words.add("word3");
        words.add("word4");
        words.add("word5");
        words.add("word6");
        words.add("word7");
        words.add("word8");

        ArrayList<String> usedDef = new ArrayList<String>();
        ArrayList<String> usedWords = new ArrayList<String>();

        String question = "";
        String correctAns = "";
        String wrongAns1 = "";
        String wrongAns2 = "";
        String wrongAns3 = "";

        while (question.equals("")) {
            int randomNum2 = (int) (Math.random() * def.size());

            if (usedDef.isEmpty()) {
                question = def.get(randomNum2);
                usedDef.add(def.get(randomNum2));
                usedWords.add(words.get(randomNum2));
                correctAns = words.get(randomNum2);
            }

            else {
                for (String quest : usedDef) {
                    if (!def.get(randomNum2).equals(quest)) {
                        question = def.get(randomNum2);
                        usedDef.add(def.get(randomNum2));
                        usedWords.add(words.get(randomNum2));
                        correctAns = words.get(randomNum2);
                    }
                }
            }
        }

        while (wrongAns1.equals("")) {

            int randomNum3 = (int) (Math.random() * words.size());
            for (String usedWord : usedWords) {
                if (!words.get(randomNum3).equals(usedWord) && !words.get(randomNum3).equals(wrongAns2)
                        && !words.get(randomNum3).equals(wrongAns3)) {
                    wrongAns1 = words.get(randomNum3);
                }
            }
        }

        while (wrongAns2.equals("")) {

            int randomNum3 = (int) (Math.random() * words.size());
            for (String usedWord : usedWords) {
                if (!words.get(randomNum3).equals(usedWord) && !words.get(randomNum3).equals(wrongAns1)
                        && !words.get(randomNum3).equals(wrongAns3)) {
                    wrongAns2 = words.get(randomNum3);
                }
            }
        }

        while (wrongAns3.equals("")) {

            int randomNum3 = (int) (Math.random() * words.size());
            for (String usedWord : usedWords) {
                if (!words.get(randomNum3).equals(usedWord) && !words.get(randomNum3).equals(wrongAns1)
                        && !words.get(randomNum3).equals(wrongAns2)) {
                    wrongAns3 = words.get(randomNum3);
                }
            }
        }

        ArrayList<String> currentQuest = new ArrayList<String>();

        currentQuest.add(correctAns);
        currentQuest.add(wrongAns1);
        currentQuest.add(wrongAns2);
        currentQuest.add(wrongAns3);

        System.out.println(question);

        while (currentQuest.isEmpty() == false) {
            int randomAns = (int) (Math.random() * currentQuest.size());
            System.out.println(currentQuest.get(randomAns));
            currentQuest.remove(randomAns);
        }

    }
}
