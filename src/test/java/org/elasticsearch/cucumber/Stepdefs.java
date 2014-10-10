package org.elasticsearch.cucumber;

import skeleton.Belly;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        Assert.assertEquals(3, 3);
    }

    @When("^I sit down$")
    public void i_sit_down() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        Assert.assertEquals(2, 3);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        Assert.assertEquals(4, 4);
    }
}
