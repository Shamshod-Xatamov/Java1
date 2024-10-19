import java.util.Scanner;
public class SimpleJava {
    public static void main(String[] args) {
        //task1
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alexandra Abramov");
        //task2
        int num1=74,num2=36;
        System.out.println(num1+num2);
        //task3
        int n1=50,n2=3;
        System.out.println(n1/n2);
        //task4
        int a=-5+8*6;
        int b=(55+9)%9;
        int c=20+(-3)*5/8;
        int d=5+15/3*2-8%3;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);

        //task5
        System.out.println("Input first number: ");
        int firstInt= scanner.nextInt();
        System.out.println("Input second number: ");
        int secondInt=scanner.nextInt();
        System.out.println("The sum is: " + (firstInt + secondInt));

        //task6
        int myNum1=25,myNum2=5;
        int multiply=myNum1*myNum2;
        int devision=myNum1/myNum2;
        int add=myNum1+myNum2;
        int subtract=myNum1-myNum2;
        System.out.println("Multiply: " + multiply);
        System.out.println("Devision: " + devision);
        System.out.println("Add: " + add);
        System.out.println("Subract: " + subtract);

        //task7
        System.out.println("Input a number: ");
        int myInt= scanner.nextInt();
        for(int i=1;i<=10;i++){
            int result=myInt*i;
            System.out.println(myInt+"x"+i+"="+result);
        }
        //task8
        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");

        //task9
        double myFormula1=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("Result:"+myFormula1);
        //task10
        System.out.println("Enter the number of terms: ");
        int terms= scanner.nextInt();
        double sum=0.0;
        //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        for(int i=0;i<terms;i++){
            int denominator=i*2+1;
            if(i%2==0){
               sum=sum+1.0d/denominator;
            }else{
                sum=sum-1.0d/denominator;
            }
        }
        double myResult=sum*4;
        System.out.println("The result of this expression is "+myResult);
        scanner.close();
    }
}
