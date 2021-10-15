package codeWars.kyu6.Reducing_by_steps_20211015;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class OperarrayTest {

  @Test
  public void test1() {
    long[] a = new long[]{18, 69, -90, -78, 65, 40};

    long[] r = new long[]{18, 87, -3, -81, -16, 24};
    assertThat(Arrays.toString(Operarray.operArray(Operarray::som, a, 0)),
        is(Arrays.toString(r)));

    r = new long[]{18, 3, 3, 3, 1, 1};
    assertThat(Arrays.toString(Operarray.operArray(Operarray::gcdi, a, a[0])),
        is(Arrays.toString(r)));

    r = new long[]{18, 414, 2070, 26910, 26910, 107640};
    assertThat(Arrays.toString(Operarray.operArray(Operarray::lcmu, a, a[0])),
        is(Arrays.toString(r)));

    r = new long[]{18, 18, -90, -90, -90, -90};
    assertThat(Arrays.toString(Operarray.operArray(Operarray::mini, a, a[0])),
        is(Arrays.toString(r)));

    r = new long[]{18, 69, 69, 69, 69, 69};
    assertThat(Arrays.toString(Operarray.operArray(Operarray::maxi, a, a[0])),
        is(Arrays.toString(r)));
  }
}