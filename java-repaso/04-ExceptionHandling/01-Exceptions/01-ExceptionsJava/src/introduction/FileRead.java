package introduction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Excepción personalizada, semántica y empresarial
class FileProcessingException extends RuntimeException {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class FileRead {

    private static final Logger LOGGER = Logger.getLogger(FileRead.class.getName());

    public static void main(String[] args) {
        String path = "src/introduction/example.txt";

        try {
            processFile(path);
            LOGGER.info("Lectura finalizada con éxito ✔");
        } catch (FileProcessingException ex) {
            LOGGER.log(Level.SEVERE, "No se pudo procesar el archivo", ex);
        }
    }

    /**
     * Procesa un archivo línea por línea de manera profesional.
     * try-with-resources garantiza cierre automático del stream.
     */
    private static void processFile(String path) {
        // Validación antes de intentar leer
        if (path == null || path.isBlank()) {
            throw new FileProcessingException("La ruta del archivo está vacía o es inválida", null);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;
            int linesRead = 0;

            while ((line = reader.readLine()) != null) {
                linesRead++;

                final int safeIndex = linesRead;
                final String safeLine = line;

                LOGGER.info(() -> "Línea " + safeIndex + ": " + safeLine);
            }

            if (linesRead == 0) {
                LOGGER.warning("Archivo leído pero está vacío ⚠");
            }

        } catch (IOException e) {
            throw new FileProcessingException("Error al leer el archivo: " + path, e);
        }
    }
}
