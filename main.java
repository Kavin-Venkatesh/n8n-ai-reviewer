class Main{
    public static void main(String[] args){
        System.out.print("Hello world! from main" );
        System.out.print(sum(1, 2));
        System.out.print(multiply(2,256));
    }

    public static int sum(int num1 , int num2){
        return num1 + num2;
    }


    public static int multiply(int num1 , int num2){
        return num1 * num2;
    }
}