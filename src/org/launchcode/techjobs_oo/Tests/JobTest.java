package org.launchcode.techjobs_oo.Tests;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;


public class JobTest {
    Job jobOne;
    Job jobTwo;
    @Before
    public void createJobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
    }
}
