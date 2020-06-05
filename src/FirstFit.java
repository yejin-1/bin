import java.util.Scanner;

class FirstFit
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("통 갯수:");
        int bin = scanner.nextInt();

        System.out.print("각각의 통 사이즈:");
        int bins[] = new int[bin];

        for(int i=0;i<bin;i++)
        bins[i] = scanner.nextInt();

        System.out.print("물건 갯수:");
        int item = scanner.nextInt();

        System.out.print("각각의 물건 용량:");
        int items[] = new int[item];

        for(int i=0;i<item;i++)
        items[i]=scanner.nextInt();

        int bi[]=new int[bin];

        for(int i=0;i<item;i++)
        {
             int k=-1;

             for(int j=0;j<bin;j++)
                {
                     if(bins[j]>=items[i])
                    if(bi[j]!=1)
                     {
                        k=j;
                        bi[k]=1;

                        break;
                     }
                }
        if(k==-1)
             System.out.println("Fail:"+(i+1));

        else
             System.out.println((i+1)+"IS"+bins[k]+",EMPTY:"+(bins[k]-items[i]));

        }
    }
}
