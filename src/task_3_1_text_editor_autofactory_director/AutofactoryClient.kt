package task_3_1_text_editor_autofactory_director

class AutofactoryClient {

    init {
        val director = AutofactoryDirector.getInstance()

        val carBuilderConcrete = CarBuilderConcrete()

        director.createSedanCar(carBuilderConcrete)
        val sedanCar = carBuilderConcrete.build()
        println(sedanCar)

        director.createUniversalCar(carBuilderConcrete)
        val universalCar = carBuilderConcrete.build()
        println(universalCar)
    }

}

fun main(){
    AutofactoryClient()
}