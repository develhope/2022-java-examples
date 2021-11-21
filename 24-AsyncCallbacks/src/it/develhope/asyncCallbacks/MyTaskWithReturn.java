package it.develhope.asyncCallbacks;

import java.util.function.Supplier;

public class MyTaskWithReturn implements Supplier<String> {

    @Override
    public String get() {
        return "The task is finished";
    }
}
