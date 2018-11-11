import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.0"
}

group = "top.kiswich"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("stdlib-jdk8"))
    compile("com.alibaba","easyexcel","1.1.1")
    compileOnly("org.projectlombok","lombok","1.18.4")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<JavaCompile>{
    options.encoding = "UTF-8"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

