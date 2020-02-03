class value
{
public static void main(String[] args) {
    int a=10;
    int arr[]=new int[3];
arr[2]=12;
callbyval(a);
    System.out.print(a);
    callbyref(arr);
    System.out.print(arr[2]);


}
static void callbyval(int a)
    {
a=15;

    }
    static void callbyref(int as[])
    {
    as[2]=9;
     
     
    }
}