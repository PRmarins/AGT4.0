import java.util.Scanner;

public class clase1Exercicio2 {
    
    public static void main (String [] args) {

        Scanner teclado = new Scanner(System.in);
        
        /*
         * ######################   VARIABLES   #####################
         */

        int segmentosIngresos = 0;
        int segmentosInmuebles;
        int segmentosLujo = 3;
        int segmentosVeiculo = 0;

        /*####################### DiSCAPACITAD ###################### */
        System.out.print("Hay alguien discapacitado en su casa? ");
        System.out.println(" [ 1 ] para sí/ [ 2 ] para no.");
        int discapacitado = teclado.nextInt();
        boolean sndiscapacitado;
        if (discapacitado == 1) {
            sndiscapacitado = true;
        }else{ 
            sndiscapacitado = false;

        }
        /*####################### DiSCAPACITAD ###################### */

        System.out.println("Vivis en Patagones (Buenos Aires), Chubut, La Pampa, Neuquén, Río Negro, Santa Cruz o Tierra del Fuego, A. e IAS? [ 1 ] para si / [ 2 ] para no");
        int vivis = teclado.nextInt();

        System.out.println("Hay algun integrante que posee Pensión Vitalicia a Veteranos de Guerra del Atlántico Sur? [ 1 ] para si / [ 2 ] para no");
        int pensionGuerra = teclado.nextInt();
        
        /*####################### INGRESOS ###################### */
        System.out.println("Ingresos netos totales: ");
        float ingresos = teclado.nextFloat();
        
        if(sndiscapacitado = false) {
            if (ingresos < 177063) {
                segmentosIngresos = 1;
            }else if ((ingresos > 177063) && (ingresos < 619720))  {
                segmentosIngresos = 2;
            }else if ( ingresos > 619720){
                segmentosIngresos = 3;
            }
            if (vivis == 1){
                if (ingresos < 177063) {
                    segmentosIngresos = 1;
                }else if ((ingresos > 177063) && (ingresos < 743664))  {
                    segmentosIngresos = 2;
                }
                if (ingresos >= 743664){
                    segmentosIngresos = 3;
                }
            }
        }else {
            if (ingresos < 265594) {
                segmentosIngresos = 1;
            }else if ((ingresos >= 265594) && (ingresos < 619720))  {
                segmentosIngresos = 2;
            }
            if (vivis == 1){
                if (ingresos < 265594) {
                    segmentosIngresos = 1;
                }else if ((ingresos > 265594) && (ingresos < 743664))  {
                    segmentosIngresos = 2;
                }
            }

        }
        /*####################### INGRESOS ###################### */

        
        /*####################### INMUEBLES ###################### */
        System.out.println("Cuantos inmuebles posee?");
        int inmuebles = teclado.nextInt();
        if (inmuebles <= 1) {
            segmentosInmuebles = 1;
        }else if (inmuebles == 2){
            segmentosInmuebles = 2;
        }else {
            segmentosInmuebles = 3;
        }
        /*####################### INMUEBLES ###################### */
        
        /*####################### VEICULOS ###################### */
        System.out.println("Posee vehículo(s)? [ 1 ] para si / [ 2 ] para no");
        int respuesta = teclado.nextInt();
        
        if (respuesta == 1) {
            System.out.println("Cuantos veiculos tenes? ");
            int veiculos = teclado.nextInt();
            
            if (veiculos == 1) {
                System.out.println("Cuantos años tiene su veiculo? ");
                int veiculoidade = teclado.nextInt();
                
                if (veiculoidade >= 3) {
                    segmentosVeiculo = 1;

                }else{
                    segmentosVeiculo = 2;
                }
            }else if (veiculos > 1) {
                segmentosVeiculo = 3;
            }
            

        } else {
            segmentosVeiculo = 1;
        }
        /*####################### VEICULOS ###################### */

        System.out.println("Posee una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren capacidad económica plena? [ 1 ] para si [ 2 ] para no");
        int lujo = teclado.nextInt();
        if (lujo == 1){
            segmentosLujo = 3;
        } else {
            segmentosLujo = 1;
        }

        System.out.println("Hay un integrante con Certificado de Vivienda expedido por el ReNaBaP? [ 1 ] para si / [ 2 ] para no");
        int renabap = teclado.nextInt();

        System.out.println("Tienes un domicilio que funcione como comedero o merendero comunitario registrado en el RENACOM? [ 1 ] para si / [ 2 ] para no");
        int comedero = teclado.nextInt();
        
        /*
         *#####################   CLASIFICACIÓN   ################# 
         */
        
        if (pensionGuerra == 1){
            if ((segmentosIngresos == 1) && (segmentosInmuebles == 1) && (segmentosVeiculo == 1) && (segmentosLujo == 1)) {
                System.out.println("Estas en el grupo de Segmento de menores ingresos.");
            
            } else if ((segmentosIngresos == 2) && (segmentosInmuebles == 2) && (segmentosVeiculo == 2) && (segmentosLujo == 1)) {
                System.out.println("Estas en el grupo de Segmento de menores ingresos.");

                //############## TESTANDO TODOS LOS 8 CASOS ############//
            } else if ((segmentosIngresos == 1) && (segmentosInmuebles == 1) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 2) && (segmentosInmuebles == 1) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 1) && (segmentosInmuebles == 2) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 2) && (segmentosInmuebles == 2) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 2) && (segmentosInmuebles == 1) && (segmentosVeiculo == 2) && (segmentosLujo == 1) || (segmentosIngresos == 1) && (segmentosInmuebles == 1) && (segmentosVeiculo == 2) && (segmentosLujo == 1) || (segmentosIngresos == 1) && (segmentosInmuebles == 2) && (segmentosVeiculo == 2) && (segmentosLujo == 1) || (segmentosIngresos == 2) && (segmentosInmuebles == 2) && (segmentosVeiculo == 2) && (segmentosLujo == 1)) {
                System.out.println("Estas en el grupo de segmento de menores ingresos.");

            }

        } else {
            if ((segmentosIngresos == 1) && (segmentosInmuebles == 1) && (segmentosVeiculo == 1) && (segmentosLujo == 1)) {
                System.out.println("Estas en el grupo de Segmento de menores ingresos.");
        
            } else if ((segmentosIngresos == 2) && (segmentosInmuebles == 2) && (segmentosVeiculo == 2) && (segmentosLujo == 1) || (segmentosIngresos == 2) && (segmentosInmuebles == 1) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 1) && (segmentosInmuebles == 2) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 1) && (segmentosInmuebles == 1) && (segmentosVeiculo == 2) && (segmentosLujo == 1) || (segmentosIngresos == 2) && (segmentosInmuebles == 2) && (segmentosVeiculo == 1) && (segmentosLujo == 1) || (segmentosIngresos == 1) && (segmentosInmuebles == 2) && (segmentosVeiculo == 2) && (segmentosLujo == 3) || (segmentosIngresos == 2) && (segmentosInmuebles == 1) && (segmentosVeiculo == 2) && (segmentosLujo == 1)) {
                System.out.println("Estas en el grupo de Segmento de ingresos medios.");

            } else if ((segmentosIngresos == 3) || (segmentosInmuebles == 3) || (segmentosVeiculo == 3) || (segmentosLujo == 3)) {
                System.out.println("Estas en el grupo de Segmento de ingresos altos.");
        
            }
        }teclado.close();

    }
}