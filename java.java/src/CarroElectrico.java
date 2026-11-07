final class CarroElectrico extends Carro {
    private double capacidadBateria;
    private double autonomiaKm;

    public CarroElectrico(String marca, String modelo, int año, double capacidadBateria, double autonomiaKm) {
        super(marca, modelo, año, 0, "eléctrico");
        this.capacidadBateria = capacidadBateria;
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double calcularConsumo(double km) {
        double kWh = (km / autonomiaKm) * capacidadBateria;
        System.out.println("Consumo para " + km + " km: " + kWh + " kWh (eléctrico)");
        return kWh;
    }

    public void cargarBateria() {
        System.out.println("Batería cargada al 100%");
        System.out.println("Autonomía disponible: " + autonomiaKm + " km");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Carro Eléctrico");
        System.out.println("Capacidad batería: " + capacidadBateria + " kWh");
        System.out.println("Autonomía: " + autonomiaKm + " km");
    }
}