plugins {
    alias(libs.plugins.android.application)

}

android {
    namespace = "com.example.class1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.class1"
<<<<<<< HEAD
        minSdk = 24
=======
        minSdk = 26
>>>>>>> 3d83391 (Initial commit)
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}



dependencies {
<<<<<<< HEAD

=======
    implementation(project(":ColorsPaletteLib"))
>>>>>>> 3d83391 (Initial commit)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
<<<<<<< HEAD
    //implementation(libs.retrofit)
    //implementation (libs.converter.gson)
    //implementation (libs.converter.gson.v290)
=======
>>>>>>> 3d83391 (Initial commit)

}