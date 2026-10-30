package U1T11_Labs;
    // Lab 3 of U1T11 String Methods
public class CustomStringMethods {
  public CustomStringMethods() { }

  public boolean longerThan(String myString, int maxLength) {
    return myString.length() > maxLength;
  }

  public String funnyString(String str, int idx) {
    String additive = str.substring(idx,idx+1);
    return additive + str + additive;
  }

  public String halvesReversed(String myString) {
    String half1 = myString.substring(0,myString.length()/2);
    String half2 = myString.substring(myString.length()/2);
    return half2+half1;
  }

  public String pigLatin(String orig) {
    return orig.substring(1) + orig.substring(0,1) + "ay";
  }

  public String removeCharacter(String myString, int removeIdx) {
    if (removeIdx >= myString.length()) {
      return myString;
    } else {
      return myString.substring(0,removeIdx) + myString.substring(removeIdx+1);
    }
  }

  public String insertAt(String orig, String insertText, String searchStr) {
    if (orig.contains(searchStr)) {
        int index = orig.indexOf(searchStr);
        return orig.substring(0,index) + insertText + orig.substring(index);
    } else {
        return orig + insertText;
    }   
  }

  public String endUp(String myString, int numToCap){
    if (numToCap > myString.length()) {
        return myString.toUpperCase();
    } else {
        return myString.substring(0,myString.length()-numToCap) + myString.substring(myString.length()-numToCap,myString.length()).toUpperCase();
    }
  }

  public String yellOrWhisper(String myString) {
    if (myString.substring(0,1).equals((myString.substring(0,1).toUpperCase()))) {
        return myString.toLowerCase();
    } else {
        return myString.toUpperCase();
    }
  }

  public String starBetween(String str) {
    String finalstr = str.substring(0,1);
    for (int i=1; i<str.length(); i++) {
        String addingStr = str.substring(i,i+1);
        finalstr += "*"+addingStr;
    }
    return finalstr;
  }
}
