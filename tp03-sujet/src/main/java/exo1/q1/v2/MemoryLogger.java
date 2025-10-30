package exo1.q1.v2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryLogger implements Logger {

    private final List<String> logs = new ArrayList<>();

    @Override
    public void log(String message) {
        logs.add(LocalDateTime.now().toString() + " " + message);
    }

    @Override
    public void close() {
        
    }


    public List<String> getLogs() {
        return Collections.unmodifiableList(logs);
    }
}