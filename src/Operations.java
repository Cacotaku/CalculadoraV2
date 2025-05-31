public class Operations
{

    private float num1;
    private float num2;

    private float num3;
    private int assistent1;
    private float resultado;

    public void setNum1(float num1)
    {
        this.num1 = num1;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum2(float num2)
    {
        this.num2 = num2;
    }

    public float getNum2()
    {
        return num2;
    }

    public float Adicao()
    {
        resultado = num1 + num2;
        return resultado;
    }

    public float Subtracao(float num1, float num2)
    {
        resultado = num1 - num2;
        return resultado;
    }
}
