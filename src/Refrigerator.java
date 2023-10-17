public class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo (boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food...");
            setHasWorkToDo(false);
            System.out.println("Stop ordering.");
        }
    }
}
