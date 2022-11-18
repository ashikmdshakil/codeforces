import java.util.Scanner;

public class Bananas {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();
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
        if(k >=1 && w <= 1000 && n >=0 && n <= Math.pow(10,9)){
            int totalPrice = 0;
            for(int i = 1; i <= w; i++){
                totalPrice = totalPrice + i*k;
            }
            if(totalPrice > n){
                System.out.println(totalPrice - n);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
