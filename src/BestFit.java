import java.util.Scanner;

class BestFit
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
        items[i] = scanner.nextInt();

        int bi[]= new int[bin];
        int bf[] = new int[bin];

        for(int i=0;i<item;i++)
        {
                 for(int j=0;j<bin;j++)
                 {
                         bf[j]=bins[j]-items[i];

                         if(bi[j]==1)
                                 bf[j]=-1;
                 }

                 int min=10;
                 int k=0;

                 for(int j=0;j<bin;j++)
                 {
                        if(bf[j]<min&&bf[j]>=0)
                         {
                                min=bf[j];
                                k=j;
                         }
                 }
                bi[k]=1;

                 if(bf[k]<0)
                         System.out.println("Fail:"+(i+1));
                 else
                        System.out.println((i+1)+"IS"+bins[k]+",EMPTY:"+bf[k]);

        }

        }

}
