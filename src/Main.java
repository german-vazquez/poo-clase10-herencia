import java.nio.file.attribute.UserPrincipalLookupService;

public class Main {
    public static void main(String[] args) {

        SocioHabilitado socioHabilitado= new SocioHabilitado("cosme", "m1", 2000.0, "danza", 200.0, true );
        Socio socio = new Socio("fulano", "m2", 2000.0, "futbol");



        System.out.println(socioHabilitado.calcularCostoMensual());
    }
}
