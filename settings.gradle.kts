include(":App")
include(":DependencyInjection")

include(":Entities")

listOf(
    "Order",
    "Product",
    "User"
).forEach {
    include(":$it")
    val useCase = "${it}UseCase"
    if (File("$rootDir/$it/$useCase").exists()) {
        include(":$useCase")
        project(":$useCase").projectDir = File(rootDir, "${it}/$useCase")
    }
    val repository = "${it}Repository"
    if (File("$rootDir/$it/$repository").exists()) {
        include(":$repository")
        project(":$repository").projectDir = File(rootDir, "${it}/$repository")
    }
}

include(":Tracker")
