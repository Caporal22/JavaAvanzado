package com.devtalles.exception.autocloseable;

public class FakeDataBaseConnection implements AutoCloseable{

    public FakeDataBaseConnection() {
        System.out.println("Conection established");
    }

    public void fetchData(){
        System.out.println("Fetching Data to Database");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing FakeDataBaseConnection");
    }
}
