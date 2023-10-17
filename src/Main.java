public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getBrewMaster().setHasWorkToDo(true);
        // Use the getter methods to call the specific appliances
        kitchen.getBrewMaster().brewCoffee();
        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();

        System.out.println();

        //Try to hide some details of calling code
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();


    }
}

