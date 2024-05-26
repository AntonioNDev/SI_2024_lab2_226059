import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void checkCart() {
        assertTrue(SILab2.checkCart(new Item("1234567890", "Item1", 10, 0.1), 25));
        assertTrue(SILab2.checkCart(new Item("", "", 15, 0.2), 15));
        assertTrue(SILab2.checkCart((List<Item>) new Item(null, "Item3", 50, 0), 50));
    }
}
