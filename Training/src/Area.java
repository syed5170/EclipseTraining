public class Area{
  public static void printArea(int a,int b){
    System.out.println(a*b);
  }
  public static void printArea(int a){
    System.out.println(a*a);
  }
public static void main(String args[])
{
   Area a=new Area();
a.printArea(5);
a.printArea(6,4);
}
}
