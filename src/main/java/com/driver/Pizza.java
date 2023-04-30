package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheeseprice;
    private int baseprice;
    private int toppingsprice;

    private int paperbagprice;
    //public String bill;
    public int totalprice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBadAdded;
    boolean isBillGenerated;

    //it prevents duplicate additon of the cheese if called multiple times
    //also tells which things has been added

    public Pizza(Boolean isVeg){
        //constructor is used to initialize the attributes of any class
        this.isVeg = isVeg;
        if(isVeg){
            baseprice = 300;
            toppingsprice = 70;
        }else{
            baseprice = 400;
            toppingsprice = 120;
        }
        paperbagprice = 20;
        cheeseprice = 80;

        isCheeseAdded = false;
        isPaperBadAdded = false;
        isToppingsAdded = false;

        bill = "Base Price Of The Pizza: "+baseprice + "\n";
        // your code goes here
    }

    public int getPrice(){
        return totalprice;
    }

    public void addExtraCheese() {
        if (isCheeseAdded == false) {

            this.totalprice = totalprice + cheeseprice;
            isCheeseAdded = true;

            // your code goes here
        }
    }

    public void addExtraToppings(){
            if(isToppingsAdded == false){
                this.totalprice = totalprice + toppingsprice;
                isToppingsAdded = true;
            }
        }
        // your code goes here

    public void addTakeaway(){
        if(isPaperBadAdded == false){
            this.totalprice = totalprice + paperbagprice;
            isPaperBadAdded = true;
        }
        // your code goes here
    }

    public String getBill(){
        if(isBillGenerated == false){


            if(isCheeseAdded == true){
                bill = bill + "Extra Cheese Added: " +cheeseprice + "\n";
            }
            if(isToppingsAdded == true){
                bill = bill + "Extra Toppings Added: "+toppingsprice + "\n";
            }
            if(isPaperBadAdded == true){
                bill = bill + "Paperbag Added: "+paperbagprice + "\n";
            }
            bill = bill + "Total Price: "+totalprice+"\n";

            isBillGenerated = true;

        }
        return this.bill;
    }
}
