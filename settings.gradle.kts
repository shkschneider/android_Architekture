fun submodules(parent: String? = "", file: File) {
    file.listFiles()
        ?.filter { it.isFile && it.name.endsWith(".gradle") }
        ?.forEach {
            val module = it.parentFile.name
            println(":$module")
            include(":$module")
            if (parent != null) {
                project(":$module").projectDir = File(rootDir, "$parent/$module")
            }
            it.parentFile.listFiles()
                ?.filter { it.isDirectory && !it.name.startsWith(".") }
                ?.forEach {
                    submodules(module, it)
                }
        }
}

rootDir.listFiles()?.forEach {
    submodules(null, it)
}
