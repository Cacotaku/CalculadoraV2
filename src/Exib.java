import javax.swing.*;

//teste para treino em java.
//Calculadora Maluca V2

public class Exib
{

    public static void main(String[] args)
    {
        //cadastro de variáveis
        float number1;
        float number2;
        int opt;
        float resultado;
        String texto;

        //chamada da classe Exib
        Operations chamada = new Operations();

        //Exibir Menu
        texto = chamada.Texto();
        System.out.println(texto);
        opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));


        do
        {
            //Validar Opção escolhida
            if(opt <0 || opt>5)
            {
                System.out.println("Opção inválida\n");
                System.out.println(texto);
                opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));
            }

            //Chamada de operação
            switch(opt)
            {
                case 1: //Caso 1 - Adição
                    number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:\n"));
                    number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:\n"));

                    chamada.setNum1(number1);
                    chamada.setNum2(number2);

                    resultado = chamada.Adicao();

                    System.out.println("O resultado de " + number1 +
                            " + " + number2 + " é igual a " + resultado + "\n");

                    opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));

                    break;


                case 2: //Caso 2 - Subtração
                    number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:\n"));
                    number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:\n"));

                    chamada.setNum1(number1);
                    chamada.setNum2(number2);

                    resultado = chamada.Subtracao();

                    System.out.println("O resultado de " + number1 +
                            " - " + number2 + " é igual a " + resultado + "\n");

                    opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));

                    break;

                case 3: //Caso 3 - Multiplicação
                    number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:\n"));
                    number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:\n"));

                    chamada.setNum1(number1);
                    chamada.setNum2(number2);

                    resultado = chamada.Multiplicacao();

                    System.out.println("O resultado de " + number1 +
                            " x " + number2 + " é igual a " + resultado + "\n");

                    opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));

                    break;

                case 4: //Caso 4 - Divisão
                    number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:\n"));
                    number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:\n"));

                    chamada.setNum1(number1);
                    chamada.setNum2(number2);

                    resultado = chamada.Divisao();

                    System.out.println("O resultado de " + number1 +
                            " : " + number2 + " é igual a " + resultado + "\n");

                    opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));

                    break;

                case 5: // Exponenciação
                    number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:\n"));
                    number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:\n"));

                    chamada.setNum1(number1);
                    chamada.setNum2(number2);

                    resultado = chamada.Potencia();

                    System.out.println("O resultado de " + number1 +
                            " elevado a potência de " + number2 + " é igual a " + resultado + "\n");

                    opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));

                    break;

                case 0: //Saída
                    System.out.println("Sair\n");
                    break;

                default: //Opção inválida
                    System.out.println("Opção Inválida\n");
                    opt = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada\n"));
            }
        }
        while(opt != 0);
    }
}
