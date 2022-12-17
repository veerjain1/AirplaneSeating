import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[][] firstClass = new String[11][5];
    String[][] business = new String[17][6];
    String[][] economy = new String[31][7];

    // SET UP FIRST CLASS
    firstClass[0][0] = " ";
    firstClass[0][1] = "B";
    firstClass[0][2] = "C";
    firstClass[0][3] = "D";
    firstClass[0][4] = "E\n";

    firstClass[1][0] = "1";
    firstClass[2][0] = "2";
    firstClass[3][0] = "3";
    firstClass[4][0] = "4";
    firstClass[5][0] = "5";
    firstClass[6][0] = "6";
    firstClass[7][0] = "7";
    firstClass[8][0] = "8";
    firstClass[9][0] = "9";
    firstClass[10][0] = "10";

    for (int r = 1; r < 11; r++) {
      for (int c = 1; c < 5; c++) {
        if (r % 2 == 0) {
          firstClass[r][c] = "-";
        } else {
          firstClass[r][c] = "E";
        }
      }
    }

    // SET UP BUSINESS CLASS
    business[0][0] = "  ";
    business[0][1] = "B";
    business[0][2] = "C";
    business[0][3] = "D";
    business[0][4] = "E";
    business[0][5] = "F\n";

    business[1][0] = "11";
    business[2][0] = "12";
    business[3][0] = "13";
    business[4][0] = "14";
    business[5][0] = "15";
    business[5][0] = "16";
    business[6][0] = "17";
    business[7][0] = "18";
    business[8][0] = "19";
    business[9][0] = "20";
    business[10][0] = "21";
    business[11][0] = "22";
    business[12][0] = "23";
    business[13][0] = "24";
    business[14][0] = "25";
    business[15][0] = "26";
    business[16][0] = "27";

    for (int r = 1; r < 17; r++) {
      for (int c = 1; c < 6; c++) {
        if (r % 2 == 0) {
          business[r][c] = "-";
        } else {
          business[r][c] = "E";
        }
      }
    }

    // SET UP ECONOMY CLASS
    economy[0][0] = " ";
    economy[0][1] = " B";
    economy[0][2] = "C";
    economy[0][3] = "D";
    economy[0][4] = "E";
    economy[0][5] = "F";
    economy[0][6] = "G\n";

    economy[1][0] = "28";
    economy[2][0] = "29";
    economy[3][0] = "30";
    economy[4][0] = "31";
    economy[5][0] = "32";
    economy[5][0] = "33";
    economy[6][0] = "34";
    economy[7][0] = "35";
    economy[8][0] = "36";
    economy[9][0] = "37";
    economy[10][0] = "38";
    economy[11][0] = "39";
    economy[12][0] = "40";
    economy[13][0] = "41";
    economy[14][0] = "42";
    economy[15][0] = "43";
    economy[16][0] = "44";
    economy[17][0] = "45";
    economy[18][0] = "46";
    economy[19][0] = "47";
    economy[20][0] = "48";
    economy[21][0] = "49";
    economy[22][0] = "50";
    economy[23][0] = "51";
    economy[24][0] = "52";
    economy[25][0] = "53";
    economy[26][0] = "54";
    economy[27][0] = "55";
    economy[28][0] = "56";
    economy[29][0] = "57";
    economy[30][0] = "58";

    for (int r = 1; r < 31; r++) {
      for (int c = 1; c < 7; c++) {
        if (r % 2 == 0) {
          economy[r][c] = "-";
        } else {
          economy[r][c] = "E";
        }
      }
    }

    System.out.println(
        "\nWelcome to Veer Airlines. Before we get onto the plane, we must book your tickets. Please look at the seating chart below and follow our instructions. \n");

    printPlane(firstClass, business, economy);

    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    String inputKeepBooking = "no";

    boolean keepBooking = true;
    int bookingCounter = 0;

    while (keepBooking) {

      System.out.println("\nEnter the class you want to book seats for: ");
      String userClass = myObj.nextLine();
      userClass = userClass.toLowerCase();

      if (userClass.equals("first class")) {
        firstClass = bookSeats(firstClass, userClass, 20, 0, 11, 5);
      }
      if (userClass.equals("business class")) {
        business = bookSeats(business, userClass, 40, 10, 17, 6);
      }
      if (userClass.equals("economy class")) {
        economy = bookSeats(economy, userClass, 90, 27, 31, 7);
      }

      System.out.println("Do you want to book more tickets?");
      inputKeepBooking = myObj.nextLine();

      if (inputKeepBooking.equals("yes")) {
        keepBooking = true;
      } else {
        keepBooking = false;
      }

      bookingCounter++;

    }

    System.out.println("\nThank you for booking your tickets. Here is the updated plane...\n");
    printPlane(firstClass, business, economy);

    System.out.println(Order());

  }

  public static void printPlane(String[][] firstClass, String[][] business, String[][] economy) {

    System.out.println("\n\t\t       FIRST CLASS\n");
    for (int r = 0; r < 11; r++) {
      System.out.print("     \t\t");
      for (int c = 0; c < 5; c++) {
        System.out.print(" " + firstClass[r][c] + " ");
      }
      System.out.println();
    }

    System.out.println("\n\t\t       BUSINESS CLASS\n");
    for (int r = 0; r < 17; r++) {
      System.out.print("        \t");
      for (int c = 0; c < 6; c++) {
        System.out.print(" " + business[r][c] + " ");
      }
      System.out.println();
    }
    System.out.println("\n\t\t       ECONOMY CLASS\n");
    for (int r = 0; r < 31; r++) {
      System.out.print("        \t");
      for (int c = 0; c < 7; c++) {
        System.out.print(" " + economy[r][c] + " ");
      }
      System.out.println();
    }

  }

  public static String[][] bookSeats(String[][] typeClass, String userClass, int maxNumOfSeats, int difference,
      int rowSize, int columnSize) {

    boolean validReq = false;
    int rowSymbol = 0;
    int columnSymbol = 0;
    int numSeatsReq = 0;
    String seatLocation = "";
    int seatCounter = 0;
    Scanner myObj1 = new Scanner(System.in);

    for (int r = 0; r < rowSize; r++) {
      for (int c = 0; c < columnSize; c++) {
        if (r % 2 == 0 && typeClass[r][c] == "T") {
          seatCounter++;
        }
      }
    }
    if ((userClass.equals("economy class") && seatCounter >= 90)
        || (userClass.equals("business class") && seatCounter >= 40)
        || (userClass.equals("first class") && seatCounter >= 20)) {
      System.out.print("Sorry, this class currently booked. Please try a different class. You are on Stand By.");
      return typeClass;
    }

    while (validReq == false) {

      System.out.println("\nEnter the number of seats you want to book in " + userClass + ": ");
      numSeatsReq = myObj1.nextInt();
      if (numSeatsReq <= maxNumOfSeats) {
        validReq = true;
      }
    }

    System.out.println(
        "\nUsing the numbers on the left of each row and the letters on the top of each column, enter the location of each seat you would like to book in "
            + userClass + " EX. B-1");

    for (int i = 0; i < numSeatsReq; i++) {

      System.out.println("\nSeat #" + (i + 1) + " in " + userClass + ": ");
      seatLocation = myObj1.next();
      String[] arr = seatLocation.split("-");

      if (arr[0].equals("B")) {
        columnSymbol = 1;
      }
      if (arr[0].equals("C")) {
        columnSymbol = 2;
      }
      if (arr[0].equals("D")) {
        columnSymbol = 3;
      }
      if (arr[0].equals("E")) {
        columnSymbol = 4;
      }
      if (arr[0].equals("F")) {
        columnSymbol = 5;
      }
      if (arr[0].equals("G")) {
        columnSymbol = 6;
      }

      if(userClass.equals("business class")){
        rowSymbol = ((Integer.parseInt(arr[1])) - difference+1);
      }
      else{
         rowSymbol = ((Integer.parseInt(arr[1])) - difference);
      }
     

      if (typeClass[rowSymbol][columnSymbol].equals("T")) {
          System.out.println("Sorry, the location you have entered is taken. Please try again.");
        i--;
      }else if(typeClass[rowSymbol][columnSymbol].equals("E")) {
          typeClass[rowSymbol][columnSymbol] = "T";
         System.out.println("Thank you for booking this seat! Here is your ticket:\n|TICKET|\nSeat: " + seatLocation
            + " in " + userClass.toUpperCase() + "\nCONFIRMATION CODE: 81792192837");
      }
         else if (typeClass[rowSymbol][columnSymbol].equals("-")) {
          System.out.println("Sorry, the location you have entered is an aisle. Please try again.");
        i--;
         }
      else{
         System.out.println("Sorry, the location you have entered is not a seat. Please try again.");
        i--;
      }

       
      }
    return typeClass;
    }
    
  

  public static String Order() {

    Scanner myObj2 = new Scanner(System.in);
    String menuReq="";
    String display ="All good, No problem in enjoying a flight without something to fill your stomach. Have a nice flight!";

    System.out.println(
        "\n\n\nThanks for making the flight! As we have taken off and reached a safe altitude, we are ready to start serving snacks and drinks.\nHere is our menu, if you would like to order anything, please type 'yes'.");
    System.out.format("%25s","Burger: "); 
    System.out.println("$16.00");
        System.out.format("%25s","1996 Wine: "); 
    System.out.println("$13.50");
        System.out.format("%25s","Burrito with Chips: "); System.out.println("$18.70");
        System.out.format("%25s","French Fries: ");
    System.out.println("$11.00");
        System.out.format("%25s","Pizza: ");
    System.out.println("$18.50");
        System.out.format("%25s","Rissoto with a Drink: ");
    System.out.println("$27.00");
        System.out.format("%25s","Coke: ");
    System.out.println("$6.00");
        System.out.format("%25s","Falafel: ");
    System.out.println("$15.50");
        System.out.format("%25s","Balsamic Vinegar Salad: ");
    System.out.println("$17.50");
        System.out.format("%25s","Dosa: ");
    System.out.println("$20.00\n");
    String snacksDrinks = myObj2.nextLine();

    if (snacksDrinks.equals("yes")) {
      reciepts r = new reciepts("", "");
      String seatLocation ="";

      System.out.println("How many items would you like to order? ");
      int numItems = myObj2.nextInt();

      for (int i = 0; i < numItems; i++) {
        System.out.println("Please enter your seat number: ");
        seatLocation = myObj2.next();

        String[] arr = seatLocation.split("-");
        if((Integer.parseInt(arr[1]))>=28){
          return "Sorry, no options are available for Economy class.";
        }

        
        System.out.println("Please choose from the above list");
        menuReq = myObj2.next();
        r.setSeat(seatLocation);
        r.setMenuItem(menuReq);
        r.menuAdd();

        System.out.println("\nThe credit card you bought this seat with will be used to pay for the items you have added to your cart. Below is your receipt.");
      }

       display = r.displayReciept();
        return display;

    }
     return display;

  }

}

// PROBLEMS
// check asile code for first class