import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String number = "";
        int n = 0, k = 0;
        for(char letter: input.toCharArray()){
            if(letter == ' '){
                n= Integer.parseInt(number);
                number="";
            }
            else{
                number = number+letter;
            }
        }
        k = Integer.parseInt(number);

        if(n >=2 && n<= Math.pow(10,9) && k >=1 && k<= 50){
            for(int i =0; i<k; i++){
                if(n % 10 == 0){
                    n = n/10;
                }
                else{
                    n = n - 1;
                }
            }

            System.out.println(n);
        }
    }
}
