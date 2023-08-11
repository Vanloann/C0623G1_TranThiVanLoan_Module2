package ss08_cleancode_refactoring.practice;

public class CylinderTest {
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
//        assertEquals(expected, result);
    }


    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
//        assertEquals(expected, result);
    }
}
