package com.cybertek.liberary.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("I am on the login page")
    public void I_am_on_the_login_page() {
        System.out.println("Going to the login page");
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        System.out.println("Logging in as a librarian");
    }


    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        System.out.println("verifying dashboard pages");
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        System.out.println("going to the login page");

    }

    @When("I login as an admin")
    public void i_login_as_an_admin() {
        System.out.println("logging as an admin");


    }
}