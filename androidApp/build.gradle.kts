import dependency.Androidx.APPCOMPAT_VERSION
import dependency.Androidx.CONSTRAINT_LAYOUT_VERSION
import dependency.Google.MATERIAL_VERSION

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "me.lwn.cakom.android"
        minSdk = 23
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":cakom"))
    implementation("com.google.android.material:material:${MATERIAL_VERSION}")
    implementation("androidx.appcompat:appcompat:${APPCOMPAT_VERSION}")
    implementation("androidx.constraintlayout:constraintlayout:${CONSTRAINT_LAYOUT_VERSION}")
}