class calculator
{
    int talha;//field
    public int add(int n1, int n2)// creating a method
    {
        int r = n1 + n2;
        System.out.println(talha);
        return r;
        
    }
}



public class  classes
{
    public static void main(String[] args) 
    {
        int num1 = 4;
        int num2 = 5;
        calculator calc = new calculator();//creating an object
        calc.talha = 45; // setting properties
        int result = calc.add(num1,num2);// using method
        System.out.println(result);
    }
    
}