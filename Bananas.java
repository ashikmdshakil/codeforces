import java.util.Scanner;

public class Bananas {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("input is "+input);
        int k = 0, n =0, w = 0, space = 0;
        String number = "";
        for(char letter: input.toCharArray()){
            if(letter == ' '){
                if(space == 0){
                    k = Integer.parseInt(number);
                    number = "";
                }
                else if(space == 1){
                    n = Integer.parseInt(number);
                    number = "";
                }
                space ++;
            }
            else{
                number = number + letter;
            }
        }
        w = Integer.parseInt(number);


        //getting three fields are done
    }
}
