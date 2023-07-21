public class SayDigits {

    static String arr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void say(int n)
    {
        if(n==0)
        {
            
            return;
        }
        int digit = n%10;
        n=n/10;
        say(n);
        System.out.print(arr[digit]);
    }
    public static void main(String[] args) {
        say(456);
    }
    
}
