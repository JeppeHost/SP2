public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
       super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }
    public int getRegistrationFee(){
        int fee = 0;
        if (kmPrLitre > 20 && kmPrLitre <= 50) {
            fee = 330;
        }
        else if(kmPrLitre > 15 && kmPrLitre <= 20){
            fee = 1050;
        }
        else if(kmPrLitre > 10 && kmPrLitre <= 15){
            fee = 2340;
        }
        else if(kmPrLitre > 5 && kmPrLitre <= 10){
            fee = 5500;
        }
        else if(kmPrLitre > 5){
            fee = 10470;
        }

        return fee;

    }
    public abstract String getFuelType(){
        return "Gasoline";
    }
    @Override
    public String toString(){
        return "";

    }


}
