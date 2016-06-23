### Google Dagger 2
##### Fully static, compile-time dependency injection framework for both Java and Android.

#### Configuration
###### build.gradle project level

``` groovy
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.2.0-alpha3'
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}
```

###### build.gradle application module level

``` groovy
apply plugin: 'com.neenbedankt.android-apt'

dependencies {
    ...
    compile 'com.google.dagger:dagger:2.5'
    apt 'com.google.dagger:dagger-compiler:2.5'
}
```