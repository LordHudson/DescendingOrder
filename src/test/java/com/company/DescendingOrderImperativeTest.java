package com.company;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DescendingOrderImperativeTest {

    @Test
    void sortIntInDescendingOrderImperative() {
        assertThat(DescendingOrderImperative.sortDesc(42145)).isEqualTo(54421);
        assertThat(DescendingOrderImperative.sortDesc(145263)).isEqualTo(654321);
        assertThat(DescendingOrderImperative.sortDesc(123456789)).isEqualTo(987654321);
        assertThat(DescendingOrderImperative.sortDesc(2110)).isEqualTo(2110);
    }

    @Test
    void sortIntInDescendingOrderDeclarative() {
        assertThat(DescendingOrderDeclarative.sortDesc(42145)).isEqualTo(54421);
        assertThat(DescendingOrderDeclarative.sortDesc(145263)).isEqualTo(654321);
        assertThat(DescendingOrderDeclarative.sortDesc(123456789)).isEqualTo(987654321);
        assertThat(DescendingOrderDeclarative.sortDesc(2110)).isEqualTo(2110);
    }
}