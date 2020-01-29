package virtual_pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class CatShelter {

private HashMap<String, Cat> catNames = new HashMap<>();


    public CatShelter() {

    }

    public void addCat(Cat testCat) {
        catNames.put(testCat.getName(), testCat);
    }


    public HashMap<String, Cat> getCatNames() {
        return catNames;
    }

   public void playWithAllCats(){
        for (Cat catToPlayWith : catNames.values()){
            catToPlayWith.play();;
        }
   }

    public void feedAllCats() {
        for (Cat catToBeFed : catNames.values()) {
            if(catToBeFed instanceof OrganicCat){
                ((OrganicCat) catToBeFed).feed();
            }
        }
    }

    public void takeAllCatsToVet() {
        for (Cat catToBeTakenToVet : catNames.values()) {
            if(catToBeTakenToVet instanceof OrganicCat){
                ((OrganicCat) catToBeTakenToVet).vetVisit();
            }
        }
    }

    public void cleanAllLitterBoxes() {
        for (Cat litterBoxToBeCleaned : catNames.values()) {
            if(litterBoxToBeCleaned instanceof OrganicCat){
                ((OrganicCat) litterBoxToBeCleaned).cleanLitterBox();
            }
        }
    }

    public void repairAllRoboCats(){
        for(Cat catToBeRepaired : catNames.values()){
            if(catToBeRepaired instanceof RoboCat){
                ((RoboCat) catToBeRepaired).repair();
            }
        }
    }

    public void rechargeAllRoboCats(){
        for(Cat catToBeCharged : catNames.values()){
            if(catToBeCharged instanceof RoboCat){
                ((RoboCat) catToBeCharged).recharge();
            }
        }
    }

    public void shootAllLaserBeams(){
        for(Cat catToFireBeam : catNames.values()){
            if(catToFireBeam instanceof RoboCat){
                ((RoboCat) catToFireBeam).laserBeam();
            }
        }
    }

    public void adoptCat(String name) { catNames.remove(name);}





    public Collection<Cat> retrievedCatList() {
        return catNames.values();
    }

}




