import dependency.Androidx.APPCOMPAT_VERSION
import dependency.Compose.ANDROIDX_COMPOSE_MATERIAL_VERSION
import dependency.Compose.ANDROIDX_COMPOSE_NAV_VERSION
import dependency.Compose.COMPOSE_VERSION
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

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = COMPOSE_VERSION
    }
}

dependencies {
    implementation(project(":drawer"))
    implementation(project(":cakom"))
    implementation("com.google.android.material:material:${MATERIAL_VERSION}")

    implementation("androidx.activity:activity-compose:${dependency.Compose.ANDROIDX_ACTIVITY_COMPOSE_VERSION}")
    implementation("androidx.appcompat:appcompat:${APPCOMPAT_VERSION}")
    implementation("androidx.activity:activity-ktx:${dependency.Androidx.ANDROIDX_ACTIVITY_KTX_VERSION}")
    implementation("androidx.core:core-ktx:${dependency.Androidx.ANDROIDX_CORE_KTX_VERSION}")
    implementation("androidx.navigation:navigation-compose:$ANDROIDX_COMPOSE_NAV_VERSION")

    implementation("androidx.compose.material:material-icons-extended:${ANDROIDX_COMPOSE_MATERIAL_VERSION}")
    implementation("androidx.compose.material:material:$ANDROIDX_COMPOSE_MATERIAL_VERSION")
    implementation("androidx.compose.runtime:runtime:${COMPOSE_VERSION}")
    implementation("androidx.compose.ui:ui:${COMPOSE_VERSION}")
    implementation("androidx.compose.foundation:foundation:${COMPOSE_VERSION}")
    implementation("androidx.compose.foundation:foundation-layout:${COMPOSE_VERSION}")
}