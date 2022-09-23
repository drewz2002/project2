package com.csc205.project2;

import org.junit.jupiter.api.*;

class ShapeTest {

    ThreeDimensionalShape cube = new Cube(3.0);
    ThreeDimensionalShape sphere = new Sphere(6.0);
    ThreeDimensionalShape cylinder = new Cylinder(3.0,5.0);
    ThreeDimensionalShape cone = new Cone(5.0, 3.0);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Cube Surface Area")
    void cubeSurfaceArea() {
        double actual = cube.surfaceArea();
        double expected = 54.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cube Volume")
    void cubeVolume() {
        double actual = cube.volume();
        double expected = 27.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sphere Surface Area")
    void sphereSurfaceArea() {
        double actual = sphere.surfaceArea();
        double expected = 452.3893421169302;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sphere Volume")
    void sphereVolume() {
        double actual = sphere.volume();
        double expected = 904.7786842338603;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cylinder Surface Area")
    void cylinderSurfaceArea() {
        double actual = cylinder.surfaceArea();
        double expected = 150.79644737231007;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cylinder Volume")
    void cylinderVolume() {
        double actual = cylinder.volume();
        double expected = 141.3716694115407;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cone Surface Area")
    void coneSurfaceArea() {
        double actual = cone.surfaceArea();
        double expected = 314.1592653589793;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Cone Volume")
    void coneVolume() {
        double actual = cone.volume();
        double expected = 78.53981633974483;
        Assertions.assertEquals(expected, actual);
    }

}
