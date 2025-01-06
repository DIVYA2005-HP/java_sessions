public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("MAX VALUE +1:"+(Integer.MAX_VALUE+1));
        System.out.println("Hello, World!");

        int b = (int)(20.9);//explicit type conversion
        System.out.println(b);

        double d1 = 90;//implicit type conversion
        System.out.println(d1);

        float f1 = 2.9f;
        System.out.println(f1);

        double d2 = 10.0/3.0;
        System.out.println(d2);

        float f2=10.0f/3;
        System.out.println(f2);

        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2/2);
        System.out.println(2*2);//arithemetic operators

        System.out.println(7==8);
        System.out.println(7!=8);
        System.out.println(2<2);//comparison operators

        if(5>1) {
            System.out.println("5 is greater than 1");
        } else {
            System.out.println("noooo");
        }


        int x=10;
        int y=30;
        if(x>y) {
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }
    }
}

//git init
//git init
//git commit -m"changed made"
//git remote add origin ""
