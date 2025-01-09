plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}
android {
    namespace = "com.example.frontend_compose1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.frontend_compose1"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

    // Jetpack Compose Activity integration
    implementation ("androidx.activity:activity-compose:1.7.0")

    // Jetpack Compose UI
    implementation ("androidx.compose.ui:ui:1.5.0")
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4) // Ensure to use the latest stable version

    // Jetpack Compose UI Tooling (For debugging and inspecting UI)
    debugImplementation ("androidx.compose.ui:ui-tooling-preview:1.5.0")
    debugImplementation ("androidx.compose.ui:ui-tooling:1.5.0")

    // Jetpack Compose Foundation (Provides core Compose components)
    implementation ("androidx.compose.foundation:foundation:1.5.0")

    // Jetpack Compose Material (Material Design Components for Compose)
    implementation ("androidx.compose.material:material:1.5.0")

    // Jetpack Compose Material Icons (Core icons for Material Design)
    implementation ("androidx.compose.material:material-icons-core:1.5.0")
    implementation ("androidx.compose.material:material-icons-extended:1.5.0")
    debugImplementation(libs.androidx.ui.test.manifest)
}