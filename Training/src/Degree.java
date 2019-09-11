class Degree{
  public void getDegree(){
    System.out.println("I got a Degree");
  }
}

class Undergraduate extends Degree{
  public void getDegree(){
    System.out.println("I am an Undergraduate");
  }
}

class Postgraduate extends Degree{
  public void getDegree(){
    System.out.println("I am a Postgraduate");
  }
}

class Print{
  public static void main(String[] args){
    Undergraduate a = new Undergraduate();
    Postgraduate b = new Postgraduate();
    a.getDegree();
    b.getDegree();
  }
}
