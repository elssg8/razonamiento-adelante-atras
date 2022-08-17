package Inferencias;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class HaciaAdelante extends Thread{
    //Se crean variables globales
    private String meta;
    private  String conocimiento_1;
    private String conocimiento_2;

    //Constructora del hilo con parametros para recibir la base de conocimiento y la meta
    public HaciaAdelante(String meta, String conocimiento_1, String conocimiento_2){
            this.meta = meta;
            this.conocimiento_1 = conocimiento_1;
            this.conocimiento_2 = conocimiento_2;
    }

    public void run(){
        //Creacion de Arrays para cada R con las condiciones y resultados
        ArrayList <String> R1_condiciones = new ArrayList<>();
        R1_condiciones.add("h8");
        R1_condiciones.add("h6");
        R1_condiciones.add("h5");
        ArrayList <String> R1_resultado = new ArrayList<>();
        R1_resultado.add("h4");

        ArrayList <String> R2_condiciones = new ArrayList<>();
        R2_condiciones.add("h6");
        R2_condiciones.add("h3");
        ArrayList <String> R2_resultado = new ArrayList<>();
        R2_resultado.add("h9");

        ArrayList <String> R3_condiciones = new ArrayList<>();
        R3_condiciones.add("h7");
        R3_condiciones.add("h4");
        ArrayList <String> R3_resultado = new ArrayList<>();
        R3_resultado.add("h9");

        ArrayList <String> R4_condiciones = new ArrayList<>();
        R4_condiciones.add("h8");
        ArrayList <String> R4_resultado = new ArrayList<>();
        R4_resultado.add("h1");

        ArrayList <String> R5_condiciones = new ArrayList<>();
        R5_condiciones.add("h6");
        ArrayList <String> R5_resultado = new ArrayList<>();
        R5_resultado.add("h5");

        ArrayList <String> R6_condiciones = new ArrayList<>();
        R6_condiciones.add("h9");
        R6_condiciones.add("h1");
        ArrayList <String> R6_resultado = new ArrayList<>();
        R6_resultado.add("h2");

        ArrayList <String> R7_condiciones = new ArrayList<>();
        R7_condiciones.add("h7");
        ArrayList <String> R7_resultado = new ArrayList<>();
        R7_resultado.add("h6");

        ArrayList <String> R8_condiciones = new ArrayList<>();
        R8_condiciones.add("h1");
        R8_condiciones.add("h7");
        ArrayList <String> R8_resultado = new ArrayList<>();
        R8_resultado.add("h9");

        ArrayList <String> R9_condiciones = new ArrayList<>();
        R9_condiciones.add("h1");
        R9_condiciones.add("h8");
        ArrayList <String> R9_resultado = new ArrayList<>();
        R9_resultado.add("h6");

        //Creacion de la base de conocimiento
        ArrayList <String> base_conocimiento = new ArrayList<>();
        base_conocimiento.add(conocimiento_1);
        base_conocimiento.add(conocimiento_2);

        //Creacion de un array que contiene los Arrays de R1-R9
        ArrayList <ArrayList> R = new ArrayList<>();
        R.add(R1_condiciones);
        R.add(R2_condiciones);
        R.add(R3_condiciones);
        R.add(R4_condiciones);
        R.add(R5_condiciones);
        R.add(R6_condiciones);
        R.add(R7_condiciones);
        R.add(R8_condiciones);
        R.add(R9_condiciones);

        //Recorrido de R1-R9 en orden y busqueda de coincidencias en las condiciones con el primer elemento de la
        //base de conocimiento
        for (String h_extraida : base_conocimiento){//Recorrido de la base de conocimiento
            int count = 1;
            ArrayList <Rclass> condicion_CC = new ArrayList<>();
            for(ArrayList <ArrayList> Rs : R){//Recorrido de R1-R9
                //System.out.println(Rs);
                String R_name = "R" + count;
                Rclass aux;
                //System.out.println(R_name);
                for(int i=0; i<Rs.size(); i++){//Recorrido de R
                    if(h_extraida.equals(Rs.get(i))){
                        aux = new Rclass();
                        int count_CC = 0;
                        //Saber cuantas condiciones conocidad tiene
                        for(int j=0; j< Rs.size(); j++){
                            for(String hc : base_conocimiento){
                                if(hc.equals(Rs.get(j))){
                                    count_CC++;
                                }
                            }
                        }
                        aux.setId(R_name);
                        aux.setCondiciones(Rs.size());
                        aux.setCondiciones_conocidas(count_CC);
                        aux.setPeso(count);
                        condicion_CC.add(aux);

                        System.out.println(h_extraida + " se encuentra en: \n" + R_name + "-->" + Rs.get(i));


                    }

                }//R actual
                count++;

            }//Todas las R
            int [] cc = new int[condicion_CC.size()];
            String [] eleccion = new String[condicion_CC.size()];
            for(int x=0; x< condicion_CC.size(); x++){
                System.out.println(condicion_CC.get(x));
                if(condicion_CC.get(x).getCondiciones() == condicion_CC.get(x).getCondiciones_conocidas()){
                    //System.out.println("Eleccion: " + condicion_CC.get(x).getId());
                    eleccion [x]= condicion_CC.get(x).getId();
                    cc [x] = condicion_CC.get(x).getCondiciones_conocidas();
                }


            }

            Arrays.sort(cc);
            for( int a=0; a< condicion_CC.size(); a++){
                if(condicion_CC.get(a).getId().equals(eleccion[a])){
                    if(cc[cc.length-1] == condicion_CC.get(a).getCondiciones_conocidas()){
                        System.out.println("Eleccion: " + condicion_CC.get(a).getId());
                    }
                }
            }


            /*if(eleccion == null){
                Arrays.sort(pesos);
                System.out.println("Eleccion: " + pesos[0]);
            }*/

            //Hacer algo con el primer bloque
        }//Base de conocimiento

    }
}
