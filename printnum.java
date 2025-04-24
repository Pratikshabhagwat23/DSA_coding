class printnum {

  static void printNumbers(int n) {
    System.out.println(n);
    if (n != 5) {
      n++;
      printNumbers(n);
    } 
  }

  public static void main(String[] args) {
    int n = 1;
    printNumbers(n);
  }
}