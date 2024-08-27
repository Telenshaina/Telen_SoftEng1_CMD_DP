## Programming Challenge

Design a system that uses a special remote control to send commands to different devices. The key idea is to create a way for the remote control to control multiple devices without knowing the specifics of each device. Specifically:

Create a remote control that can send commands like "Power On" and "Power Off."

Implement separate commands for "Switch On" and "Switch Off."

Develop a system where devices (e.g., TV, stereo, lights) can respond to these commands. Each device should have its unique behavior for turning on and off.

Ensure that the remote control can send these commands to any device without knowing how each device works internally.

Your challenge is to apply a design pattern that allows this remote control to be flexible and extensible, enabling it to control various devices effortlessly. This should be achieved without the remote control having to understand the specific details of how each device operates.

## UML Diagram
![alt text](https://github.com/JerryEsperanza/SoftEng1_4BSCS2/blob/master/commandPattern/commandPatternImage.png?raw=true)

## Components

ViewerApp (Client): This represents an application used by viewers to control the TV. It interacts with the RemoteControl to send commands.

RemoteControl (Invoker): The RemoteControl acts as an invoker, receiving commands from the ViewerApp and executing them. It has a clickButton() method to invoke commands.

Command (Interface): An interface defining the execute() method, which concrete command objects must implement. It ensures that all concrete commands have an execute() method.

PowerOn (Concrete Command): A concrete command object representing the "power on" operation for the TV. It encapsulates the switchOn() method of the Tv object.

PowerOff (Concrete Command): A concrete command object representing the "power off" operation for the TV. It encapsulates the switchOff() method of the Tv object.

Tv (Receiver): The TV object represents the device being controlled. It has switchOn() and switchOff() methods to control its power state.

