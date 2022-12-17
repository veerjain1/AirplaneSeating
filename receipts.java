import java.util.ArrayList;
class reciepts {

  private String seatLocation;
  private String menuItem;
  private double totalBill;
  private ArrayList<String> orderList = new ArrayList<String>(); 



  public reciepts(String seatLocation, String menuItem){
    this.seatLocation = seatLocation;
    this.menuItem = menuItem;
    totalBill =0;
  }

  public double menuAdd(){
   
    if(menuItem.equals("Burger")){
      totalBill+=16;
      orderList.add("Burger");
    }
    if(menuItem.equals("1996 Wine")){
      totalBill+=13.5;
       orderList.add("1996 Wine");
    }
    if(menuItem.equals("Burrito with Chips")){
      totalBill+=18.7;
       orderList.add("Burrito with Chips");
    }
    if(menuItem.equals("French Fries")){
      totalBill+=11;
       orderList.add("French Fries");
    }
    if(menuItem.equals("Pizza")){
      totalBill+=18;
       orderList.add("Pizza");
    }
    if(menuItem.equals("Rissoto with a Drink")){
      totalBill+=27;
       orderList.add("Rissoto with a Drink");
    }
    if(menuItem.equals("Coke")){
      totalBill+=6;
       orderList.add("Coke");
    }
    if(menuItem.equals("Falafel")){
      totalBill+=15.5;
       orderList.add("Falafel");
    }
    if(menuItem.equals("Balsamic Vinegar Salad")){
      totalBill+=17.5;
       orderList.add("Balsamic Vinegar Salad");
    }
    if(menuItem.equals("Dosa")){
      totalBill+=20;
      orderList.add("Dosa");
    }

    totalBill = (totalBill*1.1)+5;
    return totalBill;
  }

  public void setSeat(String seatLocation){
    this.seatLocation = seatLocation;
  }
  public void setMenuItem(String menuItem){
    this.menuItem = menuItem;
  }

  public String displayReciept(){
    String reciept ="Veer Airlines Receipt for Seat: "+seatLocation+"\n"+orderList+"\n Your total bill will be: $"+totalBill;
    return reciept;
  }
}