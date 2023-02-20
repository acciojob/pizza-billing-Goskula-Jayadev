package com.driver;

public class Pizza {
    private int price, baseprice;
    private Boolean isVeg;
    private String bill;

    boolean isCheeseadded,isToppingsadded,isBillgenerated,isTakeawayAdded;

    private int toppings;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillgenerated =false;
        this.isCheeseadded =false;
        this.isToppingsadded =false;
        this.isTakeawayAdded=false;
        // your code goes here
        if(isVeg){
            this.baseprice = 300;
            this.toppings = 70;
        }
        else{
            this.baseprice = 400;
            this.toppings = 120;

        }
        this.price+=this.baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheeseadded){
            this.price+=80;
            this.isCheeseadded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isToppingsadded){
            this.price+=this.toppings;
            this.isToppingsadded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeawayAdded){
            this.price+= 20;
            this.isTakeawayAdded=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillgenerated){
            this.bill="Base Price Of The Pizza: "+this.baseprice+"\n";
            if(isCheeseadded){
                this.bill+="Extra Cheese Added: "+80+"\n";
            }
            if(isToppingsadded){
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeawayAdded){
                this.bill+="Paperbag Added: "+20+"\n";
            }
            this.bill+="Total Price: "+this.price;
            isBillgenerated=true;
        }
        return this.bill;
    }
}
