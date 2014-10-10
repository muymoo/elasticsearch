Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl
    
  Scenario: a few more
    Given I have 30 cukes in my belly
    When I sit down
    Then my belly should growl
