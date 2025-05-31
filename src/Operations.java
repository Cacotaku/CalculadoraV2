public class Operations
{
    //Cadastro de variáveis
    private float num1;
    private float num2;

    private float resultado;

    //set e get
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

    //construtores das operações matemáticas

    public float Adicao()
    {
        resultado = num1 + num2;
        return resultado;
    }

    public float Subtracao()
    {
        resultado = num1 - num2;
        return resultado;
    }

    public float Multiplicacao()
    {
        resultado = num1 * num2;
        return resultado;
    }

    public float Divisao()
    {
        resultado = num1 / num2;
        return resultado;
    }

    public float Potencia()
    {
        resultado = num1;
        int assistent1 = 1;
        do
        {
            resultado = resultado * num1;
            assistent1 = assistent1 +1;

        }while(assistent1 <num2);

        return resultado;
    }

    //chamada de texto
    public String Texto()
    {
        String chamadaTxt = "Calculadora maluca:\n" +
                "digite sua operação desejada\n" +
                "1 - Soma\n" +
                "2 - subtração\n" +
                "3 - multiplicação\n" +
                "4 - divisão\n" +
                "5 - exponenciação\n" +
                "0 - Sair\n\n";

        return chamadaTxt;
    }
}
