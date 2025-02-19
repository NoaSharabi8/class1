pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
<<<<<<< HEAD
=======

>>>>>>> 3d83391 (Initial commit)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
<<<<<<< HEAD
=======
        //maven { url 'https://jitpack.io' }
>>>>>>> 3d83391 (Initial commit)
    }
}

rootProject.name = "class1"
include(":app")
include(":ColorsPaletteLib")
