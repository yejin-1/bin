import java.util.Scanner;

class NextFit
{

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("통갯수:");
        int bin=scanner.nextInt();

        System.out.print("각각의통사이즈:");
        int bins[] = new int[bin];

        for(int i=0;i<bin;i++)
        bins[i]=scanner.nextInt();

        System.out.print("물건갯수:");
        int item=scanner.nextInt();

        System.out.print("각각의물건용량:");
        int items[] = new int[item];

        for(int i=0;i<item;i++)
        items[i]=scanner.nextInt();

        int bi[] = new int[bin];

        int k=0;
        int fail=0;

        for(int i=0;i<item;i++)
        {

            int j=k;

            do{
                if(bins[j]>=items[i])
                if(bi[j]!=1)
                {
                    k=j;

                    bi[k]=1;
                    fail=1;

                    break;
                }
                j++;

                if(j==bin)
                j=0;

            }while(j!=k);

        if(fail==0)
            System.out.println("Fail:"+(i+1));

        else
            System.out.println((i+1)+"IS"+bins[k]+",EMPTY:"+(bins[k]-items[i]));
        }
    }
}

