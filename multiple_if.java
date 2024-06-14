class multiple_if 
{
    public static void main(String[] args) 
    {
        int a = 88;
        int b = 319;
        int c = 2116;

        // long method
            
        // if (a>b){
        //     if (a>c) {
        //         System.out.println("a is greatest");
        //     }
        //     if (a==c) {
        //         System.out.println("a and c are equal.");
        //     }
        //     else{
        //         System.out.println("c is greatest");
        //     }
        // }
        // if (a < b) {
        //     if (b>c) {
        //         System.out.println("b is greatest");
        //     }
        //     if (b==c) {
        //         System.out.println("both b and c are equal.");
        //     }
        //     else{
        //         System.out.println("c is greatest");
        //     }
        // }
        // else{
        //     System.out.println("a and b are equal.");
        // }


        // short method
        if(a==b || a==c || b==c){
            System.out.println("two values are equal.");
        }
        else if (a>b && a>c) {
            System.out.println("a is greatest");
        }
        else if(b>c){
            System.out.println("b is greatest");
        }
        
        else{
            System.out.println("c is greatest");
        }

    }
}
