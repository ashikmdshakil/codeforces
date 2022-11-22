import java.util.Scanner;

public class Canteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = "";
        String arrangement = "";
        input1 = sc.nextLine();
        arrangement = sc.nextLine();

        int n = getNumbers(input1)[0];
        int t = getNumbers(input1)[1];
        boolean con = true;

        if(n >=1 && n <= 50 && t >= 1 && t<= 50){
            char[] arr = arrangement.toCharArray();
            for(char letter: arr){
                if(letter == 'B' || letter == 'G'){
                    continue;
                }
                else{
                    con = false;
                }
            }
            if(arr.length == n && con == true){
                for(int i = 0; i < arrangement.length() - 1; ){
                    for(int j = 0; j< t; j++){
                        try {
                            if(arr[i] == 'B' && arr[i+1] == 'G'){
                                arr[i] = 'G';
                                arr[i+1] = 'B';
                                i = i+1;
                            }
                        } catch (Exception e) {
                        }
                    }
                    i = i+1;
                }
                String output = "";
                for(char ch: arr){
                    output = output + ch;
                }
                System.out.println(output);
            }
        }
    }

    public static int[] getNumbers(String input){
        int[] numberArray = new int[2];
        String number = "";
        for(char letter: input.toCharArray()){
            if(letter == ' '){
                numberArray[0] = Integer.parseInt(number);
                number = "";
            }
            else{
                number = number + letter;
            }
        }
        numberArray[1] = Integer.parseInt(number);
        return numberArray;
    }
}
