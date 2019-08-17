package academy.learnPrograming;

public class ImportExample {
    public static void main(String[] args) {

        Integer myInteger = 10;
        System.out.println(myInteger);


        Integer myObjectInteger = new Integer(10);
//        System.out.println(myObjectInteger.toString());
        int a = myObjectInteger;
        System.out.println(a);

        boolean myBoolean = true;
        Boolean myObjectBoolean = new Boolean(false);
        Boolean myAnotherObjectBoolean = false;
//        myObjectBoolean.equals(myAnotherObjectBoolean);
//        myBoolean = true;
        int  a[]= {1,2,3,4,5};
        int [] b = {1,2,3,4,5,6};
        int [] c;
        c = new int[]{1,2,3,4,5,6,7};
        char d[];
//        d = new char[]{'a','b','c'};
        d = new char[]{'f'};
        System.out.println("3rd index value" + d[2]);

//        System.out.println("length of a array is"+a[0]);

        Random r = new Random();
//        Date d ;
        java.util.Date da;
        java.sql.DriverManager driverManager;
        System.out.println(r.nextInt(100));
//        System.out.println(RoundingMode.valueOf(6));

//        MyClass abc = new MyClass();
    }

    public int sum(int a, int b){
        return a+b;
    }
}
