class conversion
{
    public static void main(String args[])
    {
        byte b = 127;
        int a = 660;
        a = b;   //implicit conversion
        b = (byte)a; // type casting ,explicit conversion it uses modulo operator
        System.out.println(b);
    }
}



class Float
{
    public static void main(String args[])
    {
        double b = 127.55;
        int a = 512;
        b = a; // implicit conversion
        a = (int)b; // type casting ,explicit conversion it removes digits after decimal
        System.out.println(a);
    }
}




class promotion
{
    public static void main(String args[])
    {
        byte a = 20;
        byte b = 30;
        int result  = a*b; // type promotion where we promote the type to store values
        System.out.println(result);
    }
}