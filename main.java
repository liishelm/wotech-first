
public class Main {
  public static void main(String[] args) {

    double temp = 14.5;
    if(temp<=5){System.out.println("Wear super warm clothes!");}
    else if(temp<=15){System.out.println("Wear warm clothes!");}
    else if(temp<=30 ){System.out.println("Wear normal clothes!");}
    else if(temp>30) {System.out.println("Wear something cool!");}
    else{System.out.println("Not a valid temperature!");}
  }
}
