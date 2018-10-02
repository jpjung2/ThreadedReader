public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    ThreadReader foo = new ThreadReader("foo");
    ThreadReader bar = new ThreadReader("bar");

    foo.start();
    bar.start();
  }
}
