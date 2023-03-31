public class LinearSearch
{
    int a[]= {7,5,4,1,3};

    void linear()
    {
     for(int i=0;i<a.length;i=i+1)
     {
      for(int j=i+1;j<a.length;j=j+1)
         {
          System.out.println(a[i]+" "+a[j]);
         }
     }
}

public static void main(String args[])
{
    LinearSearch obj = new LinearSearch();
    obj.linear();
}
}
