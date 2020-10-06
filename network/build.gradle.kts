plugins {
	id(Plugins.ANDROID_LIBRARY)
	id(Plugins.KOTLIN_ANDROID)
	id(Plugins.APOLLO_ANDROID).version(Versions.apollo)
}

android {
	compileSdkVersion(29)
	buildToolsVersion = "29.0.3"

	defaultConfig {
		minSdkVersion(23)
		targetSdkVersion(29)
		versionCode = 1
		versionName = "1.0"
	}

	buildTypes {
		getByName("release") {
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

	tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
		kotlinOptions.jvmTarget = "1.8"
		kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
	}

	kotlinOptions {
		jvmTarget = "1.8"
		useIR = true
	}
}

apollo {
	generateKotlinModels.set(true)
}

dependencies {
	implementation(Dependencies.kotlin)
	implementation(Dependencies.coroutines)

	implementation(Dependencies.Apollo.runtime)
	implementation(Dependencies.Apollo.coroutines)
}