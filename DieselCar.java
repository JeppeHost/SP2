public class DieselCar extends AFuelCar{

    private boolean hasParticleFilter;

    public boolean hasParticleFilter(){
        return hasParticleFilter;

    }

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int registrationFee, int kmPrLitre, boolean hasParticleFilter){
        super(registrationNumber, make, model, numberOfDoors, registrationFee);
        this.kmPrLitre = kmPrLitre;
        this.hasParticleFilter = hasParticleFilter;


    }

    public int getRegistrationFee(){
        int fee = 0;
        if (kmPrLitre > 20 && kmPrLitre <= 50) {
            fee = 130;
        }
        else if(kmPrLitre > 15 && kmPrLitre <= 20){
            fee = 1390;
        }
        else if(kmPrLitre > 10 && kmPrLitre <= 15){
            fee = 1850;
        }
        else if(kmPrLitre > 5 && kmPrLitre <= 10){
            fee = 2770;
        }
        else if(kmPrLitre > 5){
            fee = 15260;



        } if(!hasParticleFilter) {
            fee += 1000;
        }
        return fee;

    }

    public abstract String getFuelType(){
        return "Diesel";
    }

    @Override
    public String toString(){
        return "";

    }

}
