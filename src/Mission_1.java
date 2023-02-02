//        사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//        예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.

import java.util.Scanner;

public class Mission_1 {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은?: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i < number + 1; i++) {
            System.out.println("");
            System.out.println(i + "단");
            for (int j = 1; j < number + 1; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
