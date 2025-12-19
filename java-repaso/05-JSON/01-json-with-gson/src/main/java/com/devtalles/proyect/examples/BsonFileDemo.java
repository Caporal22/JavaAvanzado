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

/**
 * Demo profesional de lectura y escritura BSON
 * Autor: Tu Nombre
 */
public class BsonFileDemo {

    private static final String OUTPUT_FILE = "data/profile.bson";

    public static void main(String[] args) {

        try {
            BsonDocument profile = createProfileDocument();

            saveBson(profile, OUTPUT_FILE);
            System.out.println("✅ BSON guardado correctamente");

            BsonDocument loadedProfile = loadBson(OUTPUT_FILE);
            System.out.println("📦 BSON cargado desde archivo:");
            System.out.println(loadedProfile.toJson());

        } catch (IOException e) {
            System.err.println("❌ Error trabajando con BSON");
            e.printStackTrace();
        }
    }

    /**
     * Crea un documento BSON de ejemplo
     */
    private static BsonDocument createProfileDocument() {
        return new BsonDocument()
                .append("userId", new BsonString("USR-2025"))
                .append("username", new BsonString("paralelaDev"))
                .append("email", new BsonString("dev@paralela.com"))
                .append("level", new BsonInt32(7))
                .append("verified", new BsonBoolean(true))
                .append("skills", new BsonArray()
                        .add(new BsonString("Java"))
                        .add(new BsonString("BSON"))
                        .add(new BsonString("Concurrent Programming"))
                );
    }

    /**
     * Guarda un BsonDocument en disco
     */
    private static void saveBson(BsonDocument document, String filePath) throws IOException {
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
     * Carga un BsonDocument desde disco
     */
    private static BsonDocument loadBson(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of(filePath));

        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        ByteBufNIO byteBuf = new ByteBufNIO(buffer);
        ByteBufferBsonInput input = new ByteBufferBsonInput(byteBuf);

        BsonBinaryReader reader = new BsonBinaryReader(input);

        return new BsonDocumentCodec().decode(
                reader,
                DecoderContext.builder().build()
        );
    }
}
