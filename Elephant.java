import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        if(distance >= 1 && distance <= Math.pow(10,6)){
            if(distance >= 5 && (distance/5)*5 < distance){
                System.out.println((distance/5)+1);
            }
            else if((distance/5)*5 == distance){
                System.out.println(distance/5);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
