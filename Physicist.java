import java.util.Scanner;

public class Physicist {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        String status = "";
        if(rows >= 1 && rows <=100){
            int[][] vectors = new int[rows][3];
            Scanner scannerLine = new Scanner(System.in);

            for(int i=0; i< rows; i++){
                String input = scannerLine.nextLine();
                try {
                    vectors[i] = getNumbers(input);
                } catch (Exception e) {
                    status="NO";
                }
            }
            int summation = 0;


            for(int j =0; j<3; j++){
                for(int k =0; k< rows; k++){
                    if(!(vectors[k][j] <= -100) && !(vectors[k][j] >= 100)){
                        summation += vectors[k][j];
                    }
                    else{
                        status = "NO";
                    }
                }
                if(summation == 0 && !status.equals("NO")){
                    status = "YES";
                    summation = 0;
                }
                else{
                    status = "NO";
                    break;
                }
            }
            System.out.println(status);
        }
        else{
            System.out.println("NO");
        }
    }

    public static int[] getNumbers(String input){
        int[] arrIn = new int[3];
        int space = 0;
        String number="";
        for(char letter: input.toCharArray()){
           if(letter == ' '){
               if(space == 0){
                   arrIn[0] = Integer.parseInt(number);
                   number = "";
               }
               else if(space == 1){
                   arrIn[1] = Integer.parseInt(number);
                   number ="";
               }
               ++space;
           }
           else{
               number=number+letter;
           }
        }
        arrIn[2] = Integer.parseInt(number);
        return arrIn;
    }
}
