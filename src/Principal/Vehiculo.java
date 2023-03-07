package Principal;

public class Vehiculo {

    private String marca;
    private String placa;
    private String propietario;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String placa, String propietario) {
        this.marca = marca;
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
