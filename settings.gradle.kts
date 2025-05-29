plugins {
    id("com.gradle.develocity") version("4.0.1")
}

rootProject.name = "advent-of-code-2023"

include("aoc2023")
include("aoc2023:aoc2023-java")
include("aoc2023:aoc2023-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
