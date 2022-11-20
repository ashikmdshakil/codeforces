import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        if(input.toCharArray().length >=1 && input.toCharArray().length <= Math.pow(10,18)){
            for(char letter: input.toCharArray()){
                if(letter == '4' || letter == '7'){
                    ++count;
                }
            }
            if(count == 4 || count ==7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
