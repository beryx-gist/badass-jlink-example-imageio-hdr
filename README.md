## Badass JLink Plugin Example ImageIO/HDR ##

This example project shows how to use [TwelveMonkeys/ImageIO](https://github.com/haraldk/TwelveMonkeys) with the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin/) in order to create a custom runtime image and a platform-specific installer for an application that displays an HDR image.

### Usage
**Running with gradle:**
```
./gradlew run
```

**Creating and executing a custom runtime image:**
```
./gradlew jlink

./build/image/bin/imageio
```


**Creating a package (a platform-specific installer):**

```
./gradlew jpackage
```

The package will be created in the directory `build/jpackage`
