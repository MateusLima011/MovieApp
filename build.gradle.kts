// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
}
true // Needed to make the Suppress annotation work for the plugins block

buildscript {
    dependencies{
        classpath ("com.android.tools.build:gradle:7.0.4")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")

        classpath ("com.google.gms:google-services:4.3.10")

        classpath ("com.github.dcendents:android-maven-gradle-plugin:2.0")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
    }
}