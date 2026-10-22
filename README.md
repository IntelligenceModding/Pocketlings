# Pocketlings

A Minecraft 1.21.1 mod for NeoForge by DoomedArtemis. This repository currently contains the project foundation; gameplay content is still to come.

## Development

Use JDK 21 or newer to run Gradle. Minecraft and the mod target Java 21.

```powershell
.\gradlew.bat build
.\gradlew.bat runClient
.\gradlew.bat runServer
.\gradlew.bat runData
```

On Linux or macOS, use `./gradlew` instead. `runClientData` is also available as an alias for `runData`, following Common Trades.

Build artifacts are written to `build/libs/`, using the name `pocketlings-<version>-neoforge-mc<minecraft-version>.jar`.

## Project structure

```text
src/main/java/de/artemis/pocketlings/   Mod entry point and Java packages
src/main/resources/META-INF/           NeoForge metadata
src/main/resources/assets/pocketlings/ Client assets and translations
src/generated/resources/              Generated resources (created by runData)
gradle/wrapper/                        Gradle wrapper
.github/workflows/                    Build automation
```

Add packages such as `client`, `config`, `network`, or feature packages under `de.artemis.pocketlings` as features are implemented. Datapack resources belong under `src/main/resources/data/pocketlings/`.

Versions, mod identity, authors, and description are configured in `gradle.properties`. The build expands these properties into `META-INF/neoforge.mods.toml`.

## License

Pocketlings is licensed under the [MIT License](LICENSE). The original NeoForged MDK template notice is retained in [TEMPLATE_LICENSE.txt](TEMPLATE_LICENSE.txt). Both notices are included in the mod jar.
