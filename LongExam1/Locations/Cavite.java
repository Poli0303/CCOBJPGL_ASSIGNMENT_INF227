public class App {

static boolean iWillReview = true;

    static boolean iWillNotFail = true;

   

    public static void main(String args[]) {

   

        App myApp = new App();

        assert iWillReview == true: "Goodluck nalang haha";

        myExercise.Study();

        assert iWillNotFail == false: "Alam mo na R grade mo :'))";

        System.out.println(iWillReview);

        System.out.println(iWillNotFail);

    }
    void Study(){

        iWillReview = false;

        }

}