include(":App")
include(":DependencyInjection")

include(":Entities")

listOf(
    "Order",
    "Product",
    "User"
).forEach {
    include(":${it}UseCase")
    project(":${it}UseCase").projectDir = File(rootDir, "${it}/${it}UseCase")
}

listOf(
    "Order",
    "Product",
    "User"
).forEach {
    include(":${it}Repository")
    project(":${it}Repository").projectDir = File(rootDir, "${it}/${it}Repository")
}
