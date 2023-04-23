package task_3_1_text_editor_autofactory_director

class AutofactoryDirector {
    companion object {
        fun createSedanCar(builder: CarBuilder): CarResult {
            return builder
                    .createBodyColor(color = CarColor.BLACK)
                    .createBodyType(type = BodyType.SEDAN)
                    .createEngine(engine = EngineBuilder().addCapacity(1.0).addFuelType(FuelType.KEROSENE).addPower(228).build())
                    .createWheelRims(rims = WheelRimsType.STAMPED)
                    .build()
        }

        fun createUniversalCar(builder: CarBuilder): CarResult {
            return builder
                    .createBodyColor(color = CarColor.RED)
                    .createBodyType(type = BodyType.UNIVERSAL)
                    .createEngine(engine = EngineBuilder().addCapacity(1.0).addFuelType(FuelType.DIESEL).addPower(1337).build())
                    .createWheelRims(rims = WheelRimsType.CAST)
                    .build()
        }

//        var instance: AutofactoryDirector? = null
//            get() = field ?: run {
//                instance = AutofactoryDirector()
//                instance!!
//            }
//            private set
//
//        fun getInstance(): AutofactoryDirector {
//            return instance ?: run {
//                instance = AutofactoryDirector()
//                instance!!
//            }
//        }
    }
}

