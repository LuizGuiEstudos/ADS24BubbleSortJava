import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Dados NDados = new Dados();
        int[] DadosNums = NDados.nums;

        //mostrar antes do sort
        System.out.println( Arrays.toString( DadosNums ) );

        bubbleSort( DadosNums );

        //mostrar depois do sort
        System.out.println( Arrays.toString( DadosNums ) );

    }



    public static void bubbleSort( int[] arrToSort )
    {
        int size = arrToSort.length;
        for ( int i=0; i<size - 1; i++ )
        {
            for ( int j=0; j<size-i-1; j++ )
            {
                int actual;
                int next;

                actual = arrToSort[j];
                next = arrToSort[ j+1 ];

                if (actual > next) {
                  //troca
                  int hold = actual;

                  arrToSort[j] = next; //atual se torna next
                  arrToSort[j+1] = hold; //next se torna atual
                }
            }
        }
    }

}
