package com.detalles.pipeline;

public class Main {

    public static void main(String[] args) {

        EmailTask task = new EmailTask(
                "daniel@mail.com",
                "Welcome to the platform!"
        );

        Processor<EmailTask> processor = new EmailProcessor();
        ProcessingResult result = processor.process(task);

        if (result.isSuccess()) {
            System.out.println("SUCCESS: " + result.getDetail());
        } else {
            System.out.println("ERROR: " + result.getDetail());
        }
    }
}
