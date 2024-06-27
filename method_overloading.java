//We can make as many method with same name but either we've to set different parameter or different return type this is called method overloading.. 

class calc
{
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public double add(double n1, double n2){
        return n1 + n2;
    }
}
public class method_overloading
{
    public static void main(String[] args) 
    {
        calc obj = new calc();
        double result = obj.add(999.9, 3);
        System.out.println(result);
        
    }
}
