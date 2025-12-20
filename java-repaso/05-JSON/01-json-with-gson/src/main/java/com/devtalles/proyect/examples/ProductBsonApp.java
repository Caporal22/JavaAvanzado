package com.tuusuario.bsondemo;

import org.bson.*;
import org.bson.codecs.BsonDocumentCodec;
import org.bson.codecs.DecoderContext;
import org.bson.io.BasicOutputBuffer;
import org.bson.io.ByteBufNIO;
import org.bson.io.ByteBufferBsonInput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

/**
 * Example: BSON persistence for product data
 */
public class ProductBsonApp {

    private static final String FILE_PATH = "data/products.bson";

    public static void main(String[] args) {

        try {
            BsonDocument product = buildProduct();

            writeToDisk(product, FILE_PATH);
            System.out.println("✔ Producto guardado en BSON");

            BsonDocument restored = readFromDisk(FILE_PATH);
            System.out.println("📄 Producto cargado:");
            System.out.println(restored.toJson());

        } catch (IOException e) {
            System.err.println("Error procesando archivo BSON");
            e.printStackTrace();
        }
    }

    /**
     * Crea un documento BSON de producto
     */
    private static BsonDocument buildProduct() {
        return new BsonDocument()
                .append("sku", new BsonString("PRD-1001"))
                .append("name", new BsonString("Mechanical Keyboard"))
                .append("price", new BsonDouble(129.99))
                .append("stock", new BsonInt32(25))
                .append("tags", new BsonArray()
                        .add(new BsonString("hardware"))
                        .add(new BsonString("gaming"))
                        .add(new BsonString("java-demo"))
                )
                .append("createdAt", new BsonDateTime(Instant.now().toEpochMilli()));
    }

    /**
     * Escribe un BsonDocument en un archivo
     */
    private static void writeToDisk(BsonDocument document, String filePath) throws IOException {
        Path path = Path.of(filePath);
        Files.createDirectories(path.getParent());

        BasicOutputBuffer buffer = new BasicOutputBuffer();
        BsonBinaryWriter writer = new BsonBinaryWriter(buffer);

        new BsonDocumentCodec().encode(
                writer,
                document,
                org.bson.codecs.EncoderContext.builder().build()
        );

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(buffer.toByteArray());
        }
    }

    /**
     * Lee un BsonDocument desde un archivo
     */
    private static BsonDocument readFromDisk(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of(filePath));

        ByteBufNIO byteBuf = new ByteBufNIO(ByteBuffer.wrap(bytes));
        ByteBufferBsonInput input = new ByteBufferBsonInput(byteBuf);
        BsonBinaryReader reader = new BsonBinaryReader(input);

        return new BsonDocumentCodec().decode(
                reader,
                DecoderContext.builder().build()
        );
    }
}
