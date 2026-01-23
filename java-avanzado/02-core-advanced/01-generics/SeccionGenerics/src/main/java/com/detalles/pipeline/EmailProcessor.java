package com.detalles.pipeline;

public class EmailProcessor implements Processor<EmailTask> {

    @Override
    public ProcessingResult process(EmailTask task) {

        if (task.getRecipient() == null || task.getRecipient().isEmpty()) {
            return ProcessingResult.failure("Recipient is required");
        }

        // Simulación de envío
        System.out.println("Sending email to " + task.getRecipient());
        System.out.println("Message: " + task.getMessage());

        return ProcessingResult.success("Email sent successfully");
    }
}
