class arithmetic_operators 
{
    public static void main(String args[])
    {
        int a = 16;
        int b = 5;
        
        int result = a + b;// add 
        int result2 = a - b; //subtract
        int result3 = a * b; //multiply
        int result4 = a / b; // it gives only quotient 
        int result5 = a%b;  //it gives only remainder
        
       // same output
        a = a +1;
        a +=1;
        a++; //increment operator

        int result6 = ++a; // pre increment, increment the value then fetchthe value (17 output)
        int result7 = a++;  //post increment, fetch first then increment the value (16 output)
        System.out.println(a);
    }
}
