package cov;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoverageDemoTest {


    void wheLT5_ThenDouble() {
        CoverageDemo coverageDemo=new CoverageDemo();
        int actual=coverageDemo.doubleIfLessThan5(4);

        assertThat(actual).isEqualTo(8);
    }

    @Test
    void whenGT5_Then_Same() {
        CoverageDemo coverageDemo=new CoverageDemo();
        int actual=coverageDemo.doubleIfLessThan5(6);

        assertThat(actual).isEqualTo(6);
    }

    @Test
    void whenEQ5_Then_Same() {
        CoverageDemo coverageDemo=new CoverageDemo();
        int actual=coverageDemo.doubleIfLessThan5(5);

        assertThat(actual).isEqualTo(5);
    }

    @Test
    void doubleIfLessOrEqualThan5Test() {
        CoverageDemo coverageDemo=new CoverageDemo();
        coverageDemo.doubleIfLessOrEqualThan5(1);
        coverageDemo.doubleIfLessOrEqualThan5(5);
        coverageDemo.doubleIfLessOrEqualThan5(100);

    }


    @Test
    void looping() {
        CoverageDemo coverageDemo=new CoverageDemo();
        coverageDemo.looping(3);

    }

    @Test
    void switchTest() {
        CoverageDemo coverageDemo=new CoverageDemo();
        coverageDemo.switching(1);
        coverageDemo.switching(2);
        coverageDemo.switching(100);

    }
}