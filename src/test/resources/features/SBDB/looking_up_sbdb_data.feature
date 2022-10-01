Feature: Looking for close approach data


  Scenario: Looking for the sbdb close approach data
    When I look up at sbdp for close data api
    Then I can see the success status in response

  Scenario: Looking up for source in signature
    When I look up at sbdp for close data api
    Then I can see string in the NASA/JPL in source of signature
