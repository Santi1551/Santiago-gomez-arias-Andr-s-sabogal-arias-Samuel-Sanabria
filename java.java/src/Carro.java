class Carro extends Vehiculo {
    private int cilindraje;
    private String tipoCombustible;

    public Carro(String marca, String modelo, int año, int cilindraje, String tipoCombustible) {
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    @Override
    public double calcularConsumo(double km) {
        double litros = km * (cilindraje / 100000.0);
        System.out.println("Consumo para " + km + " km con " + cilindraje + "cc: " + litros + " litros de " + tipoCombustible);
        return litros;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Carro de combustión");
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Combustible: " + tipoCombustible);
    }
}