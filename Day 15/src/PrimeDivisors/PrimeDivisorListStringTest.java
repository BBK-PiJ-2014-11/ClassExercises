package PrimeDivisors;

public class PrimeDivisorListStringTest {

    public static void main(String[] args){
        PrimeDivisorListStringTest test = new PrimeDivisorListStringTest();
        test.launch();
    }

    public void launch(){
        PrimeDivisorList newList = new PrimeDivisorListImpl();
        newList.add(2);
        newList.add(3);
        newList.add(5);
        newList.add(7);
        String s = newList.toString();
        System.out.println(s);
    }
}