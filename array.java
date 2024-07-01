public class array 
{
    public static void main(String[] args) {
        int num[] = new int[5];// array declaration of size 5
        int nums[] = {12,34,545,5646,55};  // direct declaration
        nums[2] = 44; // array updation
        for(int i = 0; i<4; i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println(num[1]);// we didn't assign a value so it'll print 0.
    }
}
