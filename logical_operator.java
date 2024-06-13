class logical_operator
{
    public static void main(String args[]) 
    {
        int a = 5;
        int b = 6;
        int c = 4;

        // boolean result = a>b & a>c;//and operator
        // boolean result = a>b | a>c; //or operator
        // boolean result = !(a>b); //not operator, always use parenthesis

        // short circuit method, it checks 1st statement and then gives result

        // boolean result = a>b && a<c; //it checks the one if it's true then it goes for 2nd else it will print false
        boolean result = a>b || c<b; //it checks the one if it's true then it e it will print true and won't go for 2nd one

        System.out.println(result);
    }
}
