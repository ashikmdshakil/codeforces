import java.util.Scanner;

//58/A
public class ChatRoom {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.toCharArray().length >= 1 && input.toCharArray().length <=100){
            String target = "hello";
            String output = "NO";
            int j = 0;
            for(int i = 0; i < input.toCharArray().length; i++){
                if(input.toCharArray()[i] == target.toCharArray()[j]){
                    if(j == 4){
                        output = "YES";
                        break;
                    }
                    else{
                        ++j;
                    }
                }
                else{
                    continue;
                }
            }
            System.out.println(output);
        }
    }
}
