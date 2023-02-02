public class GugudanArrary {
    public static void main(String[] args) {
//        int[] result=new int[9];
//        for(int i=0;i<result.length;i++){
//            result[i]=2*(i+1);
//        }
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }
//
//        result=new int[9];
//        for(int i=0;i<result.length;i++){
//            result[i]=3*(i+1);
//        }
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }
//
//        result=new int[9];
//        for(int i=0;i<result.length;i++){
//            result[i]=4*(i+1);
//        }
//        for(int i=0;i<result.length;i++){
//            System.out.println(result[i]);
//        }


        // 2단에서 9단까지 전체를 출력하는데 많은 중복 코드가 발생한다.
        // 반복문을 사용해 2단과 9단에 대한 중복을 제거한다

        for (int i = 1; i < 10; i++) {
            System.out.println("");
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }
}
