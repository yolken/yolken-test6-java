plugins {
    id("yolken-test6.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":yolken-test6-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :yolken-test6-java-example:run` to run `Main`
    // Use `./gradlew :yolken-test6-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.configure_me_yolken_test6.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
