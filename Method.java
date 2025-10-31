class Pen{
  String color;
  String type;
  public void Write(){
      System.out.println("Write Something");
  }
}

public class Method{
    public static void main(String[]args){
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="Gell";
        pen1.Write();
      
    }
}