package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class CursoAwsCdk2App {
    public static void main(final String[] args) {
        App app = new App();

        VpcStack vpcStack = new VpcStack(app, "Vpc");

        ClusterStack clusterStack = new ClusterStack(app, "Custer", vpcStack.getVpc());
        clusterStack.addDependency(vpcStack);

        CursoAwsCdk2Stack cursoAwsCdk2Stack = new CursoAwsCdk2Stack(app,"Service01",clusterStack.getCluster());
        clusterStack.addDependency(clusterStack);

        app.synth();
    }
}

