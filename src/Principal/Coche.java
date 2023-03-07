package Principal;

public class Coche extends Vehiculo{

    private int num_ejes;
    private  String num_cambios;
    private String color;

    public Coche() {
    }

    public Coche(String marca, String placa, String propietario) {
        super(marca, placa, propietario);
    }

    public Coche(int num_ejes, String num_cambios, String color) {
        this.num_ejes = num_ejes;
        this.num_cambios = num_cambios;
        this.color = color;
    }

    public Coche(String marca, String placa, String propietario, int num_ejes, String num_cambios, String color) {
        super(marca, placa, propietario);
        this.num_ejes = num_ejes;
        this.num_cambios = num_cambios;
        this.color = color;
    }

    public int getNum_ejes() {
        return num_ejes;
    }

    public void setNum_ejes(int num_ejes) {
        this.num_ejes = num_ejes;
    }

    public String getNum_cambios() {
        return num_cambios;
    }

    public void setNum_cambios(String num_cambios) {
        this.num_cambios = num_cambios;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ "Coche{" +
                "num_ejes=" + num_ejes +
                ", num_cambios='" + num_cambios + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
