plugins {
	`kotlin-dsl`
}

repositories {
	mavenCentral()
}

dependencies {

	// Apollo doesn't compile without this here. https://github.com/apollographql/apollo-android/issues/2886
	implementation("com.squareup.okio:okio:2.9.0")
}