public class exercise1 {
  static boolean iWillReview = true;
  static boolean iWillNotFail = true;
  
  public static void main (String args[])
  {
  exercise1 myExercise = new exercise1();
  
  assert iWillReview == false: "You'll Pass this term";
  
  myExercise.Study();
  
  assert iWillNotFail  == false: "Mapapagalitan ka ng mama mo!";
  
    System.out.println(iWIllreview);
    System.out.println(iWillNotFail);
    
    }
    
  void Study(){
  iWillReview = false;
  }
}
