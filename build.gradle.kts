buildscript {
    dependencies {
        classpath(libs.google.services)

    }
    dependencies {

        //implementation(platform("com.google.firebase:firebase-bom:32.8.1"))
        //implementation("com.google.firebase:firebase-auth")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
}