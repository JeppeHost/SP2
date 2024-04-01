public abstract class AFuelCar extends ACar {

    int kmPrLitre;



    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int registrationFee, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, registrationFee);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType(){
        return "";

    }


    public int getKmPrLitre(){
        return 0;

    }

}

