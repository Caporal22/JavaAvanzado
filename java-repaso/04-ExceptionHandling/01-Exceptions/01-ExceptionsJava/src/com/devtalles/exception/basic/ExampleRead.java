package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Excepción personalizada enfocada en procesos de lectura y transformación de archivos.
 * Permite lanzar errores semánticamente significativos dentro del dominio de negocio.
 */
class DataSourceReadException extends RuntimeException {
    public DataSourceReadException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExampleRead {

    private static final Logger LOGGER = Logger.getLogger(ExampleRead.class.getName());

    public static void main(String[] args) {
        String filePath = "src/introduction/records.txt";

        try {
            List<String> result = processFile(filePath);
            LOGGER.info("Lectura completada. Líneas procesadas: " + result.size());
            result.forEach(line -> LOGGER.info("Procesado -> " + line));
        } catch (DataSourceReadException ex) {
            LOGGER.log(Level.SEVERE, "Error crítico durante la operación de lectura", ex);
        }
    }

    /**
     * Procesa un archivo de manera robusta.
     * Implementa validaciones, lectura segura de recursos y una fase de transformación sobre el contenido.
     *
     * @param path Ruta del archivo a procesar
     * @return Lista de líneas transformadas
     * @throws DataSourceReadException Si existe cualquier falla en apertura o lectura
     */
    private static List<String> processFile(String path) {

        validatePath(path);
        validateExistence(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            return reader.lines()
                    .filter(line -> !line.isBlank())      // Se descartan líneas vacías
                    .map(String::trim)                    // Se limpia el contenido
                    .map(String::toUpperCase)             // Se transforma el texto para análisis uniforme
                    .toList();

        } catch (IOException e) {
            throw new DataSourceReadException("Error al leer el archivo solicitado", e);
        }
    }

    /**
     * Verifica que la ruta no sea nula ni vacía antes de proceder.
     */
    private static void validatePath(String path) {
        if (path == null || path.isBlank()) {
            throw new DataSourceReadException("La ruta proporcionada es inválida o inexistente", null);
        }
    }

    /**
     * Comprueba la existencia del archivo en el sistema antes de abrirlo.
     */
    private static void validateExistence(String path) {
        if (!Files.exists(Path.of(path))) {
            throw new DataSourceReadException("El archivo especificado no existe en el sistema", null);
        }
    }
}
