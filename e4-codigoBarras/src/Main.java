import java.util.Scanner;

public class Main {
    private static String[] codigo;
    public static int usuario;
    public static String numeroStr;

    public static void escaner(){
        usuario = 0;
        Scanner sc = new Scanner(System.in);
        usuario= sc.nextInt();
        numeroStr = Integer.toString(usuario);
    }

    public static void EAN8(){
        int resultado=0;
        for (int i = 0; i < 7; i++){
            if (i==0 || i==2 || i==4 || i==6){
                resultado = resultado + Character.getNumericValue(numeroStr.charAt(i))*3;
            } else resultado = resultado + Character.getNumericValue(numeroStr.charAt(i));
            System.out.println(resultado);
        }
        int resto = resultado % 10;
        int diferencia = 10 - resto;
        System.out.println(diferencia);
        if (Character.getNumericValue(numeroStr.charAt(7))==diferencia){
            System.out.println("SI");
        } else System.out.println("NO");
    }

    public static void EAN13(){
        int resultado=0;
        for (int i = 0; i < 7; i++){
            if (i==0 || i==2 || i==4 || i==6){
                resultado = resultado + Character.getNumericValue(numeroStr.charAt(i))*3;
            } else resultado = resultado + Character.getNumericValue(numeroStr.charAt(i));
            System.out.println(resultado);
        }
        int resto = resultado % 10;
        int diferencia = 10 - resto;
        System.out.println(diferencia);
        if (Character.getNumericValue(numeroStr.charAt(7))==diferencia){
            System.out.println("SI");
        } else System.out.println("NO");
    }

    public static void main(String[] args) {
        escaner();
        System.out.println(usuario);
        switch (String.valueOf(usuario).length()){
            case: 7;
        }
        if (String.valueOf(usuario).length()==7) {
            EAN8();
        } else {EAN13();}
    }
}