// @FunctionalInterface
// interface Myinterface {
//     void dowork();
    
// }

// public class lambda {
//     public static void main (String[] args){
//         Myinterface work = () -> System.out.println("hi");
//         work.dowork();
//     }
// }



@FunctionalInterface
interface Myinterface {
    void dowork(String message);
    
}

public class lambda {
    public static void main (String[] args){
        Myinterface work = (String message) -> {
            System.out.println("hi" + message);
        };
        work.dowork("hello");
    }
}