public class One {

  /*
   * This class prints hello world an the arguments which are pass as parameter
   */
  public static void main(String[] args) {
    System.out.println("Hello World\n");
    this.greet();
    System.out.println("Arguments : \n");
    for (int i = 0; i < args.length; i++) {
      System.out.println("Argument " + i + 1 + " : " + args[i]);
    }

    System.out.println("");
  }

  public void greet() {
    System.out.println("Good Morning how are ?");
  }

  /*
   * This functions helps in adding two number
   * @param : a which is an interger
   * @param : b which is an interger
   * @return the sum of two number
   */
  public int add(int a, int b) {
    return (a + b);
  }

  public int getHeight() {
    /*
     *
     * @return the height
     */
    return 500;
  }

  /*
   *
   * @return the width
   */
  public int getWidth() {
    return 500;
  }
}
