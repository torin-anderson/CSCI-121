public class Pizza {
    int arraySize;
    String[] list;
    int cost;

    public int getNumberPizzaToppings(){ return arraySize;}
    public void setNumberPizzaToppings(int arraySize){
        //if user wants a length over 10 then the program ends
        if (arraySize > 10){
            System.out.println("Ten toppings or less!");
            System.exit(0);
        }else{
            this.arraySize = arraySize;
        }
    }
    public String[] getPizzaToppings(){ return list;}
    public void setPizzaToppings(String[] list){
        this.list = list;
    }
    public int getCost(){ return cost;}
    public void setCost(int cost){this.cost = (cost * 2) + 14;} //finds cost of pizza with toppings
}