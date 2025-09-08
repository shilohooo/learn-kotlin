# Kotlin Learning Notes

> https://kotlin.liying-cn.net/

- Kotlin 2.2.0
- Gradle 8.14.3
- OpenJDK 17 (zulu)

This project uses [Gradle](https://gradle.org/).
To build and run the application, use the *Gradle* tool window by clicking the Gradle icon in the right-hand toolbar,
or run it directly from the terminal:

* Run `./gradlew run` to build and run the application.
* Run `./gradlew build` to only build the application.
* Run `./gradlew check` to run all checks, including tests.
* Run `./gradlew clean` to clean all build outputs.

Note the usage of the Gradle Wrapper (`./gradlew`).
This is the suggested way to use Gradle in production projects.

[Learn more about the Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html).

[Learn more about Gradle tasks](https://docs.gradle.org/current/userguide/command_line_interface.html#common_tasks).

This project follows the suggested multi-module setup and consists of the `app` and `utils` subprojects.
The shared build logic was extracted to a convention plugin located in `buildSrc`.

This project uses a version catalog (see `gradle/libs.versions.toml`) to declare and version dependencies
and both a build cache and a configuration cache (see `gradle.properties`).

## Modules

### Beginner

|              Directory               |                                Description                                 |
|:------------------------------------:|:--------------------------------------------------------------------------:|
|     [hello-world](./hello-world)     |  [Hello World](https://kotlin.liying-cn.net/kotlin-tour-hello-world.html)  |
|        [variable](./variable)        |                                  Variable                                  |
| [basic-data-type](./basic-data-type) |  [Basic Types](https://kotlin.liying-cn.net/kotlin-tour-basic-types.html)  |
|      [collection](./collection)      |  [Collections](https://kotlin.liying-cn.net/kotlin-tour-collections.html)  |
|    [control-flow](./control-flow)    | [Control Flow](https://kotlin.liying-cn.net/kotlin-tour-control-flow.html) |
|        [function](./function)        |    [Functions](https://kotlin.liying-cn.net/kotlin-tour-functions.html)    |
| [string-template](./string-template) |                              String Template                               |

### Intermediate

|                  Directory                   |                                              Description                                              |
|:--------------------------------------------:|:-----------------------------------------------------------------------------------------------------:|
| [extension-functions](./extension-functions) | [Extension Functions](https://kotlin.liying-cn.net/kotlin-tour-intermediate-extension-functions.html) |
|      [scope-function](./scope-function)      |     [Scope Function](https://kotlin.liying-cn.net/kotlin-tour-intermediate-scope-functions.html)      |

