package com.example.project.WordScramble;
import java.util.ArrayList;
public class WordScramble {
  /** Scrambles a given word.
   *
   *  @param word  the word to be scrambled
   *  @return  the scrambled word (possibly equal to word)
   *
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *  - the word was scrambled, beginning at the first letter and continuing from left to right
   *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *  - letters were swapped at most once
   */
  public static String scrambleWord(String word) {
      /* to be implemented in part (a) */
      char[] letters = word.toCharArray(); //convert each letter of string into its own index in an array
      for (int i = 0; i < letters.length - 1; i++) {
        if (letters[i] == 'A' && letters[i+1] != 'A') {
          char temp = letters[i];
          letters[i] = letters[i+1];
          letters[i+1] = temp; 
          i++;
        }
      }
      return new String(letters);
  }

  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *
   *  @param wordList the list of words
   *
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *  - all words unchanged by scrambling have been removed from wordList
   *  - each of the remaining words has been replaced by its scrambled version
   *  - the relative ordering of the entries in wordList is the same as it was
   *    before the method was called
   */
   
}
