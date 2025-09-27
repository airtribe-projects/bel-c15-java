package org.example;

import java.io.File;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class ClassLoaderDemo {

    public static void main(String[] args) {
        System.out.println("=== Class Loader Hierarchy ===\n");

        // Check which class loader loads each class
        printClassLoader("java.lang.String");             // Bootstrap
        printClassLoader("javax.crypto.Cipher");          // Extension
        printClassLoader("ClassLoaderDemo");              // Application
        printClassLoader("java.sql.Driver");  // Usually loaded by PlatformClassLoader
        printClassLoader("javax.annotation.processing.Processor"); // Also typically platform


        System.out.println("\n=== Class Loader Paths ===\n");

        // Print Bootstrap ClassLoader classpath
        printBootstrapClasspath();

        // Print Extension ClassLoader classpath
        printExtensionClasspath();

        // Print Application ClassLoader classpath
        printApplicationClasspath();

        System.out.println("\n=== Class Loader Hierarchy ===\n");

        // Print class loader hierarchy
        printClassLoaderHierarchy();
    }

    private static void printClassLoader(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            ClassLoader loader = clazz.getClassLoader();

            System.out.println("Class: " + className);
            if (loader == null) {
                System.out.println("  ➤ Loaded by: Bootstrap ClassLoader");
            } else {
                System.out.println("  ➤ Loaded by: " + loader.getClass().getName());
            }
            System.out.println();
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load class: " + className);
        }
    }

    private static void printBootstrapClasspath() {
        System.out.println("Bootstrap ClassLoader loads from (Modules in jrt:/):");
        try {
            FileSystem fs = FileSystems.getFileSystem(URI.create("jrt:/"));
            Path modules = fs.getPath("/modules");
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(modules)) {
                for (Path module : stream) {
                    System.out.println("  - jrt:/" + module.getFileName());
                }
            }
        } catch (Exception e) {
            System.out.println("  - Could not access jrt:/ filesystem: " + e.getMessage());
        }
        System.out.println();
    }


    private static void printExtensionClasspath() {
        System.out.println("Extension ClassLoader loads from:");

        String javaVersion = System.getProperty("java.version");
        boolean isJava9OrAbove = javaVersion.startsWith("9") || javaVersion.startsWith("1.") == false && Integer.parseInt(javaVersion.split("\\.")[0]) >= 9;

        if (isJava9OrAbove) {
            printPlatformModules();
            System.out.println("  - Not available (Extension ClassLoader removed in Java 9+)");
        } else {
            String extDirs = System.getProperty("java.ext.dirs");
            if (extDirs != null) {
                for (String path : extDirs.split(File.pathSeparator)) {
                    System.out.println("  - " + path);
                }
            } else {
                System.out.println("  - Not available");
            }
        }
        System.out.println();
    }

    private static void printPlatformModules() {
        ModuleLayer bootLayer = ModuleLayer.boot();

        System.out.println("Modules in the boot layer (Platform ClassLoader):");
        bootLayer.modules().stream()
            .sorted((m1, m2) -> m1.getName().compareTo(m2.getName()))
            .forEach(module -> System.out.println("  - " + module.getName()));
    }

    private static void printApplicationClasspath() {
        System.out.println("Application ClassLoader loads from:");
        String classpath = System.getProperty("java.class.path");
        if (classpath != null) {
            for (String path : classpath.split(":")) {
                System.out.println("  - " + path);
            }
        } else {
            System.out.println("  - Not available");
        }
        System.out.println();
    }

    private static void printClassLoaderHierarchy() {
        ClassLoader cl = ClassLoader.getSystemClassLoader(); // AppClassLoader
        while (cl != null) {
            System.out.println("ClassLoader: " + cl.getClass().getName());
            cl = cl.getParent();
        }
        System.out.println("Reached Bootstrap ClassLoader (null)");
    }
}
