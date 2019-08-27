include(":App")
include(":DependencyInjection")

include(":Entities")

listOf(
    "OrderUseCase",
    "ProductUseCase",
    "UserUseCase"
).forEach {
    include(":$it")
    project(":$it").projectDir = File(rootDir, "UseCases/$it")
}

listOf(
    "OrderRepository",
    "ProductRepository",
    "UserRepository"
).forEach {
    include(":$it")
    project(":$it").projectDir = File(rootDir, "Repositories/$it")
}
