package exo1.q1.v2;

import java.io.IOException;

public interface Logger {
    abstract void log(String message) throws IOException;    
    abstract void close() throws IOException;
}