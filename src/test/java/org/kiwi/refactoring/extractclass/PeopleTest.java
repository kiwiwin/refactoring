package org.kiwi.refactoring.extractclass;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PeopleTest {
    @Test
    public void shouldReturnPeopleInformation() {
        final People people = new People("people", "028", "80123456");
        assertThat(people.getInfo(), is("name: people, tel: 028-80123456"));
    }
}
