public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Guilherme " + "Silva " + "Teles";

        System.out.print(nomeCompleto);

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //* repetição */

        int number = 5;
        number++;

        System.out.println(number);

        //* operador ternário */

        int a,b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.println(resultado);

        //*outro modo de fazer o operador ternário */

        String resultadoNovo = a==b ?"verdadeiro" : "falso";

        System.out.println(resultadoNovo);

        //* operadores relacionais */
        int numero1 = 6;
        int numero2 = 7;
        
        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero Um é maior que numeroDois? " + simNao);


    }
}