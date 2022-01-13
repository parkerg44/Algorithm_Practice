//Basic ArrayList 
import java.util.ArrayList;

public class ArrayTest
{


    public static void main(String[] args) 
    {
        String[] words = {"my ", "time ",};
        String[] wordTwo = {"is ", "now!"};
        ArrayList<String> newWords = new ArrayList<String>();
        newWords = stringMerge(words, wordTwo);
        System.out.println("word List 1: ");
        printArray(words);
        System.out.println("Word List 2: "); 
        printArray(wordTwo);
        printArray(newWords);

    }


    public static ArrayList<String> stringMerge(String[] words, String[] wordt)
    {
        ArrayList<String> doubleWord = new ArrayList<String>();
        for(String w : words) doubleWord.add(w);
        for (String t : wordt) doubleWord.add(t);
        return doubleWord;
    }      

    public static void printArray(ArrayList<String> toPrint)
    {
        for(String word : toPrint)
        {
            System.out.print(word);
        }
    }

    public static void printArray(String[] toPrint)
    {
        for(String word : toPrint)
        {
            System.out.print(word);
        }
    }
}