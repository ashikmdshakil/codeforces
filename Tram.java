import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int entry = 0, exit = 0, capacity = 0;
        int n = scanner.nextInt();
        int[][] tram = new int[n][2];
        //scanner.close();
        //Scanner scanner1 = new Scanner(System.in);
        if (n >= 2 && n <= 1000) {
            for (int i = 0; i < n; i++) {
                input = new Scanner(System.in).nextLine();
                tram[i] = getNumbers(input);
            }
            if (tram[0][0] == 0 && tram[n - 1][1] == 0) {
                entry = tram[0][1];
                exit = 0;
                capacity = entry;
                for (int j = 1; j < n-1; j++) {
                    exit = tram[j][0];
                    entry = (entry - exit) + tram[j][1];
                    if (entry > capacity) {
                        capacity = entry;
                    }
                }
                //if(tram[n-1][0] == entry){
                    System.out.println(capacity);
                //}
            }
        }
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
