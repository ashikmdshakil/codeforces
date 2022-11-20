import java.util.Scanner;

public class Tram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //taking input for value n
        int n = scanner.nextInt();
        String input = "";
        int[][] tram = new int[n][2];

        //taking input for n times
        if(n >= 2 && n <= 1000){
            for(int i =0; i<n; i++){
                input = scanner.nextLine();
                System.out.println(input);
                tram[i] = getNumbers(input);
            }
        }

        System.out.println("First exit is "+ tram[0][0]);
        System.out.println("last in is "+ tram[n-1][1]);

    }

    public static int[] getNumbers(String input){
        int[] numbers = new int[2];
        String number = "";
        for(char letter: input.toCharArray()){
            if(letter == ' '){
                numbers[0] = Integer.parseInt(number);
                number = "";
            }
            else{
                number = number + letter;
            }
        }
        numbers[1] = Integer.parseInt(number);
        return numbers;
    }
}
