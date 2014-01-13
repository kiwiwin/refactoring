package org.kiwi.refactoring.replace.inheritance.with.delegation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ManagerTest {
    @Test
    public void shouldDisplay() {
        final Manager manager = new Manager("managerA");
        assertThat(manager.display(), is("I am manager: managerA"));
    }
}
