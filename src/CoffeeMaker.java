public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(){
        hasWorkToDo = false;
    }

    public void addWater(){
        System.out.println("CoffeeMaker add Water!");
        hasWorkToDo = true;
        System.out.println("hasWorkToDo:" + hasWorkToDo);
    }
}
