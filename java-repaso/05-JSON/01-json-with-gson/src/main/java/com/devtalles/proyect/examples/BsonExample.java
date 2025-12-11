package com.devtalles.proyect.examples;

import org.bson.BsonBinaryWriter;
import org.bson.BsonReader;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWriter;
import org.bson.BsonWriter;
import org.bson.io.BasicOutputBuffer;
import org.bson.io.ByteBufferBsonInput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class BsonExample {

    public static void main(String[] args) {

        try {
            // Create example BSON document
            BsonDocument document = new BsonDocument()
                    .append("id", new org.bson.BsonString("U001"))
                    .append("name", new org.bson.BsonString("Daniel"))
                    .append("age", new org.bson.BsonInt32(25))
                    .append("active", new org.bson.BsonBoolean(true));

            // Serialize to BSON file
            writeBsonToFile(document, "output/user.bson");

            // Deserialize from BSON file
            BsonDocument loaded = readBsonFromFile("output/user.bson");

            // Print reconstructed BSON
            System.out.println("BSON loaded: " + loaded);

        } catch (IOException e) {
            throw new RuntimeException("Error processing BSON file", e);
        }
    }

    private static void writeBsonToFile(BsonDocument document, String filePath) throws IOException {
        Path path = Path.of(filePath);
        Files.createDirectories(path.getParent());

        BasicOutputBuffer buffer = new BasicOutputBuffer();
        BsonWriter writer = new BsonBinaryWriter(buffer);
        BsonDocumentWriter docWriter = new BsonDocumentWriter(document);
        document.encode(writer, org.bson.codecs.BsonDocumentCodec.INSTANCE);

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(buffer.toByteArray());
        }
    }

    private static BsonDocument readBsonFromFile(String filePath) throws IOException {
        byte[] data = Files.readAllBytes(Path.of(filePath));

        ByteBufferBsonInput input = new ByteBufferBsonInput(
                new org.bson.io.ByteBufNIO(java.nio.ByteBuffer.wrap(data))
        );

        BsonReader reader = new org.bson.BsonBinaryReader(input);
        return org.bson.codecs.BsonDocumentCodec.INSTANCE.decode(
                reader,
                org.bson.codecs.DecoderContext.builder().build()
        );
    }
}
