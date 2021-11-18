package edu.matkosoric.class_.design.thermometer;

public class ThermometerSensor extends Thermometer {

    public float getVal() {
        return 0f;
    }


    // alternative implementations do not compile

//    public long getVal() {
//        return 2L;
//    }
//
//    public int getVal () {
//        return 3;
//    }
//
//    public Integer getVal () {
//        return 4;
//    }
//
//    public Float getVal() {
//        return 0f;
//    }

    public static void main(String[] args) {
        ThermometerSensor test = new ThermometerSensor();
        float f = test.getVal();
        System.out.println(f + test.getVal());
    }

}
