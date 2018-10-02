public class ThreadReader extends Thread {

  private String name;

  public ThreadReader(String myName){
    this.name = myName;
  }

  @Override
  public void run(){
    for(int i = 0; i < 5; i ++){
      System.out.println("I am thread: "+name);
    }
  }
}
