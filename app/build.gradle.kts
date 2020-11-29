plugins {
	id(Plugins.ANDROID_APPLICATION)
	id(Plugins.KOTLIN_ANDROID)
}

android {
	compileSdkVersion(30)

	defaultConfig {
		applicationId = "com.rickandmorty"
		minSdkVersion(23)
		targetSdkVersion(30)
		versionCode = 1
		versionName = "1.0"
	}

	buildTypes {
		getByName("release")  {
			isMinifyEnabled = false
			proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}

	tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
		kotlinOptions.jvmTarget = "1.8"
		kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
	}

	kotlinOptions {
		jvmTarget = "1.8"
		useIR = true
	}

	buildFeatures {
		compose = true
		viewBinding = true
	}

	composeOptions {
		kotlinCompilerExtensionVersion = Versions.compose
		kotlinCompilerVersion = "1.4.0"
	}
}

dependencies {

	implementation(Dependencies.kotlin)
	implementation(Dependencies.coroutines)

	implementation(Dependencies.AndroidX.appcompat)
	implementation(Dependencies.AndroidX.core)
	implementation(Dependencies.AndroidX.fragment)
	implementation(Dependencies.AndroidX.lifecycle)
	implementation(Dependencies.AndroidX.viewmodel)
	implementation(Dependencies.AndroidX.lifecycleCommonJava8)

	implementation(Dependencies.AndroidX.Navigation.fragment)
	implementation(Dependencies.AndroidX.Navigation.ui)

	implementation(Dependencies.material)

	implementation(project(Modules.network))

	implementation("androidx.compose.ui:ui:${Versions.compose}")
	implementation("androidx.compose.material:material:${Versions.compose}")
	implementation("androidx.ui:ui-tooling:${Versions.compose}")
}