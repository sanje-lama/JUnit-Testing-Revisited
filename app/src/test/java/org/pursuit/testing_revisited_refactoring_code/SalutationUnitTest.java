package org.pursuit.testing_revisited_refactoring_code;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pursuit.testing_revisited_refactoring_code.salutation.Salutation;

public class SalutationUnitTest {

    private Salutation salutation;

    //
    @Before
    public void setUp() throws Exception {
        salutation = Salutation.getInstance();
    }

    @Test
    public void check_full_name_method_not_null_with_valid_input() {
        String fullName = salutation.fullName("Ron Burgundy");
        Assert.assertNotNull(fullName);

    }

    @Test
    public void check_full_name_method_not_null_with_null_input() {
        String fullName = salutation.fullName(null);
        Assert.assertNotNull(fullName);
    }


    @Test
    public void check_split_name_for_inputs_with_first_last_name() {
        String fullName = "Ron Burgundy";
        String[] firstLastName = salutation.splitName(fullName);
        Assert.assertEquals("Ron", firstLastName[0]);
        Assert.assertEquals("Burgundy", firstLastName[firstLastName.length - 1]);
    }

    @Test
    public void check_split_name_for_inputs_with_longer_names() {
        String fullName = "Ron Carlos Archibald Ferdinand Burgundy";
        String[] firstLastName = salutation.splitName(fullName);
        Assert.assertEquals("Ron", firstLastName[0]);
        Assert.assertEquals("Burgundy", firstLastName[firstLastName.length - 1]);
    }

    @Test
    public void check_split_name_for_not_null_values() {
        String fullName = "Ron Carlos Archibald Ferdinand Burgundy";
        String[] firstLastName = salutation.splitName(fullName);
        Assert.assertNotNull(firstLastName[0]);
        Assert.assertNotNull(firstLastName[firstLastName.length - 1]);
    }

    @Test
    public void check_first_name_for_null_values() {
        String[] splitName = new String[]{"ron", "Burgundy"};
        String firstName = splitName[0];
        Assert.assertNotNull(salutation.firstName(splitName));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void check_last_name_for_null_values() {
        String[] splitName = new String[]{"Ron", null};
        String lastName = splitName[splitName.length - 1];
        Assert.assertNotNull(salutation.lastName(splitName), lastName);

    }

    @Test
    public void professionalSuffix() {
    }

    @Test
    public void hasPrefix() {
    }

    @Test
    public void professionalName() {
    }

    @Test
    public void yearsOfEducation() {
    }

    @Test
    public void careerBio() {
    }


    @After
    public void tearDown() throws Exception {
        salutation = null;


    }
}





