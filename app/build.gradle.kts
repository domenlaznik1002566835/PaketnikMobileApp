plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.paketnikapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.paketnikapp"
        minSdk = 30
        targetSdk = 33
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
        // Enabling core library desugaring
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/native-image/org.mongodb/bson/native-image.properties"
        }
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.ui:ui")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("org.mongodb:mongodb-driver-sync:5.1.0") {
        exclude(group = "org.mongodb", module = "bson-record-codec")
    }
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.activity:activity:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.6.7")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.material3:material3-window-size-class")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.1")
    implementation("androidx.compose.runtime:runtime-livedata")
    implementation("androidx.compose.runtime:runtime-rxjava2")
    implementation("com.journeyapps:zxing-android-embedded:4.3.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.zxing:core:3.5.3")
    implementation("org.json:json:20240303")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    implementation("io.coil-kt:coil-compose:1.3.2")

    // Api
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    // Video and image
    implementation ("androidx.camera:camera-core:1.3.3")
    implementation ("androidx.camera:camera-camera2:1.3.3")
    implementation ("androidx.camera:camera-core:1.3.3")
    implementation ("androidx.camera:camera-camera2:1.3.3")
    implementation ("androidx.camera:camera-lifecycle:1.3.3")
    implementation ("androidx.camera:camera-video:1.3.3")
    implementation ("androidx.camera:camera-view:1.3.3")


    // Glide for image handling
    implementation("com.github.bumptech.glide:glide:4.11.0")

}
