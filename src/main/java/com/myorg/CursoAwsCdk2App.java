package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class CursoAwsCdk2App {
    public static void main(final String[] args) {
        App app = new App();

        new VpcStack(app, "Vpc");
        app.synth();
    }
}
