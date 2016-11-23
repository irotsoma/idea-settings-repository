#parse("File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import tornadofx.${viewType}
#if (${initType} == "builder")import tornadofx.${rootType.toLowerCase()}#else import ${fqRootType}#end


class ${NAME} : ${viewType}("My View") {
	#if (${initType} == "builder")
    override val root = ${rootType.toLowerCase()} {

    }
    #else
	override val root = ${rootType}()

	init {

	}
    #end
}
