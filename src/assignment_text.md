# Lab exercise 1

## Problem 1 
(to be done by the tutor in cooperation with students)

Make the **TVset** class in package **p1**. This class should have: 

1. The **volume** attribute. The initial value for the volume is 0 (the sound is assumed to be off).

2. The **on** attribute. The initial value for the attribute is false (the TV is initially turned off).

3. The **channel** attribute. The initial value for the channel is 1.

4. The **increaseVolume** method that, when called, increases the volume by 1. 

5. The **decreaseVolume** method that, when called, decreases the volume by 1. 

6. The **turnDown** method that, when called, turns the volume down to 0 (decreases the volume level to 0).

7. The **turnOn** method that sets the value of the on to true (i.e., turns the TV on)

8. The **turnOff** method that sets the value of the on attribute to false (i.e., turns the TV off)

9. The **isOn** method that returns the value of the on attribute.

10. The **getVolume** method that returns the current value of the volume attribute.

11. The **setChannel** method that receives a new value for the channel as a parameter and sets the value of the channel attribute to the new value.

12. The **print** method that prints on the console the current value of all attributes, along with the corresponding message.

Create the **TestTVset** class in the **p1** package, with the **main** method that creates a TVset object and calls its methods: increaseVolume, print, turnOff and getVolume. Set the channel attribute to 5 (object, object initialization, main method, compilation and program running, examining attributes and calling methods).

## Problem 2 
(students work on it themselves)

Create the class **Radio** in package **p2**. This class should have:

1. The **on** attribute. The initial value for the attribute is false (the radio is initially turned off).

2. The **frequency** attribute. The starting value for the current frequency is 87.5 (megahertz).

3. The **increaseFrequency** method that increases the current frequency by 0.1 megahertz (for example, if the current frequency is 100.7 then it changes to 100.8).

4. The **decreaseFrequency** method that decreases the current frequency by 0.1 megahertz (for example, if the current frequency is 99.3 then it changes to 99.2).

5. The **setFrequency** method that receives a new value for the frequency as a parameter and sets the value of the frequency attribute to the new value.

6. The **getFrequency** method that returns the current value of the frequency attribute.

7. The **turnOn** method that sets the value of the on to true (i.e., turns the TV on)

8. The **turnOff** method that sets the value of the on attribute to false (i.e., turns the TV off)

9. The **isOn** method that returns the value of the on attribute.

10. The **print** method that prints on the console the current value of both attributes, along with the corresponding message.

Create the **TestRadio** class in the **p2** package, with the **main** method that creates a Radio object calls all its methods. After calling each method, invoke the print method and notice the differences in the current values of the attributes.