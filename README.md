# ObjectOrientedDesign-sample

Simon Huang

MAKE SURE DEPENDENCIES ARE INSTALLED
    - This program was written using JDK 1.8
    - Make sure JDK 1.8 is installed and added to the path
    - type java -version to make sure java is installed properly
    - Junit 4.10 is used for unit testing in this project (it is included in the zip)

HOW TO RUN:
    1) unzip project into desired location
    2) Open command prompt and cd into the unzipped project folder

    Running Program:
        Assuming user is in LifeInsurancePricingEstimator root directory
        1) cd to production folder - cd out\production\LifeInsurancePricingEstimator
        2) execute command java code.Main

    Running Unit Test:
        Assuming user is in LifeInsurancePricingEstimator root directory
        1) cd to production folder - cd out\production\LifeInsurancePricingEstimator
        2) execute command java java -cp <full path to junit jar>:. org.junit.runner.JUnitCore test.LifeInsuranceTest
        ex: java -cp /Users/Simon/Desktop/junit-4.10.jar:. org.junit.runner.JUnitCore test.LifeInsuranceTest


TRADEOFF/DESIGN DECISIONS
    - Main.java
        The main.java consists of the main method. The main method displays a command line prompt asking the user
        some information used for insurance calculations, and performs the calculations afterwards. I put this in
        it's own separate file to make is a little cleaner.

    - Person.java
        Every life insurance calculation requires a person entity for calculation. I created a person class that consists of
        the name, gender, age, health condition because these are the parameters used for the insurance calculation. Each of
        the variables are instance variables because each new person object requires these unique fields. In the
        future, if more information about a person is required for more complicated calculations, I can easily add more parameters
        the Person class. For the purpose of this assignment, I chose one HealthCondition instance variable, but in theory a user
        can have more than one health condition. A list of health condition for each person maybe more appropriate in a more
        real world application.

    - LifeInsurance.java
        The LifeInsurance class represents the lifeInsurance that is offered by TICKLE. Each LifeInsurance object requires a person object
        to be passed in it's constructor in order to determine the unique calculations for each life insurance. Passing the person object
        to the lifeInsurance constructor will limit us to only calculate insurance for 'person'. It might be better to have a parent entity class
        so the life and have person extend the parent class. With this, we can easily allow pet insurance in the future. For this assignment,
        having the person class alone should suffice.

    - LifeInsuranceEstimator.java
        The LifeInsuranceEstimator is responsible for calculating the life insurance. It's only responsibility is to execute the rules
        determined by the lifeInsurance object.

    -HealthCondition.java
        I choose to use enums to represent the health conditions as constants because there are no other
        information needed for Health Conditions other than the name of the condition. The pricing for the health
        condition is determined by the lifeInsurance object. This is the simplest approach for this assignment,
        but in the future if more information about a Health Condition is required then refactoring to classes will be required.