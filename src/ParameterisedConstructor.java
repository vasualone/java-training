public class ParameterisedConstructor {
    public static void main(String[] args) {
        greatNumber obj = new greatNumber();
        int b = obj.greatNumber2(2, 3);
        System.out.println(b);
        Default2 obj2=new Default2();
        obj2.employeeInfo();


    }
}
  class greatNumber {
    int greatNumber2(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than  " + b);
            return a;
        } else
            System.out.println(b + " is greater than  " + a);
        return b;

    }
    void greatNumber2(){
        System.out.println("hi");
    }

}