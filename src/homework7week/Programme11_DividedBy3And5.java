package homework7week;

public class Programme11_DividedBy3And5 {
    public static void main(String[] args) {
        System.out.println("Number divisible by 3:");
        for (int i=1;i<=100; i++){
            if (i%3==0){
                System.out.println(i + " ");

            }

        }
        System.out.println("Numbers divisible by 5: ");
        for (int i=1; i<=100; i++){
            if (i % 5 ==0){
                System.out.println(i +" ");
            }
        }
    }

}
