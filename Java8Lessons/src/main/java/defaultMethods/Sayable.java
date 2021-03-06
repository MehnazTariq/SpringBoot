package defaultMethods;
interface Sayable{    
    // default method    
    default void say(){    
        System.out.println("Hello, this is default method");    
    }    
    // Abstract method    
    void sayMore(String msg);    
    // static method    
    public static void sayLouder(String msg){    
        System.out.println(msg);    
    }    
}