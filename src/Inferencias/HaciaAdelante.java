package Inferencias;

import java.util.ArrayList;

public class HaciaAdelante extends Thread{
    private String meta;
    private  String conocimiento_1;
    private String conocimiento_2;

    public HaciaAdelante(String meta, String conocimiento_1, String conocimiento_2){
            this.meta = meta;
            this.conocimiento_1 = conocimiento_1;
            this.conocimiento_2 = conocimiento_2;
    }

    public void run(){
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

        String[] base_conocimiento = {conocimiento_1, conocimiento_2};

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

        int count = 1;
        for(ArrayList <ArrayList> Rs : R){
            //System.out.println(Rs);
            String R_name = "R" + count;
            System.out.println(R_name);
            for(int i=0; i<Rs.size(); i++){
                if(conocimiento_1.equals(Rs.get(i))){
                    System.out.println(Rs.get(i));

                } else if (conocimiento_2.equals(Rs.get(i))) {
                    System.out.println(Rs.get(i));
                }else {
                    System.out.println("No match condition");
                }
            }
            count++;
        }

        for(String match : R1_condiciones){

        }

    }
}