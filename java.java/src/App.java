public class App {
   public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2022, 1600, "gasolina");
        CarroElectrico electrico = new CarroElectrico("Tesla", "Model 3", 2023, 75.0, 500.0);
        Moto moto = new Moto("Honda", "CB500", 2021, 500, true);

        System.out.println("--- Aceleracion");
        carro.acelerar();          
        carro.acelerar();          
        carro.acelerar(120);       
        electrico.acelerar(80);    
        moto.acelerar();           
        moto.acelerar(150);        

        System.out.println("\n-- Calcular consumo");
        carro.calcularConsumo(300);
        electrico.calcularConsumo(300);
        moto.calcularConsumo(300);

        System.out.println("\n--- FRENAR TODOS ---");
        carro.frenar();
        electrico.frenar();
        moto.frenar();

        System.out.println("\n--- CARGAR BATERÍA ---");
        electrico.cargarBateria();

        System.out.println("\n--- MOSTRAR INFORMACIÓN ---");
        carro.mostrarInfo();
        System.out.println();
        electrico.mostrarInfo();
        System.out.println();
        moto.mostrarInfo();

        System.out.println("\n--- USO DE POLIMORFISMO (ARREGLO DE VEHÍCULOS) ---");
        Vehiculo[] flota = { carro, electrico, moto };
        

        for (int i = 0; i < flota.length; i++) {
            flota[i].calcularConsumo(100);
        }
    }
}
}
