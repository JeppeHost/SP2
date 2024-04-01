public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;

    private int WhPrKm;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.WhPrKm = WhPrKm;

    }
    public int getBatteryCapacityKwh(){
        return batteryCapacity;

    }

    public int getMaxRangeKm(){
        return maxRange;

    }

    public int getWhPrKm(){
        return ((this.batteryCapacity*1000)/maxRange);

    }

    public int getRegistrationFee(){
        double WhPrKm = getWhPrKm();
        double kmPerLitreCalculator = 100/(WhPrKm/91.25);
        int fee = 0;
        if (kmPerLitreCalculator > 20 && kmPerLitreCalculator <= 50) {
            fee = 330;
        }
        else if(kmPerLitreCalculator > 15 && kmPerLitreCalculator <= 20){
            fee = 1050;
        }
        else if(kmPerLitreCalculator > 10 && kmPerLitreCalculator <= 15){
            fee = 2340;
        }
        else if(kmPerLitreCalculator > 5 && kmPerLitreCalculator <= 10){
            fee = 5500;
        }
        else if(kmPerLitreCalculator > 5){
            fee = 10470;
        }

        return fee;




    }
    @Override
    public String toString(){
        return "";

    }

}
