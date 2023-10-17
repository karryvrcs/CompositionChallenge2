public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(){
        hasWorkToDo = false;
    }

    public void orderFood(){
        hasWorkToDo = true;
        System.out.println("Refrigerator Order Food!");
        System.out.println("hasWorkToDo:" + hasWorkToDo);
    }
}
