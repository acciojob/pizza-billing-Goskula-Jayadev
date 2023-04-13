package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean topping=false,cheese=false,takeaway=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill="";
        this.price=0;
        // your code goes here
    }

    public int getPrice(){
        if(isVeg){
            price+=300;
        }
        else{
            price+=400;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese){
            price+=80;
            cheese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!topping){
            price+=120;
            topping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            price+=120;
            takeaway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill+="Base Price Of The Pizza: 300"+"\n";
        }
        else{
            bill+="Base Price Of The Pizza: 400"+"\n";
        }
        if(cheese){bill+="Extra Cheese Added: 80"+"\n";}
        if(topping){bill+="Extra Toppings Added: 120"+"\n";}
        if(takeaway){bill+="Paperbag Added: 20"+"\n";}
        bill+="Total price: "+getPrice();
        return this.bill;
    }
}
