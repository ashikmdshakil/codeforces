import java.util.Scanner;

public class String_Task {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        String input = scanner.next();
        if(input.length() <= 100 && input.length() >=1){
            String output = "";
            for(char letter: input.toCharArray()){
                if( letter == 'a' || letter == 'A' ||letter == 'e' || letter == 'E' || letter =='i' || letter =='I' ||  letter == 'o' || letter == 'O' || letter =='u' || letter =='U' || letter == 'y' || letter == 'Y'){
                    continue;
                }
                else{
                    output += "."+letter;
                }
            }
            System.out.println(output.toLowerCase());
        }
    }
}
