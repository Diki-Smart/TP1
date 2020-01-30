/*public class TriBulle {

    public static void main (String[] args)
      {

          int i;
          int Tab[];


          for (i=0 ; i < 10 ; i++)
          {

              if ( Tab[i] < Tab[i])
              {

              }





          }

      }
}
*/
    public static void triBulle(int tableau[])
    {
        int longueur=tableau.length;
        boolean inversion;

        do
        {
            inversion=false;

            for(int i=0;i<longueur-1;i++)
            {
                if(tableau[i]>tableau[i+1])
                {
                    echanger(tableau,i,i+1);
                    inversion=true;
                }
            }
        }
        while(inversion);
    }


    public static void triBulleOptimise(int tableau[])
    {
        int longueur=tableau.length;
        boolean inversion;

        do
        {
            inversion=false;

            for(int i=0;i<longueur-1;i++)
            {
                if(tableau[i]>tableau[i+1])
                {
                    echanger(tableau,i,i+1);
                    inversion=true;
                }
            }
            longueur--;
        }
        while(inversion);
    }