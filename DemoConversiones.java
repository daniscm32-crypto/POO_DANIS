public class DemoConversiones {

    public static void main(String [] args){

        int entero= 5;
        double implicito=entero;
        double decimal=3.75;
        int truncado = (int) decimal;
        long redondeado =Math.round(decimal);
        double techo =Math.ceil (decimal);
        int opcion= Integer.parseInt("2");
        double horas = Double.parseDouble("3.75");
        String ticket ="PK "+String.valueOf(150);
        System.out.println("Casting implicito int A double: "+ implicito);
        System.out.println("Casting decimal redondeado: "+ redondeado);
        System.out.println("Casting implicito int A double: "+ implicito);
        System.out.println("Casting implicito int A double: "+ implicito);
        System.out.println("Casting implicito int A double: "+ implicito);

    }
}
