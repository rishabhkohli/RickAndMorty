object Dependencies {
	const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

	const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
	const val coroutinesPlayServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}"

	const val material = "com.google.android.material:material:${Versions.material}"

	const val coil = "io.coil-kt:coil:${Versions.coil}"

	object Apollo {
		const val runtime = "com.apollographql.apollo:apollo-runtime:${Versions.apollo}"
		const val coroutines = "com.apollographql.apollo:apollo-coroutines-support:${Versions.apollo}"
	}

	object Dagger {
		const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
		const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"

		object Android {
			const val dagger = "com.google.dagger:dagger-android:${Versions.dagger}"
			const val support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
			const val compiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
		}

		object Hilt {
			const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
			const val compiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
		}
	}

	object AndroidX {
		const val annotations = "androidx.annotation:annotation:${Versions.AndroidX.annotations}"
		const val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
		const val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
		const val fragment = "androidx.fragment:fragment-ktx:${Versions.AndroidX.fragment}"
		const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
		const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifecycle}"
		const val lifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.AndroidX.lifecycle}"

		object Hilt {
			const val hilt = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.AndroidX.hilt}"
			const val compiler = "androidx.hilt:hilt-compiler:${Versions.AndroidX.hilt}"
		}
	}
}