package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

    private static Connection conn;
    private static Statement st;

    // Ajusta con la URL, usuario y pass de tu instancia de PostgreSQL
    public static final String URLPostgre = "jdbc:postgresql://disney.cnanbt27k03l.us-east-1.rds.amazonaws.com:5432/postgres";
    public static final String USERPostgre = "postgres";
    public static final String PASSPostgre = "Ganadores2025";

    // Conexión a la base de datos
    public static void connect() {
        try {
            Properties properties = new Properties();
            properties.setProperty("user", USERPostgre);
            properties.setProperty("password", PASSPostgre);
            properties.setProperty("ssl", "false");

            conn = DriverManager.getConnection(URLPostgre, properties);

            if (conn != null) {
                System.out.println("✅ Conexión exitosa a PostgreSQL!");
            }
        } catch (Exception e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Lista de películas
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        // Conectamos a la base de datos
        connect();

        try {
            st = conn.createStatement();

            // Consulta con JOIN para recoger datos de la tabla "pelicula" y "genero"
            // Ajusta los nombres de columna si tu tabla difiere.
            String query =
                    "SELECT p.id, p.nombre AS titulo, p.director, p.\"año\" AS anio, "
                            + "g.id AS genero_id, g.nombre AS genero_nombre, g.descripcion AS genero_desc "
                            + "FROM pelicula p "
                            + "JOIN genero g ON p.genero_id = g.id "
                            + "ORDER BY p.id;";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int peliId = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String director = rs.getString("director");
                int anio = rs.getInt("anio");

                // Creamos objeto Genero con los datos que vienen de la consulta
                int generoId = rs.getInt("genero_id");
                String generoNombre = rs.getString("genero_nombre");
                String generoDesc = rs.getString("genero_desc");
                Genero generoObj = new Genero(generoId, generoNombre, generoDesc);

                // Armamos el objeto Pelicula con su Genero
                Pelicula peli = new Pelicula(peliId, titulo, director, anio, generoObj);
                peliculas.add(peli);
            }

            // Mostramos los resultados
            System.out.println("\n🎬 Lista de Películas con Género (Objeto Genero):");
            for (Pelicula p : peliculas) {
                System.out.println(p);
            }

            // Cerrar recursos
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("❌ Error en la consulta: " + ex.getMessage());
            throw new RuntimeException(ex);
        }
    }
}
