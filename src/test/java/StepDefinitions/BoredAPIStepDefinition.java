package StepDefinitions;

import BoredAPI.JavaHttpURLConnectionDemoBoredAPi;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class BoredAPIStepDefinition {

    @Given("^Given a given endpoint$")


    @When ("I hit it with (.*)")
    public void hittingBoredEndpoint()throws IOException {
        JavaHttpURLConnectionDemoBoredAPi connection ;
    }

    @And ("the response status is (.*)")
    public void isStatus200(int status)throws IOException{
        if (status == 200){

        }
    }

    @Then("the activity <activity type> correspond to (.*)")
    public void correspondToDescription(String description){

    }

    @And ("the number or participants is (.*)")
    public void correctParticipantNumber(String participants){

    }
}
