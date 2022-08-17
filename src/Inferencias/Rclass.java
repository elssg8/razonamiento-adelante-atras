package Inferencias;

public class Rclass {
    String id;
    int condiciones;
    int condiciones_conocidas;
    int peso;
    /*public Rclass(String id, int condiciones, int condiciones_conocidas, int peso){
        this.id = id;
        this. condiciones = condiciones;
        this.condiciones_conocidas = condiciones_conocidas;
        this.peso = peso;
    }*/

    public Rclass(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(int condiciones) {
        this.condiciones = condiciones;
    }

    public int getCondiciones_conocidas() {
        return condiciones_conocidas;
    }

    public void setCondiciones_conocidas(int condiciones_conocidas) {
        this.condiciones_conocidas = condiciones_conocidas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nid: ");
        sb.append(id);
        sb.append("\nC: ");
        sb.append(condiciones);
        sb.append("\nCC: ");
        sb.append(condiciones_conocidas);
        sb.append("\npeso: ");
        sb.append(peso);
        return sb.toString();
    }
}
