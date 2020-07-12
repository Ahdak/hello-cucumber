# Author : Ahmed DAMMAK

  Feature: First feature addition

    Scenario Outline: Add 2 elements
      Given Two integers <firstInt> and <secondInt>
      When call sum
      Then return <expectedResult>
      Examples:
        | firstInt | secondInt | expectedResult |
        | 1        | 2         | 3              |
        | 0        | 4         | 4              |
