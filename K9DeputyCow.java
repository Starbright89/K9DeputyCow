//Netanya Feldkamp/Ariel/Sam
//02.14.24
//K9DeputyCow.java User input calculate then system print out


import java.util.Scanner;

public class K9DeputyCow

{
public static void main(String[] args)
{
// named constants
final int K9 = 1;
final int DEPUTY = 2;
final int COW = 3;

    String msgP1 = "";
    String msgP2 = "";
    String msgWin = "";
    int A;
    int B;
    
    
    System.out.println("K9!!! DEPUTY!!! COW!!!");
    System.out.println("K9 = 1, Deputy = 2, Cow = 3");
   
    System.out.println("Player 1, enter your mode of attack!");
    Scanner input = new Scanner(System.in);
    A = input.nextInt();

    System.out.println("Player 2, enter your mode of attack!");
    B = input.nextInt();
    


   System.out.println("Player 1 has chosen: ");

    if (A >= COW) {
        msgP1 = "COW";
    } else if (A >= DEPUTY) {
        msgP1 = "DEPUTY";
    } else {
        msgP1 = "K9";
    } 
    System.out.println(msgP1);
    
    System.out.println("Player 2 has chosen: ");

    if (B >= COW) {
        msgP2 = "COW";
    } else if (B >= DEPUTY) {
        msgP2 = "DEPUTY";
    } else {
        msgP2 = "K9";
    } 
    
    System.out.println(msgP2);
    
    if(A == 1){
        if(B == 2)
            msgWin = "Player 2 wins!";
        else if(B == 3)
            msgWin = "Player 1 wins!";
        else
            msgWin = "It's a tie";
    }
    else if (A == 2){
        if(B == 1)
            msgWin = "Player 1 wins!";
        else if(B == 3)
            msgWin = "Player 2 wins!";
        else
            msgWin = "It's a tie";
    }
    else{
        if(B == 1)
            msgWin = "Player 2 wins!";
        else if(B == 2)
            msgWin = "Player 1 wins";
        else
            msgWin = "It's a tie";
    }
        //k9(1) wins over cow(3), cow(3) wins over deputy(2), deputy(2) wins over k9(1)
    System.out.println(msgWin);
    input.close();
}

}
