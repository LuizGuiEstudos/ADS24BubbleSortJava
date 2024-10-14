public class Dados
{

    public int[] nums = new int[10];

    public Dados()
    {
        gerarDadosAleatorios();
    }

    private void gerarDadosAleatorios() {
        for( int i=0; i < 10; i++ )
        {
            int randI = (int) (Math.random() * 10);
            nums[i] = randI;
        }
    }

}
