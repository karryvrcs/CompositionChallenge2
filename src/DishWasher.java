public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(){
        hasWorkToDo = false;
    }

    public void loadDishwasher(){
        System.out.println("DishWasher loading!");
        hasWorkToDo = true;
        System.out.println("hasWorkToDo:" + hasWorkToDo);
    }
}
