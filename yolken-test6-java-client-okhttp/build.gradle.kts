plugins {
    id("yolken-test6.kotlin")
    id("yolken-test6.publish")
}

dependencies {
    api(project(":yolken-test6-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
}
