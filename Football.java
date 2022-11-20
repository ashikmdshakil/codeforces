import java.util.Scanner;

public class Football {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String position = scanner.nextLine();
        boolean zeroExist = false, oneExist = false;
        for(char player: position.toCharArray()){
            if(player == '0'){
                zeroExist = true;
            }
            else{
                oneExist = true;
            }
        }
        if(position.toCharArray().length >=1 && position.toCharArray().length <= 100 && zeroExist && oneExist){
            char currentPosition = position.toCharArray()[0];
            int count = 1;
            String status="NO";
            for(int i =1; i < position.toCharArray().length; i++){
                if(position.toCharArray()[i] == currentPosition){
                    ++count;
                    if(count == 7){
                        status="YES";
                        break;
                    }
                }
                else{
                    count = 1;
                    currentPosition = position.toCharArray()[i];
                }
            }
            System.out.println(status);
        }
    }
}
