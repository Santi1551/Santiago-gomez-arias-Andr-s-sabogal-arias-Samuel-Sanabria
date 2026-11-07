class Moto extends Vehiculo {
    private int cilindrada;
    private boolean esSportiva;

    public Moto(String marca, String modelo, int año, int cilindrada, boolean esSportiva) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
        this.esSportiva = esSportiva;
    }

    @Override
    public final double calcularConsumo(double km) {
        double litros = km * (cilindrada / 150000.0);
        System.out.println("Consumo moto para " + km + " km: " + litros + " litros");
        return litros;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Motocicleta");
        System.out.println("Cilindrada: " + cilindrada + " cc");
        if (esSportiva) {
            System.out.println("Categoría: Deportiva");
        } else {
            System.out.println("Categoría: Urbana");
        }
    }
}