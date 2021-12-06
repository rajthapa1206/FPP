package programmingassignment5_1;

public class Main {

    public static void main(String args[])
    {
    	//Instantiating 2 instances of MySingleton class
        MySingleton fpp = MySingleton.getInstance();
        MySingleton mpp = MySingleton.getInstance();
        // Printing the hash code for above variables
        System.out.println("Hashcode of fpp is "
                           + fpp.hashCode());
        System.out.println("Hashcode of mpp is "
                           + mpp.hashCode());
        // Condition check
        if (fpp == mpp) {
            System.out.println(
                "Two objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            System.out.println(
                "Two objects DO NOT point to the same memory location on the heap");
        }
    }
}