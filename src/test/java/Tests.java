import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    private final int[]    mainArr = {123, 456, 234, 333, 765, 987, 635};
    private final int[] reverceArr = {635, 987, 765, 333, 234, 456, 123};
    private ArrayIndexStorage verifArr = new ArrayIndexStorage(mainArr);

    @Test
    public void ArrayIndexStorageTest() {
        Assertions.assertArrayEquals(mainArr, verifArr.getArr());
    }

    @Test
    public void SizeTest() {
        Assertions.assertEquals(mainArr.length, verifArr.size());
    }

    @Test
    public void ReverceTest() {
        Assertions.assertArrayEquals(reverceArr, verifArr.reverse());
    }

    @Test
    public void GetTest() {
        Assertions.assertTrue(mainArr[3] == verifArr.get(3));
    }
}
