import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    private static List<Peleador> peleadores = new ArrayList<>();
    private static List<Duelo> duelos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        crearPeleadoresDBZ();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar Peleador");
            System.out.println("2. Listar Peleadores");
            System.out.println("3. Generar y mostrar duelos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> registrarPeleador();
                case 2 -> listarPeleadores();
                case 3 -> generarDuelos();
                case 4 -> salir = true;
                default -> System.out.println("Opcion invalida");
            }
        }
    }

    private static void crearPeleadoresDBZ() {
        peleadores.add(new Peleador(
                "Goku",
                LocalDate.of(737, 4, 16),
                "Planeta Vegeta",
                7,
                "extraterrestre",
                Arrays.asList("Volar", "Aumento de poder", "Sentido de Ki", "Transformación"),
                900000
        ));

        peleadores.add(new Peleador(
                "Vegeta",
                LocalDate.of(732, 8, 5),
                "Planeta Vegeta",
                7,
                "extraterrestre",
                Arrays.asList("Volar", "Aumento de poder", "Sentido de Ki", "Transformación"),
                850000
        ));

        peleadores.add(new Peleador(
                "Piccolo",
                LocalDate.of(728, 3, 21),
                "Planeta Namek",
                7,
                "extraterrestre",
                Arrays.asList("Volar", "Aumento de poder", "Sentido de Ki"),
                700000
        ));

        peleadores.add(new Peleador(
                "Gohan",
                LocalDate.of(757, 5, 20),
                "Tierra",
                7,
                "terrestre",
                Arrays.asList("Volar", "Aumento de poder", "Sentido de Ki", "Transformación"),
                750000
        ));

        peleadores.add(new Peleador(
                "Trunks",
                LocalDate.of(766, 3, 1),
                "Tierra",
                7,
                "terrestre",
                Arrays.asList("Volar", "Aumento de poder", "Sentido de Ki", "Transformación"),
                600000
        ));

        peleadores.add(new Peleador(
                "Frieza",
                LocalDate.of(736, 12, 3),
                "Planeta Freezer",
                7,
                "extraterrestre",
                Arrays.asList("Volar", "Aumento de poder", "Transformación"),
                950000
        ));

        peleadores.add(new Peleador(
                "Cell",
                LocalDate.of(756, 1, 1),
                "Planeta Tierra",
                7,
                "extraterrestre",
                Arrays.asList("Volar", "Aumento de poder", "Transformación"),
                980000
        ));

        peleadores.add(new Peleador(
                "Majin Buu",
                LocalDate.of(737, 9, 1),
                "Planeta Buu",
                7,
                "extraterrestre",
                Arrays.asList("Volar", "Aumento de poder", "Transformación"),
                1000000
        ));
    }

    private static void registrarPeleador() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());
        System.out.print("Planeta de origen: ");
        String planeta = scanner.nextLine();
        System.out.print("Universo (1-12): ");
        int universo = Integer.parseInt(scanner.nextLine());
        System.out.print("Raza (terrestre/extraterrestre): ");
        String raza = scanner.nextLine();
        System.out.print("Tecnicas (separadas por coma): ");
        List<String> tecnicas = Arrays.asList(scanner.nextLine().split(","));
        System.out.print("Nivel de poder (0-1000000): ");
        int nivelPoder = Integer.parseInt(scanner.nextLine());

        Peleador p = new Peleador(nombre, fecha, planeta, universo, raza, tecnicas, nivelPoder);
        peleadores.add(p);
        System.out.println("Peleador registrado correctamente!");
    }

    private static void listarPeleadores() {
        peleadores.forEach(System.out::println);
    }

    private static void generarDuelos() {
        if (peleadores.size() < 8) {
            System.out.println("Se necesitan al menos 8 peleadores para generar duelos.");
            return;
        }
        duelos.clear();
        Collections.shuffle(peleadores);
        for (int i = 0; i < 8; i += 2) {
            Duelo d = new Duelo(
                    peleadores.get(i),
                    peleadores.get(i + 1),
                    LocalDateTime.now().plusDays(new Random().nextInt(30))
                            .plusHours(new Random().nextInt(24))
            );
            duelos.add(d);
        }
        duelos.forEach(System.out::println);
    }
}
