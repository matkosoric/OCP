package edu.matkosoric.class_.design.enums.weather;

import java.io.Serializable;

public class Weather {

    // enum constructor compiles only with private scope

    enum WeatherType implements Serializable {

        SUNNY("Sunnny"),
        RAINING("Raining"),
        SNOWING(" Snowing");

        String description;

        private WeatherType(String description) {
            this.description = description;
        }

    }

//    // Does not compile
//    enum WeatherType2 implements Serializable {
//
//        SUNNY("Sunnny"),
//        RAINING ("Raining"),
//        SNOWING (" Snowing");
//
//        String description;
//
//        public WeatherType2 (String description) {
//            this.description = description;
//        }
//
//    }


//    // Does not compile
//    enum WeatherType3 implements Serializable {
//
//        SUNNY("Sunnny"),
//        RAINING ("Raining"),
//        SNOWING (" Snowing");
//
//        String description;
//
//        protected WeatherType3 (String description) {
//            this.description = description;
//        }
//
//    }

//    // Does not compile
//    enum WeatherType3 implements Serializable {
//
//        SUNNY("Sunnny"),
//        RAINING ("Raining"),
//        SNOWING (" Snowing");
//
//        String description;
//
//        package WeatherType3 (String description) {
//            this.description = description;
//        }
//
//    }


}



