import dependency.Androidx.ANDROIDX_ACTIVITY_KTX_VERSION
import dependency.Androidx.ANDROIDX_CORE_KTX_VERSION
import dependency.Androidx.APPCOMPAT_VERSION
import dependency.Compose.ANDROIDX_ACTIVITY_COMPOSE_VERSION
import dependency.Compose.COMPOSE_VERSION

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

version = "1.0"

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "drawer"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":cakom"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.activity:activity-compose:${ANDROIDX_ACTIVITY_COMPOSE_VERSION}")
                implementation("androidx.appcompat:appcompat:${APPCOMPAT_VERSION}")
                implementation("androidx.activity:activity-ktx:${ANDROIDX_ACTIVITY_KTX_VERSION}")
                implementation("androidx.core:core-ktx:${ANDROIDX_CORE_KTX_VERSION}")

                implementation("androidx.compose.runtime:runtime:${COMPOSE_VERSION}")
                implementation("androidx.compose.ui:ui:${COMPOSE_VERSION}")
                implementation("androidx.compose.foundation:foundation:${COMPOSE_VERSION}")
                implementation("androidx.compose.foundation:foundation-layout:${COMPOSE_VERSION}")
                implementation("androidx.compose.material:material:$COMPOSE_VERSION")
            }
        }
        val androidTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    compileSdk = 31
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 23
        targetSdk = 31
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = COMPOSE_VERSION
    }
}