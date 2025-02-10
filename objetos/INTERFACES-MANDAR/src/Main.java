public class Main {
    public static void main(String[] args) {
        Cancion WannaPlay = new Cancion ("Wanna Play?", "The Prophet", "Hardcore");
        Cancion BigBoys = new Cancion("Big Boys Don't Cry", "The Prophet", "Early Hardcore");
        Cancion Apocalypse = new Cancion("Apocalypse Now", "DJ Davie", "Early Hardcore");

        AlmacenMusica almacenMusica = new AlmacenMusica();

        almacenMusica.addCancion(Apocalypse);
        almacenMusica.addCancion(BigBoys);
        almacenMusica.addCancion(WannaPlay);
        almacenMusica.updateCancion(WannaPlay, "Wanna Play Terror", "The Prophet", "Hardcore");
        almacenMusica.deleteCancion(BigBoys);
        almacenMusica.imprimir();
    }
}