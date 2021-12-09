package pachet2;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pachet1.MyClass;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    MyClass testClass = new MyClass();

    @Test
    public void PartitionareClaseEchivalenta() throws IOException {

        // c_1111 : (4, 2, {(1 10), (11 13)}, 2,{(2 4), (5 12)})
        testClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.1.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareClaseEchivalenta/expected1.1.txt")),
                FileUtils.readLines(new File("licenta.out")));

        // c_1112 : (7, 2, {(1 10), (11 13)}, 2,{(2 4), (5 12)})
        testClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.2.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareClaseEchivalenta/expected1.2.txt")),
                FileUtils.readLines(new File("licenta.out")));

        // c_112 : (4, 2, {(1 10), (11 13)}, 0, _ )
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.3.in"));

        // c_113 : (4, 2, {(1 10), (11 13)}, 7, _ )
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.4.in"));

        // c_12 : (4, 0, _ , _ , _ )
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.5.in"));

        // c_13 : (4, 7, _ , _ , _ )
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.6.in"));

        // c_2 : (0, _ , _ , _ , _ )
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.7.in"));

        // c_3 : (61, _ , _ , _ , _ )
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareClaseEchivalenta/1.8.in"));
    }

    @Test
    public void ValoriFrontiera() throws IOException {
        testClass.licenta("src/pachet1/ValoriFrontiera/2.1.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.1.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.2.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.2.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.3.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.3.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.4.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.4.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.5.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.5.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.6.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.6.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.7.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.7.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.8.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.8.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.9.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.9.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.10.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.10.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.11.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.11.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.12.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.12.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.13.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.13.txt")),
                FileUtils.readLines(new File("licenta.out")));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/ValoriFrontiera/2.14.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/ValoriFrontiera/2.15.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/ValoriFrontiera/2.16.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/ValoriFrontiera/2.17.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/ValoriFrontiera/2.18.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/ValoriFrontiera/2.19.in"));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.20.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.20.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.21.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.21.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/ValoriFrontiera/2.22.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/ValoriFrontiera/expected2.22.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }

    @Test
    public void PartitionareCategorii() throws IOException {
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.1.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.2.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.3.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.4.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.5.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.6.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.7.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.8.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.9.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.10.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.11.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.12.in"));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.14.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.14.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.15.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.15.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.16.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.16.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.17.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.17.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.18.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.18.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.19.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.19.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.20.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.20.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.21.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.21.txt")),
                FileUtils.readLines(new File("licenta.out")));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.22.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.23.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.24.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.25.in"));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.26.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.26.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.27.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.27.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.28.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.28.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.29.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.29.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.30.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.30.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.31.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.31.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.32.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.32.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.33.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.33.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.34.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.34.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.35.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.35.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.36.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.36.txt")),
                FileUtils.readLines(new File("licenta.out")));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.37.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.38.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.39.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.40.in"));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.41.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.41.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.42.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.42.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.43.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.43.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.44.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.44.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.45.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.45.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.46.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.46.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.47.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.47.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.48.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.48.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.49.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.49.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.50.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.50.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.51.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.51.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.52.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.52.txt")),
                FileUtils.readLines(new File("licenta.out")));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.53.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.54.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.55.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.56.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.57.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.58.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.59.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/PartitionareCategorii/3.60.in"));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.61.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.61.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.62.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.62.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.63.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.63.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.64.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.64.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.65.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.65.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.66.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.66.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.67.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.67.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.68.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.68.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/PartitionareCategorii/3.69.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/PartitionareCategorii/expected3.69.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }

    @Test
    public void AcoperireNivelInstructiune() throws IOException {
        testClass.licenta("src/pachet1/AcoperireInstructiune/4.1.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireInstructiune/expected4.1.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }

    @Test
    public void AcoperireNivelDecizie() throws IOException {
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireDecizie/5.1.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireDecizie/5.2.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireDecizie/5.3.in"));
        testClass.licenta("src/pachet1/AcoperireDecizie/5.4.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireDecizie/expected5.4.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireDecizie/5.5.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireDecizie/expected5.5.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }

    @Test
    public void AcoperireNivelConditie() throws IOException {
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireConditie/6.1.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireConditie/6.2.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireConditie/6.3.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireConditie/6.4.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireConditie/6.5.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/AcoperireConditie/6.6.in"));
        testClass.licenta("src/pachet1/AcoperireConditie/6.7.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.7.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.8.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.8.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.9.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.9.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.10.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.10.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.11.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.11.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.12.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.12.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.13.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.13.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.14.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.14.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.15.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.15.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.16.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.16.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.17.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.17.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.18.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.18.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/AcoperireConditie/6.19.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/AcoperireConditie/expected6.19.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }

    @Test
    public void CircuiteIndependente() throws IOException {
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/CircuiteIndependente/7.1.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/CircuiteIndependente/7.2.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/CircuiteIndependente/7.3.in"));
        assertThrows(IllegalArgumentException.class, () -> MyClass.licenta("src/pachet1/CircuiteIndependente/7.4.in"));
        testClass.licenta("src/pachet1/CircuiteIndependente/7.5.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/CircuiteIndependente/expected7.5.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/CircuiteIndependente/7.6.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/CircuiteIndependente/expected7.6.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }

    @Test
    public void Mutanti() throws IOException {
        testClass.licenta("src/pachet1/Mutanti/8.1.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/Mutanti/expected8.1.txt")),
                FileUtils.readLines(new File("licenta.out")));
        testClass.licenta("src/pachet1/Mutanti/8.2.in");
        Assert.assertEquals(FileUtils.readLines(new File("tests/pachet2/Mutanti/expected8.2.txt")),
                FileUtils.readLines(new File("licenta.out")));
    }


}
