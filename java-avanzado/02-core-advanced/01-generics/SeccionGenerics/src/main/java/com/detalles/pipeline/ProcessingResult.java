package com.detalles.pipeline;

public class ProcessingResult {

    private final boolean success;
    private final String detail;

    private ProcessingResult(boolean success, String detail) {
        this.success = success;
        this.detail = detail;
    }

    public static ProcessingResult success(String detail) {
        return new ProcessingResult(true, detail);
    }

    public static ProcessingResult failure(String detail) {
        return new ProcessingResult(false, detail);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getDetail() {
        return detail;
    }
}
