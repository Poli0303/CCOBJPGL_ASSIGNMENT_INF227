import Cat.Pet;
import Dog.Husdor;

public class App {
    public static void main(String[] args) throws Exception {
        Pet myPetCat = new Pet();
        myPetCat.meow();
        System.out.println("Eye color:" + myPetCat.eyeColor);
        System.out.println("Fur color:" + myPetCat.furColor + "\n");

        Husdor Husdor = new Husdor();
        Husdor.bark();
        System.out.println("Eye color:" + Husdor.eyeColor);
        System.out.println("Fur color:" + Husdor.furColor);
    }
}