class pen
{
    public void music()//return nothing
    {
        System.out.println("music playing");
    }

    public int cost(int num)// return int value so we've to use sout arg
    {
        int cost = 2*num;
        return cost;
    }
    public String want(String dec)//return string value so we've to use sout arg
    {
        if(dec == "y"){
            return "take this pen";
        }
        else{
            return "no pen";
        }
    }
}


public class method 
{
    public static void main(String[] args) 
    {
        pen myPen = new pen();// creating a class
        myPen.music();// calling void method
        int cost2 = myPen.cost(45);//calling int method
        System.out.println(cost2);//printing return type
        String decision = myPen.want("n");//calling str method
        System.out.println(decision);//printing return type
    }
    
}






