package(default_visibility = ["//visibility:public"])

java_library(
    name = "junit4",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = [
        "@hamcrest_core//jar",
    ],
)
