package Principal;

public class Moto extends Vehiculo{
    private String modelo;
    private String cilindraje;
    private String tipo;

    public Moto() {
    }

    public Moto(String marca, String placa, String propietario) {
        super(marca, placa, propietario);
    }

    public Moto(String marca, String placa, String propietario, String modelo, String cilindraje, String tipo) {
        super(marca, placa, propietario);
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Moto{" +
                "modelo='" + modelo + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
