public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double velocidadActual;

    public Vehiculo() {
    }


    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadActual = 0; 
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

   
    public void acelerar() {
        this.velocidadActual = this.velocidadActual + 10;
        System.out.println("Acelerando... velocidad actual: " + this.velocidadActual + " km/h");
    }

   
    public void acelerar(double velocidadObjetivo) {
        if (velocidadObjetivo > this.velocidadActual) {
            this.velocidadActual = velocidadObjetivo;
            System.out.println("Velocidad establecida en: " + this.velocidadActual + " km/h");
        } else {
            System.out.println("La velocidad objetivo debe ser mayor a la actual");
        }
    }

    public double calcularConsumo(double km) {
        double consumo = (km / 100.0) * 10;
        System.out.println("Consumo estimado para " + km + " km: " + consumo + " litros");
        return consumo;
    }

    public void frenar() {
        this.velocidadActual = 0;
        System.out.println("Vehículo detenido.");
    }

    public void mostrarInfo() {
        System.out.println("=== Información del Vehículo ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}
