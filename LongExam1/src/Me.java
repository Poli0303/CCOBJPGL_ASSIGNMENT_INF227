import Locations.Boracay;
import Locations.Cabanatuan;
import Locations.Cavite;
import Locations.Isabela;
import Locations.NuevaEcija;
import Locations.Tagaytay;

public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Isabela Isabela) {
        if (Isabela.getAirFare() > budget) {
            System.out.println("Hindi ka muna mag ba-Isabela! ");
        }
        else {
            System.out.println("Dito na ako sa Isabela!!! ");
            budget = budget - Isabela.getAirFare();
        }
        checkBudget();
    }

    public void visit(Cavite Cavite) {
        if (Cavite.getAirFare() > budget) {
            System.out.println("Hindi ka muna mag bo-Cavite! ");
        }
        else {
            System.out.println("Dito na ako sa Cavite!!! ");
            budget = budget - Cavite.getAirFare();
        }
        checkBudget();
    }
    
    public void visit(Boracay boracay) {
        if (boracay.getAirFare() > budget) {
            System.out.println("Hindi ka muna mag bo-boracay! ");
        }
        else {
            System.out.println("Dito na ako sa Boracay!!! ");
            budget = budget - boracay.getAirFare();
        }
        checkBudget();
    }

    public void visit(Cabanatuan Cabanatuan) {
        if (Cabanatuan.getAirFare() > budget) {
            System.out.println("Hindi ka muna mag ba-Cabanatuan! ");
        }
        else {
            System.out.println("Dito na ako sa Cabanatuan!!! ");
            budget = budget - Cabanatuan.getAirFare();
        }
        checkBudget();
    }

    public void visit(NuevaEcija NuevaEcija) {
        if (NuevaEcija.getAirFare() > budget) {
            System.out.println("Hindi ka muna pupunta ng NuevaEcija! ");
        }
        else{
            System.out.println("Dito na ako sa NuevaEcija!!! ");
            budget = budget - NuevaEcija.getAirFare();
        }
        checkBudget();
    }
    public void visit(Tagaytay tagaytay) {
        if (tagaytay.getAirFare() > budget) {
            System.out.println("Hindi ka muna pupunta ng Tagaytay! ");
        }
        else {
            System.out.println("Dito na ako sa Tagaytay!!! ");
            budget = budget - tagaytay.getAirFare();
        }
        checkBudget();
    }
    public void checkBudget() {
        System.out.println("my budget is " + budget );
    }
}
