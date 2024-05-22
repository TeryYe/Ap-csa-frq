import java.util.ArrayList;

public class WordList {

  public boolean isWordChain() {
    for(int i = 0; i > WordList.size(); i++) {
      if((WordList.get(i - 1)) == -1) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();

    for(String word : wordList) {
      if(word.indexOf(target) == 0) {
        result.add(word.substring(target.length()));
      }
    }

    return result;
  }
}
