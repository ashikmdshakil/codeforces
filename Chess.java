import java.util.Hashtable;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String line = scanner.nextLine();
        try {
            int n = Integer.parseInt(input);
            if(n >= 1 && n <= 1000000){
                int numberOfA = 0;
                int numberOfD = 0;
                if(line.toCharArray().length == n){
                    for(char letter: line.toCharArray()){
                        if(letter == 'A'){
                            ++numberOfA;
                        } else if (letter == 'D') {
                            ++numberOfD;
                        }
                        else {
                            break;
                        }
                    }
                    if(numberOfA > numberOfD){
                        System.out.println("Anton");
                    }
                    else if(numberOfD > numberOfA){
                        System.out.println("Danik");
                    }
                    else if(numberOfA == numberOfD){
                        System.out.println("Friendship");
                    }
                }
            }
        } catch (NumberFormatException e) {

        }
    }
}
