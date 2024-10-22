import java.util.*;

public class Main {
    static String block;
    //static List<27> bloquesArray = new ArrayList[27];
    public static void accion(int posición){
        switch (posición){
        }
    }
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.addAll(Arrays.asList("IRON", "BED", "BED_BLOCK", "CACTUS", "BRICK_STAIRS"));
        Scanner lector = new Scanner(System.in);
            String usuario = lector.nextLine();
            if (palabras.contains(usuario)){
                int index = palabras.indexOf(usuario);
                System.out.println("ESTA PALABRA ESTÁ EN LA LISTA y se ejecuta instrucción " + index);
            } else {
                System.out.println("ESTA PALABRA NO ESTA EN LA LISTA");
            }

        }
        //System.out.print(palabras);



       /* if (block == "IRON") {}
        if (block == "BED") {}
        if (block == "BED_BLOCK") {}
        if (block == "CACTUS") {}
        if (block == "BRICK_STAIRS) {}
        if (block =="BIRCH_WOOD_STAIRS) {}
        if (block == "BREWING_STAND) {}
        if (block == "CAKE) {}
        if (block == "CAKE_BLOCK) {}
        if (block == "CAULDRON) {}
        if (block == "CHEST) {}
        if (block == "CLAY) {}
        if (block == "SAND) {}
        if (block == "BURNING_FURNACE) {}
        if (block == "COBBLESTONE_STAIRS) {}
        if (block == "FENCE) {}
        if (block == "FENCE_GATE) {}
        if (block == "FIRE) {}
        if (block == "GRAVEL) {}
        if (block == "IRON_DOOR_BLOCK) {}
        if (block == "IRON_FENCE) {}
        if (block == "IRON_DOOR) {}
        if (block == "LADDER) {}
        if (block == "MELON) {}
        if (block == "LEAVES) {}
        if (block == "LOCKED_CHEST) {}
        if (block == "SANDSTONE_STAIRS) {} */

}
