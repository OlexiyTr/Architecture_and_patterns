package task_3_1_command

fun main(args: Array<String>) {
    Client()
}

class Client {
    init {
        val kitchenLamp = Lamp("Kitchen")
        val hallLamp = Lamp("Hall")
        val bedroomLamp = Lamp("Bedroom")
        val bathroomLamp = Lamp("Bathroom")

        val controllerKitchenLamp = controller(kitchenLamp)
        val controllerHallLamp = controller(hallLamp)
        val controllerBedroomLamp = controller(bedroomLamp)
        val controllerBathroomLamp = controller(bathroomLamp)
        val controllerUniversal = controllerForGroup(listOf(kitchenLamp, hallLamp, bedroomLamp, bathroomLamp))

        controllerKitchenLamp.on()
        controllerHallLamp.on()
        controllerBedroomLamp.on()
        controllerKitchenLamp.off()
        controllerHallLamp.off()
        controllerBedroomLamp.off()
        controllerBedroomLamp.on()
        controllerBathroomLamp.on()
        controllerUniversal.off()
    }

    private fun controller(lamp: Lamp): Controller {
        val commandOff = CommandOff(lamp)
        val commandOn = CommandOn(lamp)
        val controllerForOne = ControllerForOne()
        controllerForOne.setCommands(commandOn, commandOff)
        return controllerForOne
    }

    private fun controllerForGroup(lamps: List<Lamp>): Controller {
        val commandOn = CommandOnForGroup(lamps)
        val commandOff = CommandOffForGroup(lamps)
        val groupController = GroupController()
        groupController.setCommands(commandOn, commandOff)
        return groupController
    }
}
