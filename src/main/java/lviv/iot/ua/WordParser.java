package lviv.iot.ua;


import java.util.Set;
import java.util.TreeSet;

public class WordParser {


  public static Set<String> findWordsByPatterns(String text, int maxLength) {
    TreeSet<String> stringList = new TreeSet<>();
    String[] words = text.split("[ ,.?!-]+");
    for (int i = 0; i < words.length; i++) {
      if (words[i].contains("_") && words[i].length() <= maxLength) {
        stringList.add(words[i]);
      }
    }
    return stringList;
  }
}

//    private TreeSet<String> sortedWords = new TreeSet<>();
//
//    public Set<String> parsedWords(int maxLength, String text) {
//        String[] words = text.split("[ ,.?!-]+");
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].contains("_") && words[i].length() < maxLength) {
//                sortedWords.add(words[i]);
//            }
//        }
//        return sortedWords;
//    }
//
//}

