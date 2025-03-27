package lifewithoutprimes;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolverTest {

    @Test
    void basicTestCases() {
        assertEquals(44, Solver.solve(10));
        assertEquals(169, Solver.solve(50));
        assertEquals(644, Solver.solve(100));
        assertEquals(896, Solver.solve(150));
        assertEquals(1060, Solver.solve(200));
        assertEquals(1668, Solver.solve(300));
        assertEquals(4084, Solver.solve(400));
        assertEquals(4681, Solver.solve(500));
        assertEquals(9110, Solver.solve(1000));
        assertEquals(18118, Solver.solve(2000));
        assertEquals(46166, Solver.solve(3000));
    }
}