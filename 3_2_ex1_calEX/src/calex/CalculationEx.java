package calex;

public class CalculationEx {
    public static void main(String[] args){

        int i = 10;
        int j = 3;
        int h = 5;

        System.out.println("==산술 연산자==");
        System.out.println("i + j : "+ (i + j));
        System.out.println("i - j : "+ (i - j));
        System.out.println("i * j : "+ (i * j));
        System.out.println("i / j : "+ (i / j));
        System.out.println("i % j : "+ (i % j));

        System.out.println("==자동증감 연산자==");
        i++;
        System.out.println("+ i :  "+ i);
        j--;
        System.out.println("j : "+ j);
        
        System.out.println("==동등비교, 관계 연산자==");
        System.out.println(" i = j  : "+ ( i = j ));
        System.out.println(" i != j  : "+ ( i != j ));
        System.out.println("i > j  : "+ (i >j));
        System.out.println("i < j : "+ (i < j));

        System.out.println("==논리리 연산자==");
        System.out.println("&&(AND)  : "+ ( i = j ));
        System.out.println("&&(AND) : "+ ( i != j ));
        System.out.println("||(OR)  : "+ (i >j));
        System.out.println("||(OR) : "+ (i < j));
    }
}
