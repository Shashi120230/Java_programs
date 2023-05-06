public class  Bill extends  Detail
{
    int n;
    double amt;
    Bill(String a,String b,long c,double d,int e)
    {
        super(a,b,c,d);
        n=e;
        amt=0.0;
    }
    void cal()
    {
        if(n>=1 && n<=100)
        {
            amt=rent;
        }
        else if(n>=101 && n<=200)
        {
            amt=n*0.6+rent;
        }
        else if(n>=201 && n<=300)
        {
            amt=n*0.8+rent;
        }
        else if(n>300)
        {
            amt=n+rent;
        }}
    void show()
    {   super.show();
        System.out.println("Number of calls="+n);
        System.out.println("Amount to pay="+amt);
    }
}