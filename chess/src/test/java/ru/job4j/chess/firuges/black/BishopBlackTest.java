package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest extends TestCase {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }
    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E5);
        Figure bishopCopy = bishopBlack.copy(Cell.E5);
        assertThat(bishopCopy.position(), is(Cell.E5));

    }
    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way,is(expect));
    }
    @Test
    public void whenTestWayException() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.F3);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way,is(expect));
    }


}