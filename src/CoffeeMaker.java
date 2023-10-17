public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(){

    }

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo (boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing coffee...");
            setHasWorkToDo(false);
            System.out.println("Stop brewing.");
        }
    }
}
