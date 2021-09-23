public class InvertirCadena {
    public static void main(String[] args){

        String cadena = "PARALELEPIPEDO";
        System.out.println(invertircadena(cadena, cadena.length() - 1));
    }
    public static String invertircadena(String cadena, int longitud){
        if (longitud == 0){
            return cadena.charAt(longitud)+ " ";
        }else{
            return cadena.charAt(longitud) + (invertircadena(cadena, longitud - 1));
        }
    }
}
