import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import svu.csc213.Dialog;
import acm.util.RandomGenerator;

public class Hangman extends GraphicsProgram {

    Stand stand = new Stand();
    Person head = new Person();

    String[] wordChoices = {"ooooooooooooe"};
    String wordChoice;

    public void init(){

        add(stand, getWidth()/2 - stand.getWidth()/2 ,getHeight()/2 - stand.getHeight()/2);
        add(head, 325, 100);


        // need to choose a word
        int wordIndex = RandomGenerator.getInstance().nextInt(0, wordChoices.length-1);
        wordChoice = wordChoices[wordIndex];

        for (int i = 0; i < wordChoice.length(); i++) {
            GRect wordspace = new GRect(5,1);
            add(wordspace, (getWidth()/3) + i * 10,getHeight()/2 - wordspace.getHeight()+150);
        }

        GLabel word;

        for (int g = 0; g < 6; g++) {
            String guess = Dialog.getString("what is your guess");


            //
            if (wordChoice.contains(guess)) {

                for (int i = 0; i < wordChoice.length(); i++) {

                    // if the word choice char at i matches the guess, then add a letter at that location

                    if (wordChoice.charAt(i) == guess.charAt(0)) {
                        GLabel letter = new GLabel(guess);
                        add(letter, getWidth() / 3 + i * 10, getHeight() / 2 - letter.getHeight() + 150);
                    }
                }


            } else {
              // they guessed wrong now what
            }


            // how to make this work with any word?

        }



    }

    public static void main(String[] args) {
        new Hangman().start();
    }
}
