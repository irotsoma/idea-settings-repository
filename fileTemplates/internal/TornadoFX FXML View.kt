#parse("File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import ${fqRootType}
import tornadofx.${viewType}


class ${NAME} : ${viewType}("My View") {
	override val root : ${rootType} by fxml()

	init {

	}
}
