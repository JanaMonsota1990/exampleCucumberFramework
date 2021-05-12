Feature: hit bored endpoint

  @test
  Scenario Outline: bored endpoint
    Given a given <endpoint>
    When I hit it with <activity type>
    And the response status is 200
    Then the activity <activity type> correspond to <description>
    And the number or participants is <participants>

    Examples:
      |endpoint                               | activity type   | description             |  participants
      |"https://www.boredapi.com/api/activity"| "recreational"  | "Watch a classic movie" |  1