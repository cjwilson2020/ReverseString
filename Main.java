class Main {
  public static void main(String[] args) {
    //Reverse a string
    String s = "Christopher can also reverse strings!";
    System.out.println(s);
    System.out.println(reverseString(s));
  }

  static String reverseString(String s){
    String rev = "";
    int size = s.length();
    for (int i = 0; i < size; i++ ){
      rev = rev + s.substring(size - i - 1, size - i);
    }
    return rev;
  }
}